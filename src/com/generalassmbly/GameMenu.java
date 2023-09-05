package com.generalassmbly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMenu {
    private GameManager gameManager;
    private GameHistory gameHistory;

    public GameMenu(GameManager gameManager, GameHistory gameHistory) {
        this.gameManager = gameManager;
        this.gameHistory = gameHistory;
        createGUI();
    }

    private void createGUI() {
        JFrame frame = new JFrame("Rock, Paper, Scissors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton playButton = new JButton("Play");
        JButton historyButton = new JButton("View History");
        JButton quitButton = new JButton("Quit");

        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handlePlay();
            }
        });

        historyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameHistory.displayGameHistory();
            }
        });

        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
        });

        panel.add(playButton);
        panel.add(historyButton);
        panel.add(quitButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void handlePlay() {
        String[] options = { "Human vs. Human", "Human vs. Computer", "Computer vs. Computer" };
        int choice = JOptionPane.showOptionDialog(
                null,
                "Select a game mode:",
                "Game Mode",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        switch (choice) {
            case 0: // Human vs. Human
                String player1Name = JOptionPane.showInputDialog("Enter Player 1's name:");
                String player2Name = JOptionPane.showInputDialog("Enter Player 2's name:");

                // Check if either player name is null
                if (player1Name != null && player2Name != null) {
                    Player player1 = new HumanPlayer(player1Name);
                    Player player2 = new HumanPlayer(player2Name);
                    gameManager.setupGame(player1, player2, 1);
                } else {
                    // Handle the case where a player name is null (e.g., show an error message)
                    // You can also choose to cancel the game setup in this situation.
                    JOptionPane.showMessageDialog(null, "Invalid player name(s). Please enter valid names.");
                }
                break;


            case 1: // Human vs. Computer
                String playerName = JOptionPane.showInputDialog("Enter Player's name:");
                Player humanPlayer = new HumanPlayer(playerName);
                Player computerPlayer = new ComputerPlayer("Computer");
                gameManager.setupGame(humanPlayer, computerPlayer, 2);
                break;

            case 2: // Computer vs. Computer
                Player compPlayer1 = new ComputerPlayer("Computer 1");
                Player compPlayer2 = new ComputerPlayer("Computer 2");
                gameManager.setupGame(compPlayer1, compPlayer2, 3);
                break;

            default:
                break;
        }

        gameManager.playGame();
        // After the game, ask if players want to play another round
        int playAgain = JOptionPane.showConfirmDialog(
                null,
                "Do you want to play another round?",
                "Play Again",
                JOptionPane.YES_NO_OPTION
        );

        if (playAgain == JOptionPane.YES_OPTION) {
            handlePlay(); // Start a new round
        } else {
            System.out.println("Thanks for playing!");
            System.exit(0); // Exit the game if players choose not to play again
        }
    }
}
