package com.ideas.snakesnladders;

import java.util.Scanner;

/**
 * A GameEngine object is the controller of the Snakes and Ladders game,
 * defining its flow and outcome.
 * <p>
 * A GameEngine object goes through four states
 * <ul>
 * <li>Start State, see {@link StartState}
 * <li>Setup State, see {@link SetupState}
 * <li>Running State, see {@link RunningState}
 * <li>Stop State, see {@link StopState}
 * 
 * 
 */
public class GameEngine {
	private State state;

	Configuration configuration;

	Scanner scanInput = new Scanner(System.in);

	public static void main(String... args) {
		GameEngine gameEngine = new GameEngine();
		gameEngine.run();
	}

	public GameEngine() {
		this.state = new StartState();
	}

	public Configuration getConfiguration() {
		return this.configuration;
	}

	public State getState() {
		return state;
	}

	public Scanner getScanner() {
		return this.scanInput;
	}

	public void run() {
		state.run(this);
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public void setState(State state) {
		this.state = state;
		run();
	}

}
