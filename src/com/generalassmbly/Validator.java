package com.generalassembly;

/**
 * Validator Class (Utility Class):
 *
 * Handles input validation and provides methods to validate user input.
 * Usage of OOP: Encapsulation (data hiding), Reusability (reusable validation methods).
 */
public class Validator {
    /**
     * Validate if a given move (rock, paper, or scissors) is valid.
     *
     * @param move The move to be validated.
     * @return True if the move is valid, false otherwise.
     */
    public boolean validateMove(String move) {
        return move.equalsIgnoreCase("rock") || move.equalsIgnoreCase("paper") || move.equalsIgnoreCase("scissors");
    }

    /**
     * Validate if a user's menu choice (e.g., "play", "history", "quit") is valid.
     *
     * @param choice The user's menu choice to be validated.
     * @return True if the choice is valid, false otherwise.
     */
    public boolean validateMenuChoice(String choice) {
        return choice.equalsIgnoreCase("play") || choice.equalsIgnoreCase("history") || choice.equalsIgnoreCase("quit");
    }
}
