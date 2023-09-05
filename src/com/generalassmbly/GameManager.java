package com.generalassmbly;
/**
 * GameManager.java
 * Manages the core game logic for the Rock, Paper, Scissors game.
 */
public class GameManager {
    private Player humanPlayer;
    private Player computerPlayer;
    private GameHistory gameHistory;
    private Validator validator;
    /**
     * Constructor to initialize the GameManager.
     *
     * @param humanPlayer   The human player object.
     * @param computerPlayer The computer player object.
     * @param gameHistory   The game history manager.
     * @param validator     The input validator.
     */
    // Constructor
    public GameManager(Player humanPlayer, Player computerPlayer, GameHistory gameHistory, Validator validator) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
        this.gameHistory = gameHistory;
        this.validator = validator;
    }
    /**
     * Plays a single round of the Rock, Paper, Scissors game.
     * It gets moves from the players, determines the winner, updates scores,
     * records the game outcome, and displays the result to the players.
     */

    // Play Game Method used in the called in GameMenu class
    public void playGame() {
        // Get moves from the players
        String humanMove = humanPlayer.makeMove();
        String computerMove = computerPlayer.makeMove();

        // Determine the winner
        String result = determineWinner(humanMove, computerMove);

        // Update player scores
        updateScores(result);

        // Record the game outcome in the game history
        gameHistory.recordGameResult(humanPlayer.getName(), computerPlayer.getName(), result);

        // Display the game result to the players
        displayGameResult(humanMove, computerMove, result);
    }
    /**
     * Determines the winner based on the moves.
     *
     * @param humanMove    The move made by the human player.
     * @param computerMove The move made by the computer player.
     * @return A string indicating the result: "tie," "win," or "lose."
     */
    private String determineWinner(String humanMove, String computerMove) {
        if (humanMove.equals(computerMove)) {
            return "tie";
        } else if ((humanMove.equals("rock") && computerMove.equals("scissors")) ||
                (humanMove.equals("scissors") && computerMove.equals("paper")) ||
                (humanMove.equals("paper") && computerMove.equals("rock"))) {
            return "win";
        } else {
            return "lose";
        }
    }

    /**
     * Updates player scores based on the game result.
     *
     * @param result The game result: "win," "lose," or "tie."
     */    private void updateScores(String result) {
        if (result.equals("win")) {
            humanPlayer.incrementWins();
            computerPlayer.incrementLosses();
        } else if (result.equals("lose")) {
            humanPlayer.incrementLosses();
            computerPlayer.incrementWins();
        } // In case of a tie, scores remain unchanged
    }

    /**
     * Displays the game result to the players.
     *
     * @param humanMove    The move made by the human player.
     * @param computerMove The move made by the computer player.
     * @param result       The game result: "tie," "win," or "lose."
     */
    private void displayGameResult(String humanMove, String computerMove, String result) {
        System.out.println("You chose: " + humanMove);
        System.out.println("Computer chose: " + computerMove);

        if (result.equals("tie")) {
            System.out.println("It's a tie!");
        } else if (result.equals("win")) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
