package com.generalassembly;

/**
 * Validator Class (Utility Class):
 *
 * Handles input validation.
 * Provides methods to validate user input.
 * Usage of OOP: Encapsulation (data hiding), Reusability (reusable validation methods).
 */
public class Validator {
    /**
     * Validate user input for a move (rock, paper, or scissors).
     *
     * @param input The user's input to be validated.
     * @return true if the input is valid; false otherwise.
     */
    public boolean validateMove(String input) {
        String sanitizedInput = input.toLowerCase();

        return sanitizedInput.equals("rock") || sanitizedInput.equals("paper") || sanitizedInput.equals("scissors");
    }

    /**
     * Validate user input for menu choices (e.g., play, history, quit).
     *
     * @param input The user's input to be validated.
     * @return true if the input is valid; false otherwise.
     */
    public boolean validateMenuChoice(String input) {
        String sanitizedInput = input.toLowerCase();

        return sanitizedInput.equals("play") || sanitizedInput.equals("history") || sanitizedInput.equals("quit");
    }
}
