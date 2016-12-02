import static org.mockito.Mockito.*;


import org.junit.Test;

import junit.framework.TestCase;

public class RollerTest {

	@Test
	public void testPlayroundThrowing2() {
		Roller sut = new Roller(create1Dice(),create1Dice());
		TestCase.assertFalse(sut.PlayRound());
	}
	
	@Test
	public void testPlayroundThrowing3() {
		Roller sut = new Roller(create2Dice(),create1Dice());
		TestCase.assertFalse(sut.PlayRound());
	}
	
	@Test
	public void testPlayroundThrowing12() {
		Roller sut = new Roller(create6Dice(),create6Dice());
		TestCase.assertFalse(sut.PlayRound());
	}
	
	@Test
	public void testPlayroundThrowing6() {
		Roller sut = new Roller(create3Dice(),create3Dice());
		TestCase.assertTrue(sut.PlayRound());
	}
	
	@Test
	public void testGameStateAfterPlayroundThrowing6() {
		Roller sut = new Roller(create3Dice(),create3Dice());
		sut.PlayRound();
		
		TestCase.assertTrue(sut.getGameState().getPoint() == 6);
		TestCase.assertTrue(sut.getGameState().getRound() == 1);
	}
	
	@Test
	public void testGameStateAfterPlayroundThrowing6Twice() {
		Roller sut = new Roller(create3Dice(),create3Dice());
		sut.PlayRound();
		
		TestCase.assertFalse(sut.PlayRound());
	}
	
	private Bet createBet() {
		 //mock creation
		 Bet mockedBet = mock(Bet.class);
		 
		 return mockedBet;
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
	

	private Dice create6Dice() {
		 //mock creation
		 Dice mockedDice = mock(Dice.class);
		 when(mockedDice.roll()).thenReturn(6);
		 
		 return mockedDice;
	}
	
	@Test
	public void testGetBet() {
		Bet bet = createBet();
		Roller roller = new Roller(create3Dice(),create3Dice());
		roller.setBet(bet);
		TestCase.assertEquals(bet,roller.getBet());
	}
	
	@Test
	public void testGetPayoutBetWon() {
		Player testPlayer = new Player("Oskari", 100);
		Bet bet = new Bet(50, true, testPlayer);
		Roller roller = new Roller(create1Dice(),create6Dice());
		roller.setBet(bet);
		
		TestCase.assertFalse(roller.PlayRound());
		TestCase.assertEquals(150, testPlayer.getCash());
	}
	
	@Test
	public void testGetPayoutBetLost() {
		Player testPlayer = new Player("Oskari", 100);
		Bet bet = new Bet(50, false, testPlayer);
		Roller roller = new Roller(create1Dice(),create6Dice());
		roller.setBet(bet);
		
		TestCase.assertFalse(roller.PlayRound());
		TestCase.assertEquals(150, testPlayer.getCash());
	}
}


