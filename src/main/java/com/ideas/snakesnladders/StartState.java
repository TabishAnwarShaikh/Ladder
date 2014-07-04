package com.ideas.snakesnladders;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * State object that represents the starting of the GameEngine.
 * 
 */
public class StartState implements State {

	@Override
	public void run(GameEngine context) {

		System.out.println(Constants.SEPERATOR);
		System.out.println(Constants.MAIN_MENU_HEADER);
		System.out.println(Constants.MAIN_MENU_OPTION1);
		System.out.println(Constants.MAIN_MENU_OPTION2);
		System.out.println(Constants.MAIN_MENU_OPTION3);

		try {
			Scanner scanIn = context.getScanner();
			int selectedMenu = scanIn.nextInt();

			switch (selectedMenu) {
			case 1:
				context.setState(new RunningState());
				break;
			case 2:
				context.setState(new SetupState());
				break;
			case 3:
				context.setState(new StopState());
				break;
			default:
				System.out.println(Constants.MAIN_MENU_ERROR);
				context.setState(new StartState());
				break;
			}
		} catch (InputMismatchException exception) {
			System.out.println(Constants.MAIN_MENU_ERROR);
			context.setState(new StartState());
		}

	}

}
