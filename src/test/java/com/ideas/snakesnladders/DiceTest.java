package com.ideas.snakesnladders;

import junit.framework.TestCase;

import org.junit.Test;

import com.ideas.snakesnladders.core.Dice;

public class DiceTest extends TestCase {

	@Test
	public void testDefaultDice() {
		Dice dice = new Dice();
		for (int i = 0; i < 100; i++) {
			assertTrue(dice.roll() <= dice.maxValue());
		}
		for (int i = 0; i < 100; i++) {
			assertTrue(dice.roll() >= dice.minValue());
		}
	}

	@Test
	public void testConfiguredDice() {
		Dice dice = new Dice(1, 10);
		for (int i = 0; i < 100; i++) {
			assertTrue(dice.roll() <= dice.maxValue());
		}
		for (int i = 0; i < 100; i++) {
			assertTrue(dice.roll() >= dice.minValue());
		}
	}

}
