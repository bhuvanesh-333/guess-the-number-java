# Number Guessing Game - Java

A simple and interactive console-based number guessing game built in Java. The program generates a random number between 1 and 100, and players have 10 attempts to guess it correctly with helpful hints.

## Features

- Random number generation between 1-100
- 10 attempts limit to guess the correct number
- Real-time feedback (too high/too low hints)
- Attempt counter showing remaining chances
- Win/loss detection with appropriate messages
- Clean and user-friendly console interface

## Technologies Used

- Java (Core Java)
- Random class for number generation
- Scanner class for user input
- Console-based I/O

## How to Run

1. Clone the repository:
git clone https://github.com/<your-username>/number-guessing-game-java.git
cd number-guessing-game-java

text

2. Compile the Java file:
javac NumberGuessingGame.java

text

3. Run the program:
java NumberGuessingGame

text

## Gameplay Example

Welcome to Number Guessing Game!
I'm thinking of a number between 1 and 100
You have 10 attempts
Enter your guess: 50
Too low! Attempts left: 9
Enter your guess: 75
Too high! Attempts left: 8
Enter your guess: 62
Congratulations! You won in 3 attempts!

text

## Game Rules

- The computer randomly selects a number between 1 and 100
- You have a maximum of 10 attempts to guess the number
- After each guess, you'll receive a hint: "Too high" or "Too low"
- Win by guessing the correct number within the attempt limit
- The game reveals the answer if you run out of attempts

## Code Structure

- `NumberGuessingGame.java` - Main class containing:
  - Random number generation logic
  - Game loop with attempt tracking
  - Input validation and feedback system
  - Win/loss condition checking

## Possible Enhancements

- Add difficulty levels (Easy: 1-50, Medium: 1-100, Hard: 1-200)
- Implement a scoring system based on attempts used
- Add option to play multiple rounds and track statistics
- Include input validation for non-numeric entries
- Add a hint system (e.g., reveal if number is even/odd)
- Create a two-player mode where players take turns
- Store high scores in a file

## Learning Outcomes

This project demonstrates:
- Random number generation in Java
- While loops and control flow
- Boolean logic and conditional statements
- User input handling with Scanner
- Game logic implementation
- Code organization and readability

## License

Open source project for learning and educational purposes. Feel free to fork and enhance!
