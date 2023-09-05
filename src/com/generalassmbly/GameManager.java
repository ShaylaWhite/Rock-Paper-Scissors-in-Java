package com.generalassmbly;

import java.util.Optional;

public class GameManager {
    private Player player1;
    private Player player2;
    private GameHistory gameHistory;
    private int gameMode;

    /**
     * Constructs a GameManager with the specified players and game history.
     *
     * @param player1 The first player.
     * @param player2 The second player.
     * @param gameHistory The game history to record results.
     */
    public GameManager(Player player1, Player player2, GameHistory gameHistory) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameHistory = gameHistory;
    }

    /**
     * Sets up the game with the specified players and game mode.
     *
     * @param player1 The first player.
     * @param player2 The second player.
     * @param gameMode The game mode (1 for Human vs. Human, 2 for Human vs. Computer, 3 for Computer vs. Computer).
     */
    public void setupGame(Player player1, Player player2, int gameMode) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameMode = gameMode;
    }

    /**
     * Plays a round of the game, determining the winner and updating scores.
     * Records the game result and displays it.
     */
    public void playGame() {
        String move1 = player1.makeMove();
        String move2 = player2.makeMove();

        String result = determineWinner(move1, move2);

        updateScores(result);

        gameHistory.recordGameResult(getPlayerName(player1), getPlayerName(player2), result);
        displayGameResult(move1, move2, result);
    }

    /**
     * Determines the winner of a round based on the moves made by the players.
     *
     * @param move1 The move made by the first player.
     * @param move2 The move made by the second player.
     * @return The result of the round: "tie", "win", or "lose".
     */
    private String determineWinner(String move1, String move2) {
        if (move1.equals(move2)) {
            return "tie";
        } else if ((move1.equals("rock") && move2.equals("scissors")) ||
                (move1.equals("scissors") && move2.equals("paper")) ||
                (move1.equals("paper") && move2.equals("rock"))) {
            return "win";
        } else {
            return "lose";
        }
    }

    /**
     * Updates the scores of the players based on the result of a round.
     *
     * @param result The result of the round: "win" or "lose".
     */
    private void updateScores(String result) {
        if (result.equals("win")) {
            player1.incrementWins();
            player2.incrementLosses();
        } else if (result.equals("lose")) {
            player1.incrementLosses();
            player2.incrementWins();
        }
    }

    /**
     * Displays the result of a round, including the moves made by the players and the winner.
     *
     * @param move1 The move made by the first player.
     * @param move2 The move made by the second player.
     * @param result The result of the round: "tie", "win", or "lose".
     */
    private void displayGameResult(String move1, String move2, String result) {
        System.out.println(getPlayerName(player1) + " chose: " + move1);
        System.out.println(getPlayerName(player2) + " chose: " + move2);

        if (result.equals("tie")) {
            System.out.println("It's a tie!");
        } else if (result.equals("win")) {
            System.out.println(getPlayerName(player1) + " wins!");
        } else {
            System.out.println(getPlayerName(player2) + " wins!");
        }
    }

    /**
     * Gets the name of a player or returns "Unknown Player" if the name is not present.
     *
     * @param player The player whose name is to be retrieved.
     * @return The player's name or "Unknown Player" if the name is not present.
     */
    private String getPlayerName(Player player) {
        return player.getName().orElse("Unknown Player");
    }

    /**
     * Plays a round with a specific choice and returns the result as a String.
     *
     * @param choice The choice made by the first player.
     * @return The result of the round: "tie", "win", or "lose".
     */
    public String playRoundWithChoice(String choice) {
        // Add the game logic here and return the result as a String.
        // For example:
        String result = determineWinner(choice, player2.makeMove());
        updateScores(result);
        gameHistory.recordGameResult(getPlayerName(player1), getPlayerName(player2), result);
        return result;
    }
}
