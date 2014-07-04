package com.ideas.snakesnladders;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * State object that represents the configuration state of the GameEngine.
 * <p>
 * It is mandatory for the GameEngine to transit to this state before running in
 * dynamic mode.
 * <p>
 * The outcome of this state is the {@link Configuration} object that acts as
 * the input for the {@link DynamicGame}
 * 
 */
public class SetupState implements State {

	@Override
	public void run(GameEngine context) {
		int rows = 0, columns = 0, snakes = 0, ladders = 0, players = 0;

		Scanner scanIn = context.getScanner();

		System.out.println(Constants.CONFIGURATION_MENU_HEADER);
		System.out.println(Constants.CONFIGURATION_INPUT_GUIDE);

		while (rows <= 0) {
			try {
				System.out.print(Constants.CONFIGURATION_MENU_ROW);
				rows = scanIn.nextInt();
			} catch (InputMismatchException exception) {
				System.out.println(Constants.CONFIGURATION_INPUT_GUIDE);
				scanIn.nextLine();
			}
		}
		while (columns <= 0) {
			try {
				System.out.print(Constants.CONFIGURATION_MENU_COLUMNS);
				columns = scanIn.nextInt();
			} catch (InputMismatchException exception) {
				System.out.println(Constants.CONFIGURATION_INPUT_GUIDE);
				scanIn.nextLine();
			}
		}
		while (snakes <= 0) {
			try {
				System.out.print(Constants.CONFIGURATION_MENU_SNAKE);
				snakes = scanIn.nextInt();
			} catch (InputMismatchException exception) {
				System.out.println(Constants.CONFIGURATION_INPUT_GUIDE);
				scanIn.nextLine();
			}
		}
		while (ladders <= 0) {
			try {
				System.out.print(Constants.CONFIGURATION_MENU_LADDERS);
				ladders = scanIn.nextInt();
			} catch (InputMismatchException exception) {
				System.out.println(Constants.CONFIGURATION_INPUT_GUIDE);
				scanIn.nextLine();
			}
		}
		while (players <= 0) {
			try {
				System.out.print(Constants.CONFIGURATION_MENU_PLAYERS);
				players = scanIn.nextInt();
			} catch (InputMismatchException exception) {
				System.out.println(Constants.CONFIGURATION_INPUT_GUIDE);
				scanIn.nextLine();
			}
		}

		Configuration configuration = new Configuration.Builder().numberOfColumns(columns).numberOfRows(rows)
				.numberOfSnakes(snakes).numberOfLadders(ladders).numberOfPlayers(players).build();
		context.setConfiguration(configuration);
		System.out.println("New Configuration:" + configuration);
		context.setState(new StartState());
	}
}
