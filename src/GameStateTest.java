import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class GameStateTest {

	@Test
	public void testGetRound() {
		GameState sut =  new GameState(2,11);
		TestCase.assertTrue(sut.getRound() == 2);
	}
	
	@Test
	public void testSetRound() {
		GameState sut =  new GameState(2,11);
		sut.setRound(3);
		TestCase.assertTrue(sut.getRound() == 3);
	}
	
	@Test
	public void testGetPoint() {
		GameState sut =  new GameState(2,11);
		TestCase.assertTrue(sut.getPoint() == 11);
	}
	
	@Test
	public void testSetPoint() {
		GameState sut =  new GameState(2,11);
		sut.setPoint(8);
		TestCase.assertTrue(sut.getPoint() == 8);
	}
	
}