package com.ideas.snakesnladders.core;

/**
 * 
 * Enum defining the state of the cell.
 * 
 */
public enum CellState {
	/**
	 * Default cell
	 */
	NORMAL,
	/**
	 * A Snake bite exists on this cell.
	 */
	SNAKEBITE,
	/**
	 * A Ladder assist exists on this cell.
	 */
	LADDERASSIST
}
