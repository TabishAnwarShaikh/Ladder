package com.ideas.snakesnladders.core;

import java.util.Random;

/**
 * Builder class helping the creation of dynamic {@link Snake}.
 * 
 */
public class SnakeBuilder {
	private final int numberOfColumns;
	private final int numberOfRows;

	/**
	 * Creates a new SnakeBuilder object.
	 * 
	 * @param numberOfRows
	 *            - the number of rows on the board.
	 * 
	 * @param numberOfColumns
	 *            - the number of columns on the board.
	 */
	public SnakeBuilder(int numberOfRows, int numberOfColumns) {
		this.numberOfRows = numberOfRows;
		this.numberOfColumns = numberOfColumns;
	}

	/**
	 * Creates a random {@link Snake} based on the number of cells on the board
	 * 
	 * @return - the Snake object
	 */
	public Snake build() {
		int maxValue = numberOfRows * numberOfColumns;
		Random random = new Random();

		int startPosition = 0;
		while (startPosition <= (numberOfColumns + 2))
			startPosition = random.nextInt(maxValue);

		int endPosition = 0;

		while ((endPosition > startPosition) || (endPosition == 0)
				|| ((startPosition - endPosition) <= numberOfColumns))
			endPosition = random.nextInt(maxValue);
		
		return new Snake(startPosition, endPosition);
	}
}
