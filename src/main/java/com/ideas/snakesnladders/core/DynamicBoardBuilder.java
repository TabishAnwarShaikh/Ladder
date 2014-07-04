package com.ideas.snakesnladders.core;

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
	 * @param snakes
	 *            - the total number of snakes on the board.
	 * 
	 * @param ladders
	 *            - the total number of ladders on the board.
	 * 
	 */
	public DynamicBoardBuilder(int numberOfRows, int numberOfColumns, List<Snake> snakes, List<Ladder> ladders) {
		this.numberOfSquares = numberOfRows * numberOfColumns;
		board = new int[this.numberOfSquares];
		initializeBoard();

		for (Snake snake : snakes) {
			if ((snake.startPosition() > numberOfColumns) && (snake.endPosition() >= 1)) {
				board[snake.startPosition()] = -(snake.startPosition() - snake.endPosition());
			}
		}

		for (Ladder ladder : ladders) {
			if ((ladder.startPosition() > 1) && (ladder.endPosition() < numberOfSquares)) {
				board[ladder.startPosition()] = (ladder.endPosition() - ladder.startPosition());
			}
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
