package com.generalassmbly;
import java.util.Scanner;

/**
 * GameMenu.java
 * Manages the main menu and user interactions for the Rock, Paper, Scissors game.
 *  private is a key aspect of encapsulation, which is one of the fundamental principles of OOP. It helps ensure that the internal state of objects is managed and accessed in a controlled and consistent manner.
 */
public class GameMenu {
    private GameManager gameManager;
    private GameHistory gameHistory;
    private Scanner scanner;

    /**
     * Constructs a GameMenu object.
     *
     * @param gameManager The GameManager instance that manages game logic.
     */
    public GameMenu(GameManager gameManager) {
        this.gameManager = gameManager;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Displays the main menu options to the user.
     */
    public void displayMainMenu() {
        System.out.println("\nMAIN MENU");
        System.out.println("=====");
        System.out.println("1. Type 'play' to play.");
        System.out.println("2. Type 'history' to view your game history.");
        System.out.println("3. Type 'quit' to stop playing.");
    }
    /**
     * Gets user input for menu choices.
     *
     * @return The user's menu choice as a String.
     */
    public String getUserInput() {
        System.out.print("\nEnter your choice: ");
        return scanner.nextLine().toLowerCase();
    }
    /**
     * Handles user choices based on their input.
     *
     * @param userInput The user's menu choice.
     */
    public void handleUserChoice(String userInput) {
        switch (userInput) {
            case "play":
                gameManager.playGame();
                break;
            case "history":
                gameHistory.displayGameHistory(); // Call the method on the gameHistory object
                break;
            case "quit":
                System.out.println("Thanks for playing!");
                System.exit(0); // Terminate the program
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
