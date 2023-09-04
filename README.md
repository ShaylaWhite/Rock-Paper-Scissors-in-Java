# Rock-Paper-Scissors-in-Java

# 🪨✂️📄 Rock, Paper, Scissors in Java 🪨✂️📄

## Overview
A basic version of the classic game, rock–paper–scissors, that lets you face off against the computer in the console. The game boasts a few key features:

- Play rock–paper–scissors against a computer player.
- Challenge a friend in a rock–paper–scissors showdown.
- The computer's choice is determined by a random number generator.

## 🧩 Class Breakdown and OOP Principles

### 🎮 Main Class (Client/Driver Class):
- Main method orchestrating game flow.
- Utilizes other classes to create objects and manage the game.
- **Usage of OOP:** Control class, Composition (uses other classes).

### 👤 Player Class (Abstract Class):
- Represents a player in the game.
- Holds common attributes and methods for all players.
- **Usage of OOP:** Inheritance (Abstract class), Encapsulation (data hiding), Polymorphism (serves as a base class for different players).

### 🙋‍♂️ HumanPlayer Class (Subclass of Player):
- Represents a human player.
- Inherits attributes and methods from the Player class.
- **Usage of OOP:** Inheritance (Subclass), Method overriding.

### 🤖 ComputerPlayer Class (Subclass of Player):
- Represents a computer player.
- Inherits attributes and methods from the Player class.
- **Usage of OOP:** Inheritance (Subclass), Method overriding.

### 📚 GameHistory Class (Utility Class):
- Manages the history of the game.
- Stores past game results.
- **Usage of OOP:** Encapsulation (data hiding), Data structure (e.g., ArrayList).

### 🧾 Validator Class (Utility Class):
- Handles input validation.
- Provides methods to validate user input.
- **Usage of OOP:** Encapsulation (data hiding), Reusability (reusable validation methods).

### 🎲 GameManager Class (Service/Controller Class):
- Manages the game mechanics.
- Compares moves, determines the winner, and handles outcomes.
- **Usage of OOP:** Encapsulation (data hiding), Modularity (centralized game logic).

### 🍽️ GameMenu Class (Service/Controller Class):
- Manages the main menu and user interaction.
- Displays options and handles user choices.
- **Usage of OOP:** Encapsulation (data hiding), Modularity (separate menu logic).

### 🚀 App Class (Client/Driver Class):
- Entry point of the program.
- Initializes the game, creates objects, and starts the game loop.
- **Usage of OOP:** Control class, Composition (uses other classes).

### 📑 Enum Classes (Data Definitions):
- Enumerations for constants like moves and game results.
- **Usage of OOP:** Data abstraction (defining constants).

## 🧩 OOP Principles

### Inheritance:
- **Player Class (Abstract Class):** Represents a player in the game and serves as the base class for other player types. It embodies inheritance by defining common attributes and methods that are shared by both human and computer players.
- **HumanPlayer Class (Subclass of Player):** Inherits from the Player class, allowing it to reuse the attributes and methods defined in the Player class while also providing the flexibility to override or extend these methods.
- **ComputerPlayer Class (Subclass of Player):** Similarly inherits from the Player class, leveraging the common player attributes and methods.

### Encapsulation:
- **Player Class (Abstract Class):** Encapsulates player-specific data (e.g., wins, losses, points) by providing private fields and exposing them through getter and setter methods. This ensures that the internal state of players is hidden and can only be accessed and modified through controlled methods.
- **Validator Class (Utility Class):** Encapsulates input validation logic by providing methods to validate user input. This hides the validation details from the calling code and promotes code maintainability.

### Polymorphism:
- **Player Class (Abstract Class):** Serves as a base class for different player types (human and computer). This enables polymorphism, as you can create objects of different player types but interact with them through a common Player reference, allowing for flexibility and extensibility in the game logic.
- **HumanPlayer Class and ComputerPlayer Class:** Both classes provide specific implementations of methods defined in the Player class, showcasing polymorphism in action. For example, they can override the makeMove() method differently to represent human and computer player behaviors.

### Modularity:
- **GameManager Class (Service/Controller Class):** Centralizes game logic, including move comparison and outcome determination. This modular approach separates the game's core functionality from other concerns, promoting easier maintenance and testing.
- **GameMenu Class (Service/Controller Class):** Manages the main menu and user interaction separately. By isolating menu-related logic, you ensure that the user interface is decoupled from the game mechanics, enhancing modularity.

## ⚙️ Feature Requirements
- [ ] Main menu with options to enter 2 players or vs. computer.
- [ ] Human vs. human mode and human vs. computer mode.
- [ ] Declare the winner at the end of each game.

## ⚙️ Technical Requirements (HARD)
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

## 🌟 Bonus Ideas
- [ ] Write automated JUnit tests for your application.
- [ ] Use an Agile project management framework.
- [ ] Implement a history feature to display previous game history.
- [ ] Use Java packages to modularize code.
- [ ] Use Maven to install external dependencies.
- [ ] Use generics on collections to store different data composed of different types.
- [ ] Use multithreading to handle concurrent requests.

🔥 Have fun playing Rock, Paper, Scissors game in Java! 🔥
