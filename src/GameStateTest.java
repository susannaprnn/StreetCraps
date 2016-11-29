import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class GameStateTest {

	@Test
	public void testGetRound() {
		GameState gameState =  new GameState(2,11);
		TestCase.assertTrue(gameState.getRound() == 2);
	}
	
	@Test
	public void testSetRound() {
		GameState gameState =  new GameState(2,11);
		gameState.setRound(3);
		TestCase.assertTrue(gameState.getRound() == 3);
	}
	
	@Test
	public void testGetPoint() {
		GameState gameState =  new GameState(2,11);
		TestCase.assertTrue(gameState.getPoint() == 11);
	}
	
	@Test
	public void testSetPoint() {
		GameState gameState =  new GameState(2,11);
		gameState.setPoint(8);
		TestCase.assertTrue(gameState.getPoint() == 8);
	}
	
}