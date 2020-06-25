package com.assignment.snakesandladder;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameImplUnitTest {
	
	
	@InjectMocks
	private GameImpl game;
	
	
	@Test
	public void testPlay() {
		assertEquals(game.play(100, 6),100);
		
	}
	
	@Test
	public void diceValidityTest() {
		assertEquals(game.checkDiceInputValidity(7), false);
	}
	
	@Test
	public void diceValidityFailTest() {
		assertEquals(game.checkDiceInputValidity(3), true);
	}
	
	@Test
	public void currentPositionWhenZeroTest() {
		assertEquals(game.checkCurrentPositionValidity(0), true);
	}
	
	@Test
	public void currentPositionTest() {
		assertEquals(game.checkCurrentPositionValidity(55), true);
	}
	
	@Test
	public void currentPositionWhenMoreTest() {
		assertEquals(game.checkCurrentPositionValidity(155), false);
	}

}