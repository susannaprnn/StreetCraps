
public class Roller {
	private Dice firstDice;
	private Dice secondDice;
	
	public Roller(Dice firstDice, Dice secondDice) {
		this.firstDice = firstDice;
		this.secondDice = secondDice;
	};
	
	public boolean PlayRound() {  // PlayRound returns false if the game has ended
		return true;	
	}
}