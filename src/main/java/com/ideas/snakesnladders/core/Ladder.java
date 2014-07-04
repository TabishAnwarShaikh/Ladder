package com.ideas.snakesnladders.core;

/**
 * A Ladder object represents an assist to the Player, moving the Players Pin to
 * a higher board cell.
 * 
 */
public class Ladder {
	private final int endPosition;
	private final int startPosition;

	/**
	 * Creates a new Ladder object.
	 * 
	 * @param startPosition
	 *            - the cell position where the ladder starts from.
	 * 
	 * @param endPosition
	 *            - the cell position where the ladder ends.
	 * 
	 */
	public Ladder(int startPosition, int endPosition) {
		this.startPosition = startPosition;
		this.endPosition = endPosition;
		validate();
	}

	/**
	 * Retrieves position of the cell where the ladder ends.
	 * 
	 * @return - the cell position
	 */
	public int endPosition() {
		return this.endPosition;
	}

	/**
	 * Retrieves position of the cell where the ladder starts.
	 * 
	 * @return - the cell position
	 */
	public int startPosition() {
		return this.startPosition;
	}

	/**
	 * This method is used to get the String representation of the Ladder.
	 * 
	 * @return - the Ladder as a String.
	 */
	@Override
	public String toString() {
		return "Ladder [startPosition=" + startPosition + ", endPosition=" + endPosition + "]";
	}

	private void validate() {
		if (this.startPosition < 0) {
			throw new IllegalArgumentException("Starting position cannot be less then zero");
		}

		if (this.startPosition > endPosition) {
			throw new IllegalArgumentException("Starting position cannot be greater then Ending position");
		}
	}
}
