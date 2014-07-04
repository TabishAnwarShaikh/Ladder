package com.ideas.snakesnladders.core;

import java.util.Arrays;

/**
 * A object defining the actual board that is used in the Snakes & Ladders Game
 * 
 * 
 * 
 */
public class Board {
	private final int[] board;

	/**
	 * Creates a new Board object.
	 * 
	 * @param builder
	 *            - Builder class for building the board depending on the type
	 *            of game, either {@link StaticBoardBuilder} or
	 *            {@link DynamicBoardBuilder}
	 */
	public Board(BoardBuilder builder) {
		this.board = builder.build();
	}

	/**
	 * Returns the value/contents of the queried cell
	 * 
	 * @param cell
	 *            - the position of the cell on the board.
	 * 
	 * @return the cell value
	 */
	public int cellValue(int cell) {
		return board[cell];
	}

	/**
	 * Evaluates the state of a cell.
	 * 
	 * @param cell
	 *            - the position of the cell on the board.
	 * 
	 * @return the state of the cell {@link CellState}
	 */
	public CellState evalCellState(int cell) {
		if (board[cell] < 0) {
			return CellState.SNAKEBITE;
		}

		if (board[cell] > 0) {
			return CellState.LADDERASSIST;
		}

		return CellState.NORMAL;
	}

	/**
	 * Returns the String representation of the object.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Board [board=" + Arrays.toString(board) + "]";
	}

	/**
	 * Returns the wining position on the board.
	 * <p>
	 * This position is = number of rows * number of columns
	 * 
	 * 
	 * @return the wining position of the board.
	 */
	public int winingPosition() {
		return board.length;
	}

	public void print() {
		final String ladderString = "L";
		final String snakeString = "S";
		final String openBrackets = "(";
		final String closeBrackets = ")";
		final String cellSperator = ",";		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('{');

		int i = 0;
		do {
			if (board[i] > 0)
				stringBuilder.append(ladderString + openBrackets + board[i] + closeBrackets);
			if (board[i] < 0)
				stringBuilder.append(snakeString + openBrackets + board[i] + closeBrackets);
			if (board[i] == 0)
				stringBuilder.append(i);
			stringBuilder.append(cellSperator);
			i++;
		} while (i < board.length);

		stringBuilder.append('}');

		System.out.println(stringBuilder.toString());
	}
}
