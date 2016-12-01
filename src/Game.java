import java.util.Scanner;

public class Game {
	
	public static Player start(Scanner scan){
		String name;	
		System.out.print("Name: ");
		name = scan.next();
		
		return new Player(name,100);
	}
	
	public static Bet getBet(Player player, Scanner scan){
		int betAmount;
		String answer;
		System.out.println("How much do you want to bet: ");
		while (!scan.hasNextInt())
		{
			scan.nextLine();
			System.out.println("How much do you want to bet: ");
		}
		
		betAmount = scan.nextInt();	
		
		if(player.getCash() < betAmount) {
			System.out.println("You don't have enough money, I will just take all you have");
			betAmount = player.getCash();
		}
		
		System.out.println("Do you want to bet on pass? ");
		answer = scan.next();	
		
		Bet bet = new Bet(betAmount,answer.equals("yes"),player);
	    return bet;
	}
}

