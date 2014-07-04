package com.ideas.snakesnladders;

/**
 * 
 * State object that represents the running state of the GameEngine.
 * 
 * <p>
 * If the {@link GameEngine} has a valid {@link Configuration} the inputs from
 * the Configuration will be taken to create a dynamic game
 * 
 * 
 */
public class RunningState implements State {

	@Override
	public void run(GameEngine context) {

		if (context.configuration != null) {
			System.out.println(Constants.SEPERATOR);
			System.out.println(Constants.DYNAMIC_GAME_HEADER);
			System.out.println(context.getConfiguration());
			System.out.println(Constants.SEPERATOR);
			DynamicGame game = new DynamicGame(context.getConfiguration());
			game.play();
			context.setState(new StartState());
		} else {
			System.out.println(Constants.SEPERATOR);
			System.out.println(Constants.STATIC_GAME_HEADER);
			System.out.println(Constants.SEPERATOR);
			StaticGame game = new StaticGame();
			game.play();
			context.setState(new StartState());
		}

	}

}
