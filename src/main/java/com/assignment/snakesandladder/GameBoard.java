package com.assignment.snakesandladder;

import java.util.HashMap;
import java.util.Map;

public class GameBoard {

	SnakeAndLadderPosition position = new SnakeAndLadderPositionImpl();

	public Map<Integer, Integer> snakesMap = new HashMap<Integer, Integer>();
	public Map<Integer, Integer> laddersMap = new HashMap<Integer, Integer>();
	private int lesserPos, greaterPos;

	public void board() {
		for (int j = 0; j < 4; j++) {
			
			//building snakes position
			lesserPos = position.getAvailableStartingPosition();
			SnakeAndLadderPositionImpl.usedCells.put(lesserPos, true);
			greaterPos = position.getAvailableEndPosition(lesserPos);
			SnakeAndLadderPositionImpl.usedCells.put(greaterPos, true);
			snakesMap.put(greaterPos, lesserPos);
			
			//building ladders position
			lesserPos = position.getAvailableStartingPosition();
			SnakeAndLadderPositionImpl.usedCells.put(lesserPos, true);
			greaterPos = position.getAvailableEndPosition(lesserPos);
			SnakeAndLadderPositionImpl.usedCells.put(greaterPos, true);
			laddersMap.put(lesserPos, greaterPos);

		}

		// uncomment this if player wants to see the position of snakes and
		// ladders
		/*
		 * snakesMap.entrySet().forEach(entry -> {
		 * System.out.println(entry.getKey() + " > " + entry.getValue()); });
		 * 
		 * laddersMap.entrySet().forEach(entry2 -> {
		 * System.out.println(entry2.getKey() + " < " + entry2.getValue()); });
		 */
	}
}
