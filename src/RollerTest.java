import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import org.junit.Test;

import junit.framework.TestCase;

public class RollerTest {

	@Test
	public void testPlayroundThrowing2() {
		Roller roller = new Roller(create1Dice(),create1Dice());
		TestCase.assertFalse(roller.PlayRound());
	}

	private Dice create2Dice() {
		 //mock creation
		 Dice mockedDice = mock(Dice.class);
		 when(mockedDice.Roll()).thenReturn(2);
		 
		 return mockedDice;
	}

	private Dice create1Dice() {
		 //mock creation
		 Dice mockedDice = mock(Dice.class);
		 when(mockedDice.Roll()).thenReturn(1);
	 
		 return mockedDice;
	}
}


