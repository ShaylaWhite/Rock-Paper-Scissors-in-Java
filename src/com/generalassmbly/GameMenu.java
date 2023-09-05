package com.generalassmbly;
import java.util.Scanner;

/**
 * GameMenu.java
 * Manages the main menu and user interactions for the Rock, Paper, Scissors game.
 *  private is a key aspect of encapsulation, which is one of the fundamental principles of OOP. It helps ensure that the internal state of objects is managed and accessed in a controlled and consistent manner.
 */
public class GameMenu {
    private GameManager gameManager;
    private Scanner scanner;

    // Constructor
    public GameMenu(GameManager gameManager) {
        this.gameManager = gameManager;
        this.scanner = new Scanner(System.in);
    }
}
