package com.generalassmbly;

public class GameManager {
    private Player humanPlayer;
    private Player computerPlayer;
    private GameHistory gameHistory;
    private Validator validator;

    // Constructor
    public GameManager(Player humanPlayer, Player computerPlayer, GameHistory gameHistory, Validator validator) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
        this.gameHistory = gameHistory;
        this.validator = validator;
    }
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
    // Determine the winner based on the moves
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

    // Update player scores based on the game result
    private void updateScores(String result) {
        if (result.equals("win")) {
            humanPlayer.incrementWins();
            computerPlayer.incrementLosses();
        } else if (result.equals("lose")) {
            humanPlayer.incrementLosses();
            computerPlayer.incrementWins();
        } // In case of a tie, scores remain unchanged
    }

    // Display the game result to the players
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
