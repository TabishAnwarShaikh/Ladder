package com.ideas.snakesnladders.core;

/**
 * A Pin object helps to track the progress of a Player.
 * 
 */
public class Pin {
	private int cell;

	/**
	 * Creates a new Pin object.
	 * 
	 * @param initialCell
	 *            - the cell on the board where the Pin should be placed
	 *            initially.
	 * 
	 */
	public Pin(int initialCell) {
		this.cell = initialCell;
	}

	/**
	 * Retrieves the cell on which the Pin currently rests.
	 * 
	 * @return - the value of the cell.
	 */
	public int cell() {
		return cell;
	}

	/**
	 * Moves the Pin to a cell on the board.
	 * 
	 * @param cell
	 *            - the cell to which the Pin will be moved.
	 * 
	 */
	public void move(int cell) {
		this.cell = cell;
		System.out.println("Moved pin to cell:" + this.cell);
	}

	/**
	 * Retrieves the String representation of the Pin
	 * 
	 * @return - Pin object as a String.
	 */
	@Override
	public String toString() {
		return "Pin [cell=" + cell + "]";
	}
}
