package com.ideas.snakesnladders;

import junit.framework.TestCase;

import org.junit.Test;

import com.ideas.snakesnladders.core.Snake;
import com.ideas.snakesnladders.core.SnakeBuilder;

public class SnakeBuilderTest extends TestCase {

	@Test
	public void test() {

		int numberOfRows = 10;
		int numberOfCols = 10;

		SnakeBuilder builder = new SnakeBuilder(numberOfRows, numberOfCols);
		for (int i = 0; i < 100; i++) {
			Snake snake = builder.build();
			assertTrue(snake.startPosition() > snake.endPosition());
			assertTrue(snake.startPosition() - snake.endPosition() > numberOfCols);
			assertTrue(snake.endPosition() != 0);
		}
	}

}
