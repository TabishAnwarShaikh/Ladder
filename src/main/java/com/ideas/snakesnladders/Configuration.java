package com.ideas.snakesnladders;

/**
 * A Configuration object is responsible for stating
 * <ul>
 * <li>Number of Rows on the Board.
 * <li>Number of Columns on the Board.
 * <li>Number of Snakes.
 * <li>Number of Ladders.
 * <li>Number of Players.
 * <p>
 * <p>
 * A Configuration object is required for running the game in Dynamic Mode.<br>
 * All variables of the Configuration object are non zero integers.
 * 
 * 
 */
public class Configuration {

	public static class Builder {
		private int numberOfRows;
		private int numberOfColumns;
		private int numberOfSnakes;
		private int numberOfLadders;
		private int numberOfPlayers;

		public Configuration build() {
			if (this.numberOfColumns <= 0)
				throw new IllegalArgumentException(Constants.COLUMNS_NUMBER_ERROR);
			if (this.numberOfRows <= 0)
				throw new IllegalArgumentException(Constants.ROW_NUMBER_ERROR);
			if (this.numberOfSnakes <= 0)
				throw new IllegalArgumentException(Constants.SNAKES_NUMBER_ERROR);
			if (this.numberOfLadders <= 0)
				throw new IllegalArgumentException(Constants.LADDERS_NUMBER_ERROR);
			if (this.numberOfPlayers <= 0)
				throw new IllegalArgumentException(Constants.PLAYERS_NUMBER_ERROR);
			return new Configuration(this);
		}

		public Builder numberOfColumns(int numberOfColumns) {
			this.numberOfColumns = numberOfColumns;
			return this;
		}

		public Builder numberOfLadders(int numberOfLadders) {
			this.numberOfLadders = numberOfLadders;
			return this;
		}

		public Builder numberOfPlayers(int numberOfPlayers) {
			this.numberOfPlayers = numberOfPlayers;
			return this;
		}

		public Builder numberOfRows(int numberOfRows) {
			this.numberOfRows = numberOfRows;
			return this;
		}

		public Builder numberOfSnakes(int numberOfSnakes) {
			this.numberOfSnakes = numberOfSnakes;
			return this;
		}

	}

	final private int numberOfRows;
	final private int numberOfColumns;
	final private int numberOfSnakes;
	final private int numberOfLadders;
	final private int numberOfPlayers;

	private Configuration(Builder builder) {
		this.numberOfColumns = builder.numberOfColumns;
		this.numberOfRows = builder.numberOfRows;
		this.numberOfSnakes = builder.numberOfSnakes;
		this.numberOfLadders = builder.numberOfLadders;
		this.numberOfPlayers = builder.numberOfPlayers;
	}

	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	public int getNumberOfLadders() {
		return numberOfLadders;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public int getNumberOfSnakes() {
		return numberOfSnakes;
	}

	@Override
	public String toString() {
		return "Configuration [numberOfRows=" + numberOfRows + ", numberOfColumns=" + numberOfColumns
				+ ", numberOfSnakes=" + numberOfSnakes + ", numberOfLadders=" + numberOfLadders + ", numberOfPlayers="
				+ numberOfPlayers + "]";
	}

}
