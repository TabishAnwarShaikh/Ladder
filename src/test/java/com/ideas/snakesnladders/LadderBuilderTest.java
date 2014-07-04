package com.ideas.snakesnladders;

import junit.framework.TestCase;

import org.junit.Test;

import com.ideas.snakesnladders.core.Ladder;
import com.ideas.snakesnladders.core.LadderBuilder;

public class LadderBuilderTest extends TestCase {

	@Test
	public void test() {

		int numberOfRows = 10;
		int numberOfCols = 10;

		LadderBuilder builder = new LadderBuilder(numberOfRows, numberOfCols);
		for (int i = 0; i < 100; i++) {
			Ladder ladder = builder.build();
			assertTrue(ladder.startPosition() < ladder.endPosition());
			assertTrue(ladder.endPosition() - ladder.startPosition() >= numberOfCols);
			assertTrue(ladder.endPosition() != 0);
			assertTrue(ladder.startPosition() <= (numberOfCols * numberOfRows));
		}
		
	}

}
