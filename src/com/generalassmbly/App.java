package com.generalassmbly;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create player objects
        Player player1 = new HumanPlayer("Player 1");
        Player player2 = new HumanPlayer("Player 2");

        // Create a game history manager
        GameHistory gameHistory = new GameHistory();

        // Create the game manager
        GameManager gameManager = new GameManager(player1, player2, gameHistory);

        // Create the game menu
        new GameMenu(gameManager, gameHistory); // GUI menu, no need to store in a variable

        // Start the game loop
        while (true) {

        }
    }
}
