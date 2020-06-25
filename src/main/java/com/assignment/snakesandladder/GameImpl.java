package com.assignment.snakesandladder;

public class GameImpl extends GameBoard implements Game {

	public int play(int currentPosition, int diceValue) {
		int newPosition = currentPosition + diceValue;
		if (snakesMap.containsKey(newPosition))
			return snakesMap.get(newPosition);
		else if (laddersMap.containsKey(newPosition))
			return laddersMap.get(newPosition);

		return newPosition > 100 ? currentPosition : newPosition;
	}

	public boolean checkDiceInputValidity(int diceValue) {
		return (diceValue > 0 && diceValue <= 6);
	}

	public void createBoard() {
		board();

	}

	public boolean checkCurrentPositionValidity(int currentPosition) {
		return currentPosition == 0 || currentPosition >= 1 && currentPosition <= 100;
	}

}