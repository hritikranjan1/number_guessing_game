# Number Guessing Game

## Author
**Hritik Ranjan**

## Project Overview
The Number Guessing Game is a simple console-based game where the player attempts to guess a randomly generated number between 1 and 100. The player has a limited number of attempts to guess the number correctly, with hints provided after each guess.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Results](#results)
- [License](#license)
- [Contact](#contact)

## Introduction
In this game, the player is prompted to enter a number between 1 and 100. A random number is generated by the computer, and the player must guess this number. After each guess, the game provides feedback, indicating whether the guess was too high or too low. The player has a maximum of 5 attempts to guess the number correctly.

## Features
- Random number generation.
- User input for guessing the number.
- Hints for guessing (higher/lower).
- Maximum attempts limit (5 attempts).
- Points system based on the number of attempts taken.

## Installation
To run this project, ensure you have Java installed on your system. Follow the steps below to set up your development environment:

1. **Clone the repository** (if applicable):
   ```bash
   git clone https://github.com/hritikranjan1/number_guessing_game.git
   cd number_guessing_game
2.Compile the Java program:

    javac number_guessing.java

3.Run the program:

    java number_guessing
## Usage

Follow these steps to play the game:

   1.Run the Java program as mentioned above.
   2.Input a number between 1 and 100 when prompted.
   3.If you want to exit the game, simply enter 0.
   4.Follow the hints provided after each guess to help you narrow down your next guess.
   5.Aim to guess the number within 5 attempts to maximize your score.
## Libraries:

    java.util: Used for utility classes, including Scanner for input and Random for generating random numbers.

## Logic:

 1. The game starts by prompting the player for input.
    2.A random number is generated, and the player has a maximum of 5 attempts to guess it.
    3.Hints are provided based on whether the guess is too high or too low.
    4.If the player guesses the number correctly, their score is calculated based on the number of attempts.
## Results

After running the game, players will receive feedback on their guesses, the number of attempts taken, and their score.
Example Output:

    Let's start the Game
    You can leave the game by entering 0
    Enter the Number from 1-100 : 
    50
    Enter The Smaller Number 
    25
    Enter The Larger Number 
    30
    Congratulations! You Guessed The Correct Number 
    Your Guessed Number is 30
    No of Attempts: 3
    Points based on the Number of Attempts: 33
## Contact

   Name: Hritik ranjan
   GitHub: https://github.com/hritikranjan1
   LinkedIn: https://www.linkedin.com/in/hritik-ranjan-05a835230/
