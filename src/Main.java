import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Player player = Game.start(new Scanner(System.in));
		Bet bet = Game.getBet(player, new Scanner(System.in));
		Roller roller = new Roller(new Dice(), new Dice());
		roller.setBet(bet);
		
		while(roller.PlayRound())
			;
	}
}
