import java.util.Scanner;

public class Game {
	
	public static Player start(Scanner scan){
		String name;	
		System.out.print("Name: ");
		name = scan.nextLine();
		
		return new Player(name,100);
	}
	
	public static Bet getBet(Player player, Scanner scan){
		int betAmount;
		String answer;
		
		System.out.println("How much do you want to bet: ");
		betAmount = scan.nextInt();	
		System.out.println("Do you want to bet on pass? ");
		answer = scan.next();	
		
		Bet bet = new Bet(betAmount,answer.equals("yes"),player);
	    return bet;
	}
}

