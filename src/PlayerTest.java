import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class PlayerTest {

	@Test
	public void testGetPlayerName() {
		Player player =  new Player("Petter",300);
		TestCase.assertTrue(player.getName().equals("Petter"));
	}
	
	@Test
	public void testGetPlayerCash() {
		Player player =  new Player("Petter",300);
		TestCase.assertTrue(player.getCash() == 300);
	}
}