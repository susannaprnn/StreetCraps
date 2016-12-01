import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.Test;

import junit.framework.TestCase;

public class GameTest {
	
	private Scanner createNameScanner() {
		 //mock creation
		 Scanner mockedScanner = mock(Scanner.class);
		 when(mockedScanner.nextLine()).thenReturn("Petter");
		 return mockedScanner;
	}
	
	private Scanner createBetScanner(int amount) {
		 //mock creation
		 Scanner mockedScanner = mock(Scanner.class);
		 when(mockedScanner.nextInt()).thenReturn(amount);
		 return mockedScanner;
	}
	private Player createPlayer() {
		 //mock creation
		 Player mockedPlayer = mock(Player.class);
		 when(mockedPlayer.getCash()).thenReturn(300);
		 return mockedPlayer;
	}
	
	@Test
	public void testGetBet() {
		Bet bet = Game.getBet(createPlayer(),createBetScanner(50));
		TestCase.assertTrue(bet.getAmount() == 50);
	}
	
	@Test
	public void testStart() {
		Player player = Game.start(createNameScanner());
		TestCase.assertEquals("Petter", player.getName());
	}
}
