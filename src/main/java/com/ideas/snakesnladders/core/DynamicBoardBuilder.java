package com.ideas.snakesnladders.core;

import java.util.ArrayList;
import java.util.List;

import com.ideas.snakesnladders.Configuration;

/**
 * Build a {@link Board} using a {@link Configuration}.
 * 
 * 
 */
public class DynamicBoardBuilder implements BoardBuilder {
	private final int[] board;
	private final int numberOfSquares;

	/**
	 * Creates a new DynamicBoardBuilder object.
	 * 
	 * @param numberOfRows
	 *            - the total number of rows on the board
	 * 
	 * @param numberOfColumns
	 *            - the total number of columns on the board.
	 * 
	 * @param numberOfSnakes
	 *            - the total number of snakes on the board.
	 * 
	 * @param numberOfLadders
	 *            - the total number of ladders on the board.
	 * 
	 */
	public DynamicBoardBuilder(int numberOfRows, int numberOfColumns, int numberOfSnakes, int numberOfLadders) {
		this.numberOfSquares = numberOfRows * numberOfColumns;
		board = new int[this.numberOfSquares];
		initializeBoard();

		List<Snake> snakes = new ArrayList<Snake>();
		SnakeBuilder snakeBuilder = new SnakeBuilder(numberOfRows, numberOfColumns);
		for (int i = 0; i < numberOfSnakes; i++) {

			// We need to check if the start positions don't overlap, else we
			// have side effects.
			while (true) {
				boolean uniqueSnake = true;
				Snake newSnake = snakeBuilder.build();
				for (Snake snake : snakes) {
					if (snake.startPosition() == newSnake.startPosition())
						uniqueSnake = false;
				}
				if (uniqueSnake) {
					snakes.add(newSnake);
					break;
				}
			}
		}
		

		List<Ladder> ladders = new ArrayList<Ladder>();
		LadderBuilder ladderBuilder = new LadderBuilder(numberOfRows, numberOfColumns);
		for (int i = 0; i < numberOfLadders; i++) {
			// We need to check if the start positions don't overlap, else we
			// have side effects.
			while (true) {
				boolean uniqueLadder = true;
				Ladder newLadder = ladderBuilder.build();
				for (Snake snake : snakes) {
					if (snake.startPosition() == newLadder.startPosition())
						uniqueLadder = false;
				}
				for (Ladder ladder : ladders) {
					if (ladder.startPosition() == newLadder.startPosition())
						uniqueLadder = false;
				}
				if (uniqueLadder) {
					ladders.add(newLadder);
					break;
				}
			}
		}

		for (Snake snake : snakes) {
			//System.out.println(snake);
			board[snake.startPosition()] = -(snake.startPosition() - snake.endPosition());
		}

		for (Ladder ladder : ladders) {
			//System.out.println(ladder);
			board[ladder.startPosition()] = (ladder.endPosition() - ladder.startPosition());

		}

	}

	/**
	 * Creates the array representation of a board
	 * 
	 * @return -the array representing the board cells and its values.
	 */
	public int[] build() {
		return board;
	}

	private void initializeBoard() {
		for (int i = 0; i < this.numberOfSquares; i++)
			board[i] = 0;
	}

	/**
	 * This method is used to get the String representation of the board.
	 * 
	 * @return a String representation of the board.
	 */
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('{');

		for (int i = 0; i < numberOfSquares; i++) {
			stringBuilder.append(board[i]);

			if (i < numberOfSquares) {
				stringBuilder.append(',');
			}
		}

		stringBuilder.append('}');

		return stringBuilder.toString();
	}
}
