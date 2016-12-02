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
		boolean isBetOnPass = false;
		System.out.println("Roller throws: " + sum);
		gameState.setRound(gameState.getRound() + 1);
		
		if(bet != null)
			isBetOnPass = bet.getIsBetOnPass();
		
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
						this.payOutBets(isBetOnPass);
						
						return false;
					}
					else
						return true;
		}
	}

	private void payOutBets(boolean isPass) {
		if(bet == null)
			return;
		
		Player player = bet.getPlayer();
		
		if(bet.getIsBetOnPass() == isPass) {
			System.out.println("You won! You got: " + bet.getAmount() * 2);
			player.setCash(player.getCash() + bet.getAmount() * 2);
		}
		else
		{		
			player.setCash(player.getCash() - bet.getAmount());
			System.out.println("You lost! You have " + player.getCash() + " left");			
		}
	}
	
	public void setBet(Bet bet) {
		this.bet = bet;
	}
	
	public Bet getBet() {
		return bet;
	}
	public GameState getGameState() {
		return gameState;
	}
}