package com.ideas.snakesnladders;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.ideas.snakesnladders.core.DynamicBoardBuilder;
import com.ideas.snakesnladders.core.Ladder;
import com.ideas.snakesnladders.core.LadderBuilder;
import com.ideas.snakesnladders.core.Snake;
import com.ideas.snakesnladders.core.SnakeBuilder;

public class DynamicBoardTest extends TestCase {

	@Test
	public void test() {

		int numberOfRows = 10;
		int numberOfColumns = 10;
		SnakeBuilder snakeBuilder = new SnakeBuilder(numberOfRows, numberOfColumns);
		LadderBuilder ladderBuilder = new LadderBuilder(numberOfRows, numberOfColumns);
		List<Snake> snakes = new ArrayList<Snake>();
		List<Ladder> ladders = new ArrayList<Ladder>();
		for (int i = 0; i < 5; i++) {
			snakes.add(snakeBuilder.build());
			ladders.add(ladderBuilder.build());
		}

		DynamicBoardBuilder builder = new DynamicBoardBuilder(numberOfRows, numberOfColumns, snakes, ladders);

		int board[] = builder.build();

		assertTrue(board.length == (numberOfColumns * numberOfRows));
		for (Snake snake : snakes)
			assertTrue(board[snake.startPosition()] == -(snake.startPosition() - snake.endPosition()));
		for (Ladder ladder : ladders)
			assertTrue(board[ladder.startPosition()] == (ladder.endPosition() - ladder.startPosition()));

	}

}
