package com.ideas.snakesnladders;

/**
 * A Constant object contains hard-coded values for different constant items.
 * 
 * 
 */
public class Constants {

	public static final String SEPERATOR = "###################################";
	public static final String MAIN_MENU_HEADER = "!! Snakes & Ladders !!";
	public static final String MAIN_MENU_OPTION1 = "Enter 1 to run the game.";
	public static final String MAIN_MENU_OPTION2 = "Enter 2 to configure.";
	public static final String MAIN_MENU_OPTION3 = "Enter 3 to exit.";
	public static final String MAIN_MENU_ERROR = "Please enter a valid menu selection.";
	public static final String STATIC_GAME_HEADER = "Running game with predefined board and 2 players...";
	public static final String DYNAMIC_GAME_HEADER = "Running game with new configuration...";
	public static final String DYNAMIC_GAME_CONFIGURATION_EXCEPTION = "Cannot run a Dynamic Game without a Configuration";

	public static final String CONFIGURATION_MENU_HEADER = "!! Configure !!";
	public static final String CONFIGURATION_MENU_ROW = "Enter number of rows on the board:";
	public static final String CONFIGURATION_MENU_COLUMNS = "Enter number of columns on the board:";
	public static final String CONFIGURATION_MENU_SNAKE = "Enter number of snakes:";
	public static final String CONFIGURATION_MENU_LADDERS = "Enter number of ladders:";
	public static final String CONFIGURATION_MENU_PLAYERS = "Enter number of players:";
	public static final String CONFIGURATION_INPUT_GUIDE = "Please enter non zero numeric values!";

	public static final String COLUMNS_NUMBER_ERROR = "Number of Columns should be greater then zero.";
	public static final String ROW_NUMBER_ERROR = "Number of Rows should be greater then zero.";
	public static final String SNAKES_NUMBER_ERROR = "Number of Snakes should be greater then zero.";
	public static final String LADDERS_NUMBER_ERROR = "Number of Ladders should be greater then zero.";
	public static final String PLAYERS_NUMBER_ERROR = "Number of Players should be greater then zero.";

	public static final String GOODBYE_MESSAGE = "Goodbye!";

	public static final String GAME_ROLLING_DICE_MESSAGE = "Rolling dice for player:";
	public static final String GAME_LADDER_ASSIST_MESSAGE = "Ladder Assist!, Jumping by:";
	public static final String GAME_SNAKEBITE_MESSAGE = "Ouch Snake Bite!, Falling by:";
	public static final String GAME_WINING_MESSAGE = "has won the game !";

	public static final int DICE_DEFAULT_MIN_VALUE = 1;
	public static final int DICE_DEFAULT_MAX_VALUE = 6;
	public static final String DICE_MIN_MAX_ZERO_ERROR = "Min or Max need to be greater then zero";
	public static final String DICE_MIN_MAX_ERROR = "Min cannot be greater then Max value";

}
