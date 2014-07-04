package com.ideas.snakesnladders.core;

/**
 * A Player object emulates an actual person.
 * 
 */
public class Player {
	private final Pin pin;
	private final String name;

	/**
	 * Creates a new Player object.
	 * 
	 * @param name
	 *            - the name of the Player
	 * 
	 * @param pin
	 *            - the {@link Pin} of the Player
	 * 
	 */
	public Player(String name, Pin pin) {
		this.name = name;
		this.pin = pin;
	}

	/**
	 * Moves the Pin of the Player to the cell position.
	 * 
	 * @param cell
	 *            - the cell position
	 */
	public void movePin(int cell) {
		pin.move(cell);
	}

	/**
	 * Gets the name of the Player
	 * 
	 * @return - Players name.
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Gets the Pin of the Player
	 * 
	 * @return - Players Pin
	 */
	public Pin pin() {
		return this.pin;
	}

	/**
	 * Emulates the act of rolling the dice by the Player
	 * 
	 * @param dice
	 *            - the {@link Dice} object *
	 * 
	 * @return - the outcome of the dice roll.
	 */
	public int rollDice(Dice dice) {
		return dice.roll();
	}

	/**
	 * Gets the String representation of the Player
	 * 
	 * @return - Player object as a String.
	 */
	@Override
	public String toString() {
		return "Player [name=" + name + ", pin=" + pin + "]";
	}
}
