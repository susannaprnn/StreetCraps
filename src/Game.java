import java.util.Scanner;

public class Game {
	
	public static Player start(Scanner scan){
		String name;
		int bet;
		
		System.out.print("Name: ");
		name = scan.nextLine();
		
		return new Player(name,100);
	}
	
	public static Bet getBet(Player player, Scanner scan){
		return null;
	}
}

