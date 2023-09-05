
# 🪨✂️📄 Rock, Paper, Scissors in Java 🪨✂️📄

## Overview
This console-based implementation of Rock-Paper-Scissors is not just a game; it's a demonstration of Object-Oriented Programming (OOP) principles in action. The game boasts an intuitive Graphical User Interface (GUI) to enhance the user experience. It offers three modes: player vs. player and player vs. computer, computer vs. coomputer and it ensures a user-friendly interface for interactions.

## Key Features

### 1. Rock-Paper-Scissors Gameplay
- Play the traditional Rock-Paper-Scissors game with clear rules and outcomes.
- Choose between two exciting modes: Human vs. Human or Human vs. Computer. Computer vs. Computer


### 2. User-Friendly GUI
- Enjoy seamless interactions with the game's intuitive graphical user interface.
- Easily navigate through options to start a new game, review game history, and exit the application.

The game offers an effortless and engaging user interface that enhances your gaming experience. Here, take a closer look at how it works:

#### Interactive Pop-Up UI for Immersive Gameplay
![GUI](https://github.com/ShaylaWhite/Rock-Paper-Scissors-in-Java/raw/main/src/com/generalassmbly/images/gui.png)

#### Enter Your Name Directly in the Interface!
![Player Input](https://github.com/ShaylaWhite/Rock-Paper-Scissors-in-Java/raw/main/src/com/generalassmbly/images/playerinput.png)

#### Choose Your Game Mode from Three Options:
![Game Mode](https://github.com/ShaylaWhite/Rock-Paper-Scissors-in-Java/raw/main/src/com/generalassmbly/images/game%20mode.png)

### But that's not all! After every exhilarating round, you have the power to decide whether to keep the excitement going.
![Another Round](https://github.com/ShaylaWhite/Rock-Paper-Scissors-in-Java/raw/main/src/com/generalassmbly/images/anotherround.png)

#### This polished presentation enhances your overall experience, making the game even more enjoyable. Have a blast!


### 3. Game History Tracking
- Keep track of game history, including the results of each match.
- Easily access and review past game results at any time.

## Object-Oriented Programming (OOP) Principles in Action

### Inheritance
- **Player Class (Abstract Class):** Represents a player in the game and serves as the base class for other player types. It embodies inheritance by defining common attributes and methods that are shared by both human and computer players.
- **HumanPlayer Class (Subclass of Player):** Inherits from the Player class, allowing it to reuse the attributes and methods defined in the Player class while also providing the flexibility to override or extend these methods.
- **ComputerPlayer Class (Subclass of Player):** Similarly inherits from the Player class, leveraging the common player attributes and methods.

### Encapsulation
- **Player Class (Abstract Class):** Encapsulates player-specific data (e.g., wins, losses, points) by providing private fields and exposing them through getter and setter methods. This ensures that the internal state of players is hidden and can only be accessed and modified through controlled methods.
- **Validator Class (Utility Class):** Encapsulates input validation logic by providing methods to validate user input. This hides the validation details from the calling code and promotes code maintainability.

### Polymorphism
- **Player Class (Abstract Class):** Serves as a base class for different player types (human and computer). This enables polymorphism, as you can create objects of different player types but interact with them through a common Player reference, allowing for flexibility and extensibility in the game logic.
- **HumanPlayer Class and ComputerPlayer Class:** Both classes provide specific implementations of methods defined in the Player class, showcasing polymorphism in action. For example, they can override the makeMove() method differently to represent human and computer player behaviors.

### Modularity
- **com.generalassmbly.GameManager Class (Service/Controller Class):** Centralizes game logic, including move comparison and outcome determination. This modular approach separates the game's core functionality from other concerns, promoting easier maintenance and testing.
- **GameMenu Class (Service/Controller Class):** Manages the main menu and user interaction separately. By isolating menu-related logic, you ensure that the user interface is decoupled from the game mechanics, enhancing modularity.

## How to Play
1. Launch the game.
2. Use the GUI to select your game mode: Human vs. Human or Human vs. Computer.
3. Follow the on-screen prompts to enter player names and make your moves.
4. The winner of each round is announced, and game results are logged in the history.
5. You can view the game history at any time to review past matches.

## Technical Details

### Input Validation
- Input validation is implemented to ensure that user inputs for moves and menu choices are valid.
- Invalid inputs are handled gracefully, with informative error messages.

### Game History
- The `GameHistory` class stores and manages the history of the game, making it easy to view past results.
- Game results are presented in a clear format for the user.

### Exception Handling
- The code incorporates exception handling using try-catch blocks to prevent crashes due to bad input or unexpected issues.

### JavaDoc and Comments
- JavaDoc strings are provided for classes, methods, and variables to document their purpose and usage.
- Comments within the code explain key logic and functionality.

## Requirements
- Java Development Kit (JDK) installed on your system.

Your instructions look good! However, to enhance clarity, consider adding code blocks and revising slightly:

## How to Run

1. **Compilation**: Compile the Java source files in the project directory using the following command:
   
   ```
   javac *.java
   ```

2. **Execution**: Run the game by executing the `Main` class:

   ```
   java Main
   ```

## Have Fun!

Enjoy playing Rock-Paper-Scissors with this Java implementation, featuring a user-friendly GUI and a demonstration of essential OOP principles. May the best player win! 🪨✂️📄



