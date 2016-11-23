import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DiceTest {

	@Test
	public void testRoll() {
		Dice diceUnderTest = new Dice();
		int diceOutcome = diceUnderTest.Roll();
		
		TestCase.assertTrue(diceOutcome >= 1 && diceOutcome <= 6);
	}

}
