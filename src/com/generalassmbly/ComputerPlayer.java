package com.generalassmbly;

import java.util.Random;

/**
 * ComputerPlayer.java
 * Represents a computer player in the Rock, Paper, Scissors game.
 * Inherits from the Player class.
 */
public class ComputerPlayer extends Player {

    /**
     * Constructor to initialize a computer player.
     *
     * @param name The name of the computer player.
     */
    public ComputerPlayer(String name) {
        super(name);
    }

    /**
     * Generates a random move for the computer player (rock, paper, or scissors).
     *
     * @return The randomly generated move of the computer player.
     */
    @Override
    public String makeMove() {
        // Implement code to generate a random move (rock, paper, or scissors)

        Random random = new Random();
        int randomMove = random.nextInt(3); // Generates a random number between 0 and 2

        switch (randomMove) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                // This should not happen, but handle it just in case
                return "rock";
        }
    }
}
