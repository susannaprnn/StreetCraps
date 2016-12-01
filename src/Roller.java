public class Roller {
	private Dice firstDice;
	private Dice secondDice;
	private GameState gameState;
	private Bet bet;
	
	public Roller(Dice firstDice, Dice secondDice) {
		this.firstDice = firstDice;
		this.secondDice = secondDice;
		this.gameState = new GameState(0, 0);
	};
	
	public boolean PlayRound() {  // PlayRound returns false if the game has ended
		int sum = firstDice.roll() + secondDice.roll();
		System.out.println("Roller throws: " + sum);
		gameState.setRound(gameState.getRound() + 1);
		
		switch(sum) {
			case 2:
			case 3:
			case 12:
				this.payOutBets(false);
				
				return false;
			case 7:
				this.payOutBets(true);
				
				return false;
			default:
				if(gameState.getRound() == 1)
				{
					gameState.setPoint(sum);
					
					return true;
				}
				else
					if (gameState.getPoint() == sum) {
						this.payOutBets(true);
						
						return false;
					}
					else
						return true;
		}
	}

	private void payOutBets(boolean isPass) {
		// TODO Auto-generated method stub
		
	}

	public void setBet(Bet bet) {
	}
	
	public Bet getBet() {
		return null;
	}
	public GameState getGameState() {
		return gameState;
	}
}