package com.ideas.snakesnladders.core;

import java.util.Random;

import com.ideas.snakesnladders.Constants;

/**
 * A Dice object representing the dice used in the game.
 * 
 * 
 */
public class Dice {
	private int maxValue = Constants.DICE_DEFAULT_MAX_VALUE;
	private int minValue = Constants.DICE_DEFAULT_MIN_VALUE;

	/**
	 * Creates a new Dice object.
	 * 
	 * @param minValue
	 *            the minimum value on the dice.
	 * 
	 * @param maxValue
	 *            the maximum value on the dice.
	 * 
	 */
	public Dice(int minValue, int maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
		validate();
	}

	/**
	 * Creates a new Dice object, with default values
	 * 
	 */
	public Dice() {

	}

	/**
	 * Gets the maximum value of the dice
	 * 
	 * @return the maximum value
	 */

	public int maxValue() {
		return maxValue;
	}

	/**
	 * Gets the minimum value of the dice
	 * 
	 * @return the minimum value
	 */
	public int minValue() {
		return minValue;
	}

	/**
	 * Emulates rolling of a dice and returns a value between the min and max
	 * value of the dice.
	 * 
	 * @return the outcome of the roll.
	 */
	public int roll() {
		int outcome;
		Random random = new Random();
		outcome = random.nextInt(maxValue);

		if (outcome < minValue) {
			outcome = minValue;
		}

		return outcome;
	}

	private void validate() {
		if ((this.minValue == 0) || (this.maxValue == 0)) {
			throw new IllegalArgumentException(Constants.DICE_MIN_MAX_ZERO_ERROR);
		}

		if (this.maxValue < this.minValue) {
			throw new IllegalArgumentException(Constants.DICE_MIN_MAX_ERROR);
		}
	}
}
