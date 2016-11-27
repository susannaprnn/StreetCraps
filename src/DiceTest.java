import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.TestCase;

public class DiceTest {

	@Test
	public void testRoll() {
		Dice diceUnderTest = new Dice();
		int diceOutcome = diceUnderTest.roll();
		
		TestCase.assertTrue(diceOutcome >= 1 && diceOutcome <= 6);
	}

}
