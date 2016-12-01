import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.Test;

import junit.framework.TestCase;

public class GameTest {
	
	private Player createPlayer() {
		 //mock creation
		 Player mockedPlayer = mock(Player.class);
		 when(mockedPlayer.getName()).thenReturn("Petter");
		 when(mockedPlayer.getCash()).thenReturn(300);
		 return mockedPlayer;
	}
	
	@Test
	public void testGetBet() {
		Bet bet = Game.getBet(createPlayer(),new Scanner("100\nyes"));
		TestCase.assertEquals(100, bet.getAmount());
		TestCase.assertEquals(true, bet.getIsBetOnPass());
	}
	
	@Test
	public void testStart() {
		Player player = Game.start(new Scanner("Petter"));
		TestCase.assertEquals("Petter", player.getName());
	}
}
