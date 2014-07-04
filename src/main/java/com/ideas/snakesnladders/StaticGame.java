package com.ideas.snakesnladders;

import com.ideas.snakesnladders.core.Board;
import com.ideas.snakesnladders.core.BoardBuilder;
import com.ideas.snakesnladders.core.Dice;
import com.ideas.snakesnladders.core.StaticBoardBuilder;

/**
 * A Snakes & Ladders game that runs on a predefined board setup using the
 * {@link StaticBoardBuilder} and two players
 * 
 * 
 */
public class StaticGame extends Game {

	public StaticGame() {
		BoardBuilder builder = new StaticBoardBuilder();
		board = new Board(builder);
		board.print();
		dice = new Dice();
		setUpPlayers(2);
	}
}
