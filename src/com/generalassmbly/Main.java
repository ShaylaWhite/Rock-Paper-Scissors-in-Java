package com.generalassmbly;
/**
 * Main Class (Client/Driver Class):
 * Main method and game flow handling.
 * Uses other classes to create objects and manage the game.
 * Usage of OOP: Control class, Composition (uses other classes).
 */

public class Main {
    // CLIENT/DRIVER CLASS
    public static void main(String[] args) {
        // Create instances of the necessary classes
        Player humanPlayer = new HumanPlayer("Player 1"); // You can specify the player's name
        Player computerPlayer = new ComputerPlayer("Computer");

        // Create a game history instance
        GameHistory gameHistory = new GameHistory();

        // Create a game manager instance
        GameManager gameManager = new GameManager(humanPlayer, computerPlayer, gameHistory, new Validator());

        // Create a game menu instance
        GameMenu gameMenu = new GameMenu(gameManager);

        // Display the main menu and handle user choices
        while (true) {
            gameMenu.displayMainMenu();
            String userInput = gameMenu.getUserInput();
            gameMenu.handleUserChoice(userInput);
        }
    }

}
