package com.assignment.snakesandladder;

public interface Game {
	
	public int play(int value1, int value2);
	
	public boolean checkDiceInputValidity(int diceValue);
	
	public void createBoard();

	public boolean checkCurrentPositionValidity(int value);

}
