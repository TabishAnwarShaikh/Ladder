Snakes and Ladders Games.
----------------------------

Pre-Requisite
---------------------------
1. Maven 3x
2. JDK 1.7
3. Git client.

Installation:
-----------------------------
1. Checkout the repository in a ${dir}
2. Run mvn clean install 
3. To run the program go to the ${dir}/target folder
4. Type in java -jar snakesnladders-0.0.1-SNAPSHOT.jar


Guide
------------------------------
1. When the game starts it shows the following menu
###################################
!! Snakes & Ladders !!
Enter 1 to run the game.
Enter 2 to configure.
Enter 3 to exit.

2. Selecting 1 runs the game using a preconfigured board of 10 rows and 12 columns and 2 players.
3. Selecting 2 , user is able to configure the following 
  * Number of rows of the board.
  * Number of columns of the board.
  * Number of snakes on the board.
  * Number of ladders on the board.
  * Number of players.
4. If a Configuration object exists then all future game plays take use that configuration.
5. Select 3 to exit the game.
