package com.ideas.snakesnladders.core;

/**
 * Build a {@link Board} using a predefined board.
 */
public class StaticBoardBuilder implements BoardBuilder {
	final int[] board = { 0, 0, 0, 10, 0, 0, 0, 0, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, -10, 0, 0, 18, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 56, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 17, 0, 0, -20, 0, 0, 0, 0, 0, 0, 0, 0, 0, -43,
			18, -4, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -63, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -20, 0, -20, 0, 0, 0, -21, 0, 0, 0, };

	/**
	 * Creates an array representation of a board
	 * 
	 * @return - the array representing the board cells and its values.
	 */
	public int[] build() {
		return board;
	}
}
