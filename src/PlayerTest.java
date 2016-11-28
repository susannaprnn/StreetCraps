import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.TestCase;

public class PlayerTest {
	
	@Rule
    public ExpectedException thrown= ExpectedException.none();
	
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
	
	@Test
	public void testGetPlayerCanNotHaveNegCash() {
		thrown.expect(NullPointerException.class);
		Player player =  new Player("Petter",-300);
	}
}
   