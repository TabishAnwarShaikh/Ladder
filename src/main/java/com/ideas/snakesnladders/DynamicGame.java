package com.ideas.snakesnladders;

import com.ideas.snakesnladders.core.Board;
import com.ideas.snakesnladders.core.BoardBuilder;
import com.ideas.snakesnladders.core.Dice;
import com.ideas.snakesnladders.core.DynamicBoardBuilder;

/**
 * A Snakes & Ladders game that can be configured based on the
 * {@link Configuration} object.
 * <p>
 * This game uses a {@link DynamicBoardBuilder} to setup the board.
 * 
 * 
 */
public class DynamicGame extends Game {

	private final Configuration configuration;

	public DynamicGame(Configuration configuration) {
		this.configuration = configuration;
		validate();
		BoardBuilder builder = new DynamicBoardBuilder(configuration.getNumberOfRows(),
				configuration.getNumberOfColumns(), configuration.getNumberOfSnakes(),
				configuration.getNumberOfLadders());
		board = new Board(builder);
		dice = new Dice();
		setUpPlayers(configuration.getNumberOfPlayers());
	}

	private void validate() {
		if (this.configuration == null)
			throw new IllegalArgumentException(Constants.DYNAMIC_GAME_CONFIGURATION_EXCEPTION);
	}
}
