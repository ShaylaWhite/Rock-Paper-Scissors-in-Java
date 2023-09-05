package com.generalassmbly;

import java.util.Optional;
import java.util.Scanner;

/**
 * HumanPlayer.java
 * Represents a human player in the Rock, Paper, Scissors game.
 * Inherits from the Player class.
 */
public class HumanPlayer extends Player {
    /**
     * Constructor to initialize a human player.
     *
     * @param name The name of the human player.
     */
    public HumanPlayer(String name) {

        super(Optional.of(name)); // Convert name to Optional
    }

    /**
     * Allows the human player to make a move in the game.
     *
     * @return The move made by the human player (rock, paper, or scissors).
     */
    @Override
    public String makeMove() {
        // Implement code to get user input for the move (rock, paper, scissors)
        // Scanner class here
        // Validate the input to ensure it's a valid move

        Scanner scanner = new Scanner(System.in);
        String move;

        while (true) {
            System.out.print(getName().orElse("Unknown") + ", enter your move (rock, paper, or scissors): ");
            move = scanner.nextLine().toLowerCase();

            if (move.equals("rock") || move.equals("paper") || move.equals("scissors")) {
                return move;
            } else {
                System.out.println("Invalid move. Please enter 'rock', 'paper', or 'scissors'.");
            }
        }
    }
}
