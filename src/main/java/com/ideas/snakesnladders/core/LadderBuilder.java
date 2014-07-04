package com.ideas.snakesnladders.core;

import java.util.Random;

/**
 * Builder class helping the creation of dynamic {@link Ladder}.
 * 
 */
public class LadderBuilder {
	private final int numberOfColumns;
	private final int numberOfRows;

	/**
	 * Creates a new LadderBuilder object.
	 * 
	 * @param numberOfRows
	 *            - the number of rows on the board.
	 * 
	 * @param numberOfColumns
	 *            - the number of columns on the board.
	 * 
	 */
	public LadderBuilder(int numberOfRows, int numberOfColumns) {
		this.numberOfRows = numberOfRows;
		this.numberOfColumns = numberOfColumns;
	}

	/**
	 * Creates a random {@link Ladder} based on the number of cells on the board
	 * 
	 * @return - the Ladder object
	 */
	public Ladder build() {
		int maxValue = numberOfRows * numberOfColumns;
		Random random = new Random();

		int startPosition = 0;
		while ((startPosition > (maxValue - (numberOfColumns + 2))) || (startPosition == 0))
			startPosition = random.nextInt(maxValue);

		int endPosition = 0;

		while ((endPosition < startPosition) || ((endPosition - startPosition) < numberOfColumns))
			endPosition = random.nextInt(maxValue);

		return new Ladder(startPosition, endPosition);
	}
}
