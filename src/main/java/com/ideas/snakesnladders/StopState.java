package com.ideas.snakesnladders;

/**
 * 
 * State object that represents the stop state of the GameEngine.
 * 
 */
public class StopState implements State {

	@Override
	public void run(GameEngine context) {
		System.out.println(Constants.GOODBYE_MESSAGE);
		context.getScanner().close();
		System.exit(0);
	}
}
