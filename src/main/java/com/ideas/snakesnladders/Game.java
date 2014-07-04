package com.ideas.snakesnladders;

import java.util.ArrayList;
import java.util.List;

import com.ideas.snakesnladders.core.Board;
import com.ideas.snakesnladders.core.CellState;
import com.ideas.snakesnladders.core.Dice;
import com.ideas.snakesnladders.core.Pin;
import com.ideas.snakesnladders.core.Player;

/**
 * The heart of the Snakes and Ladders game.
 * <p>
 * 
 * 
 * 
 */

public class Game {

	private List<Player> players = new ArrayList<Player>();
	Board board;
	Dice dice;

	/**
	 * Starts the game execution.
	 * <p>
	 * Iterates through the Players and on their behalf rolls dice and moves
	 * their pin to the new cell position.
	 * <p>
	 * Evaluates current cell position and moves accordingly.
	 * <p>
	 * Once the Player has reached the board's wining position, the game is
	 * over.
	 */
	void play() {
		boolean endOfGame = false;
		int newCellPosition;
		while (!endOfGame) {
			for (Player player : players) {
				System.out.println(Constants.GAME_ROLLING_DICE_MESSAGE + player);
				newCellPosition = player.rollDice(this.dice) + player.pin().cell();

				while (newCellPosition < board.winingPosition()) {

					player.movePin(newCellPosition);

					if (board.evalCellState(newCellPosition) == CellState.LADDERASSIST) {
						System.out.println(Constants.GAME_LADDER_ASSIST_MESSAGE + board.cellValue(newCellPosition));
						newCellPosition = player.pin().cell() + board.cellValue(player.pin().cell());
						player.movePin(newCellPosition);
					}
					if (board.evalCellState(newCellPosition) == CellState.SNAKEBITE) {
						System.out.println(Constants.GAME_SNAKEBITE_MESSAGE + board.cellValue(newCellPosition));
						newCellPosition = player.pin().cell() + board.cellValue(player.pin().cell());
						player.movePin(newCellPosition);
					}
					if (board.evalCellState(newCellPosition) == CellState.NORMAL)
						break;
				}
				if (newCellPosition == board.winingPosition()) {
					player.movePin(newCellPosition);
					System.out.println(player + Constants.GAME_WINING_MESSAGE);
					endOfGame = true;
					break;
				}
			}
		}
	}

	void setUpPlayers(int playerCount) {
		for (int i = 1; i <= playerCount; i++)
			players.add(new Player("Player" + i, new Pin(1)));
	}

}
