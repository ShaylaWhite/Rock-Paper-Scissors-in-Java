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

}