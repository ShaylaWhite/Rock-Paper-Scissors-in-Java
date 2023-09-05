package com.generalassmbly;

public class App {
    public static void main(String[] args) {
        // Create player objects
        Player player1 = new HumanPlayer("Player 1");
        Player player2 = new HumanPlayer("Player 2");

        // Create a game history manager
        GameHistory gameHistory = new GameHistory();

        // Create a validator for input
        Validator validator = new Validator();

        // Create the game manager
        GameManager gameManager = new GameManager(player1, player2, gameHistory, validator);

        // Create the game menu
        GameMenu gameMenu = new GameMenu(gameManager, gameHistory);

        // Display the main menu
        gameMenu.displayMainMenu();

        // Start the game loop
        while (true) {
            String userInput = gameMenu.getUserInput();
            gameMenu.handleUserChoice(userInput);
        }
    }
}
