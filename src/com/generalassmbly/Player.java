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
}
