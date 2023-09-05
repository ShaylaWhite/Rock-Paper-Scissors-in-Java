package com.generalassmbly;

/**
 * Player Class (Abstract Class):
 *
 * This class is the superclass for all player types in the Rock, Paper, Scissors game.
 * It embodies key Object-Oriented Programming (OOP) principles, such as inheritance,
 * encapsulation, and polymorphism.
 *
 * Inheritance: Player serves as the base class for both HumanPlayer and ComputerPlayer.
 * This allows for code reuse and the creation of a common structure for player objects.
 *
 * Encapsulation: Player encapsulates player-specific data (name, wins, losses, points)
 * by providing private fields and exposing them through getter methods. This ensures
 * that the internal state of players is hidden and can only be accessed and modified
 * through controlled methods.
 *
 * Polymorphism: Player defines an abstract method, makeMove(), which must be implemented
 * by its subclasses. This enables polymorphism, as HumanPlayer and ComputerPlayer can
 * provide specific implementations of makeMove(), and they can be treated as Player
 * objects in the game logic, allowing for flexibility and extensibility.
 */
public class Player {
    private Optional<String> name; // Optional to represent the possibility of no name
    private int wins;
    private int losses;
    private int points;

    // Constructor with an Optional name
    public Player(Optional<String> name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.points = 0;
    }

    // Getter methods for player attributes
    public Optional<String> getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getPoints() {
        return points;
    }

    /**
     * Allows the player to make a move in the game.
     *
     * @param moveSupplier A Supplier that provides the player's move.
     * @return The move made by the player (rock, paper, or scissors).
     */
    public String makeMove(Supplier<String> moveSupplier) {
        return moveSupplier.get();
    }

    /**
     * Increment the player's wins count.
     */
    public void incrementWins() {
        wins++;
    }

    /**
     * Increment the player's losses count.
     */
    public void incrementLosses() {
        losses++;
    }

    /**
     * Increment the player's points.
     *
     * @param pointsToAdd The number of points to add.
     */
    public void incrementPoints(int pointsToAdd) {
        points += pointsToAdd;
    }
}