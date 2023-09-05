package com.generalassmbly;
/**
 * GameHistory Class (Utility Class):
 *
 * Manages the history of the game and stores past game results.
 * Usage of OOP: Encapsulation (data hiding), Data structure (e.g., ArrayList).
 */
public class GameHistory {
    private List<String> history;

    public GameHistory() {
        history = new ArrayList<>();
    }
    /**
     * Record a game result to the history.
     *
     * @param result The result of the game to be recorded.
     */
    public void recordGameResult(String result) {
        history.add(result);
    }

}