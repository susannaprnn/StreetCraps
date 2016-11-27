
public class Roller {
	private Dice firstDice;
	private Dice secondDice;
	
	public Roller(Dice firstDice, Dice secondDice) {
		this.firstDice = firstDice;
		this.secondDice = secondDice;
	};
	
	public boolean PlayRound() {  // PlayRound returns false if the game has ended
		int sum = firstDice.roll() + secondDice.roll();
		
		return !isCrap(sum);
	}

	private boolean isCrap(int sum) {
		return (sum == 2 || sum == 3 || sum == 12);			
	}
}