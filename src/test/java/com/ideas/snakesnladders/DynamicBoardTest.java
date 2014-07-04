package com.ideas.snakesnladders;

import junit.framework.TestCase;

import org.junit.Test;

import com.ideas.snakesnladders.core.DynamicBoardBuilder;

public class DynamicBoardTest extends TestCase {

	@Test
	public void test() {

		int numberOfRows = 10;
		int numberOfColumns = 10;
		int numberOfSnakes = 7;
		int numberOfLadders = 7;

		DynamicBoardBuilder builder = new DynamicBoardBuilder(numberOfRows, numberOfColumns, numberOfSnakes, numberOfLadders);

		int board[] = builder.build();

		assertTrue(board.length == (numberOfColumns * numberOfRows));
		int snakeCount =0;
		for(int i=0 ; i < board.length ;i++)
		{
			if(board[i] < 0)
				snakeCount++;			
		}
		assertEquals(numberOfSnakes, snakeCount);
		
		int ladderCount =0;
		for(int i=0 ; i < board.length ;i++)
		{
			if(board[i] > 0)
				ladderCount++;			
		}
		assertEquals(numberOfLadders, ladderCount);
		
		
		
	}

}
