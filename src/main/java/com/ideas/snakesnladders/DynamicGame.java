package com.ideas.snakesnladders;

import java.util.ArrayList;
import java.util.List;

import com.ideas.snakesnladders.core.Board;
import com.ideas.snakesnladders.core.BoardBuilder;
import com.ideas.snakesnladders.core.Dice;
import com.ideas.snakesnladders.core.DynamicBoardBuilder;
import com.ideas.snakesnladders.core.Ladder;
import com.ideas.snakesnladders.core.LadderBuilder;
import com.ideas.snakesnladders.core.Snake;
import com.ideas.snakesnladders.core.SnakeBuilder;

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
				configuration.getNumberOfColumns(), getSnakeResources(), getLadderResources());
		board = new Board(builder);
		dice = new Dice();
		setUpPlayers(configuration.getNumberOfPlayers());
	}

	private List<Ladder> getLadderResources() {
		List<Ladder> ladders = new ArrayList<Ladder>();
		LadderBuilder builder = new LadderBuilder(configuration.getNumberOfRows(), configuration.getNumberOfColumns());
		for (int i = 0; i < configuration.getNumberOfLadders(); i++) {
			ladders.add(builder.build());
		}
		return ladders;
	}

	private List<Snake> getSnakeResources() {
		List<Snake> snakes = new ArrayList<Snake>();
		SnakeBuilder builder = new SnakeBuilder(configuration.getNumberOfRows(), configuration.getNumberOfColumns());
		for (int i = 0; i < configuration.getNumberOfSnakes(); i++) {
			snakes.add(builder.build());
		}
		return snakes;
	}

	private void validate() {
		if (this.configuration == null)
			throw new IllegalArgumentException(Constants.DYNAMIC_GAME_CONFIGURATION_EXCEPTION);
	}
}
