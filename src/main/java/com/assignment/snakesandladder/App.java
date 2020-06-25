package com.assignment.snakesandladder;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		System.out.println("Starting your game at position 0:::::");

		Scanner scan = new Scanner(System.in);
		int currentPosition = 0;
		int newPosition = 0, diceValue;

		Game game = new GameImpl();
		game.createBoard();

		while (newPosition < 100) {

			System.out.println("Enter dice value::::::");
			diceValue = scan.nextInt();
			if (!game.checkDiceInputValidity(diceValue)) {
				System.out.println("Invalid Dice Value");
				continue;
			}
			System.out.println("Enter current position value::::::");
			currentPosition = scan.nextInt();

			if (game.checkCurrentPositionValidity(currentPosition)) {
				newPosition = game.play(currentPosition, diceValue);
				System.out.println("New Position: " + newPosition);

			} else {
				System.out.println("Invalid current Position");
				continue;
			}

			if (newPosition == 100) {
				System.out.println("Hurrraaaay!! You won the game! :D ");
				break;
			}
		}

		scan.close();

	}

}
