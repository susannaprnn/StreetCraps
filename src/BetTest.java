import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import junit.framework.TestCase;

public class BetTest {
	
	private Player createPlayer() {
		 //mock creation
		 Player mockedPlayer = mock(Player.class);
		 when(mockedPlayer.getCash()).thenReturn(300);
		 when(mockedPlayer.getName()).thenReturn("Petter");
		 return mockedPlayer;
	}
	@Test
	public void testGetBetAmount() {
		Bet bet =  new Bet(300, true, createPlayer());
		TestCase.assertTrue(bet.getAmount() == 300);
	}

	@Test
	public void testGetPlayer() {
		Player player = createPlayer();
		Bet bet =  new Bet(300, true, player);
		TestCase.assertTrue(bet.getPlayer().equals(player));
	}
	
	@Test
	public void testIsBetOnPass() {
		Bet bet =  new Bet(300, true, createPlayer());
		TestCase.assertTrue(bet.getIsBetOnPass());
	}
}
