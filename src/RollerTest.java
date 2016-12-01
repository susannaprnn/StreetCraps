import static org.mockito.Mockito.*;


import org.junit.Test;

import junit.framework.TestCase;

public class RollerTest {

	@Test
	public void testPlayroundThrowing2() {
		Roller roller = new Roller(create1Dice(),create1Dice());
		TestCase.assertFalse(roller.PlayRound());
	}
	
	@Test
	public void testPlayroundThrowing3() {
		Roller roller = new Roller(create2Dice(),create1Dice());
		TestCase.assertFalse(roller.PlayRound());
	}
	
	@Test
	public void testPlayroundThrowing12() {
		Roller roller = new Roller(create6Dice(),create6Dice());
		TestCase.assertFalse(roller.PlayRound());
	}
	
	@Test
	public void testPlayroundThrowing6() {
		Roller roller = new Roller(create3Dice(),create3Dice());
		TestCase.assertTrue(roller.PlayRound());
	}
	
	@Test
	public void testGameStateAfterPlayroundThrowing6() {
		Roller roller = new Roller(create3Dice(),create3Dice());
		roller.PlayRound();
		
		TestCase.assertTrue(roller.getGameState().getPoint() == 6);
		TestCase.assertTrue(roller.getGameState().getRound() == 1);
	}
	
	@Test
	public void testGameStateAfterPlayroundThrowing6Twice() {
		Roller roller = new Roller(create3Dice(),create3Dice());
		roller.PlayRound();
		
		TestCase.assertFalse(roller.PlayRound());
	}
	
	private Dice create1Dice() {
		 //mock creation
		 Dice mockedDice = mock(Dice.class);
		 when(mockedDice.roll()).thenReturn(1);
	 
		 return mockedDice;
	}
	
	private Dice create2Dice() {
		 //mock creation
		 Dice mockedDice = mock(Dice.class);
		 when(mockedDice.roll()).thenReturn(2);
		 
		 return mockedDice;
	}

	private Dice create3Dice() {
		 //mock creation
		 Dice mockedDice = mock(Dice.class);
		 when(mockedDice.roll()).thenReturn(3);
	 
		 return mockedDice;
	}
	
/*	private Dice create4Dice() {
		 //mock creation
		 Dice mockedDice = mock(Dice.class);
		 when(mockedDice.roll()).thenReturn(4);
		 
		 return mockedDice;
	}
	
	private Dice create5Dice() {
		 //mock creation
		 Dice mockedDice = mock(Dice.class);
		 when(mockedDice.roll()).thenReturn(5);
	 
		 return mockedDice;
	}
	*/
	private Dice create6Dice() {
		 //mock creation
		 Dice mockedDice = mock(Dice.class);
		 when(mockedDice.roll()).thenReturn(6);
		 
		 return mockedDice;
	}

}


