package com.assignment.snakesandladder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SnakeAndLadderPositionImpl implements SnakeAndLadderPosition {

	public static Map<Integer, Boolean> usedCells = new HashMap<Integer, Boolean>();
	private Random rand = new Random();

	
	public int getAvailableStartingPosition() {
		int startingPosition = rand.nextInt(100);
		while (usedCells.containsKey(startingPosition) || startingPosition == 0) {
			startingPosition = rand.nextInt(100);
		}

		return startingPosition;
	}

	
	public int getAvailableEndPosition(int startingPosition) {
		int endPosition = rand.nextInt(100);
		while (usedCells.containsKey(endPosition) || endPosition < startingPosition || endPosition == 0) {
			endPosition = rand.nextInt(100);
		}
		return endPosition;
	}

}