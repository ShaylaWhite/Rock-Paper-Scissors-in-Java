# Rock-Paper-Scissors-in-Java

## Overview
Create a basic version of rock–paper–scissors that allows users to play against the computer in the console. The game consists of a few main features:

- Play rock–paper–scissors against a computer player.
- Play rock–paper–scissors against a human player.
- Use a random number generator to make the computer's choice.

## Class Breakdown and OOP Principles
(Previous class breakdown information goes here...)

## Feature Requirements
- [ ] Main menu with options to enter 2 players or vs. computer.
- [ ] Human vs. human mode and human vs. computer mode.
- [ ] Declare the winner at the end of each game.

## Technical Requirements (HARD)
- [ ] Use classes to remove repetitive parts of code.
- [ ] Create an abstract Player class to manage the player's state.
- [ ] Use interfaces where necessary.
- [ ] Handle invalid user input.
- [ ] Utilize public, private, and static variables, methods, and members.
- [ ] Incorporate exception handling with try-catch blocks.
- [ ] Get standard input with Java using a Scanner.
- [ ] Use arrays or array lists to store game history.
- [ ] Add JavaDoc strings and proper comments.
- [ ] Use Java Optionals and Lambdas.

## Bonus Ideas
- [ ] Write automated JUnit tests for your application.
- [ ] Use an Agile project management framework.
- [ ] Implement a history feature to display previous game history.
- [ ] Use Java packages to modularize code.
- [ ] Use Maven to install external dependencies.
- [ ] Use generics on collections to store different data composed of different types.
- [ ] Use multithreading to handle concurrent requests.


## OOP Principles 


Main Class (Client/Driver Class):
Main method and game flow handling.
Uses other classes to create objects and manage the game.
Usage of OOP: Control class, Composition (uses other classes).
Player Class (Abstract Class):

Represents a player in the game.
Contains common attributes and methods for players.
Usage of OOP:
Inheritance (Abstract class): Serves as the base class for players.
Encapsulation (data hiding): Hides player data with private fields.
Polymorphism (as a base class for different players): Allows treating different players uniformly.
HumanPlayer Class (Subclass of Player):

Represents a human player.
Inherits attributes and methods from the Player class.
Usage of OOP:
Inheritance (Subclass): Inherits from the Player class.
Method overriding: Overrides or extends methods from the Player class.
ComputerPlayer Class (Subclass of Player):

Represents a computer player.
Inherits attributes and methods from the Player class.
Usage of OOP:
Inheritance (Subclass): Inherits from the Player class.
Method overriding: Overrides or extends methods from the Player class.
GameHistory Class (Utility Class):

Manages the history of the game.
Stores past game results.
Usage of OOP:
Encapsulation (data hiding): Hides game history data.
Data structure (e.g., ArrayList): Utilizes data structures to store game history.
Validator Class (Utility Class):

Handles input validation.
Provides methods to validate user input.
Usage of OOP:
Encapsulation (data hiding): Hides validation logic.
Reusability (reusable validation methods): Provides reusable input validation methods.
GameManager Class (Service/Controller Class):

Manages the game mechanics.
Compares moves, determines the winner, and handles outcomes.
Usage of OOP:
Encapsulation (data hiding): Manages game logic internally.
Modularity (centralized game logic): Centralizes game mechanics for easy maintenance.
GameMenu Class (Service/Controller Class):

Manages the main menu and user interaction.
Displays options and handles user choices.
Usage of OOP:
Encapsulation (data hiding): Manages menu options and user interactions.
Modularity (separate menu logic): Separates menu logic from the main game logic.
App Class (Client/Driver Class):

Entry point of the program.
Initializes the game, creates objects, and starts the game loop.
Usage of OOP:
Control class: Controls the program flow.
Composition (uses other classes): Composes different classes to run the game.
Enum Classes (Data Definitions):

Enumerations for constants like moves and game results.
Usage of OOP:
Data abstraction (defining constants): Abstracts and defines constant values.