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
}