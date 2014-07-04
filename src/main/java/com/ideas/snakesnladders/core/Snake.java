package com.ideas.snakesnladders.core;

/**
 * A Snake object represents an fall to the Player, moving the Players Pin to a
 * lower board cell.
 * 
 */
public class Snake {
	private final int endPosition;
	private final int startPosition;

	/**
	 * Creates a new Snake object.
	 * 
	 * @param startPosition
	 *            - the cell position where the snake starts from.
	 * 
	 * @param endPosition
	 *            - the cell position where the snake ends.
	 */
	public Snake(int startPosition, int endPosition) {
		this.startPosition = startPosition;
		this.endPosition = endPosition;
		validate();
	}

	/**
	 * Retrieves position of the cell where the snake ends.
	 * 
	 * @return - the cell position!
	 */
	public int endPosition() {
		return this.endPosition;
	}

	/**
	 * Retrieves position of the cell where the snake starts.
	 * 
	 * @return - the cell position
	 */
	public int startPosition() {
		return this.startPosition;
	}

	/**
	 * This method is used to get the String representation of the Snake.
	 * 
	 * @return - the Snake as a String.
	 */
	@Override
	public String toString() {
		return "Snake [startPosition=" + startPosition + ", endPosition=" + endPosition + "]";
	}

	private void validate() {
		if (this.startPosition < 0) {
			throw new IllegalArgumentException("Starting position cannot be less then zero");
		}

		if (this.startPosition < endPosition) {
			throw new IllegalArgumentException("Starting position cannot be lesser then Ending position");
		}
	}
}
