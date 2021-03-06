
public class Bet {
	private Player player;
	private int amount;
	private boolean isBetOnPass;
	public Bet(int amount, boolean isBetOnPass, Player player){
		if(player.getCash()<amount)
			throw new IllegalArgumentException();
		setAmount(amount);
		player.setCash(player.getCash()-amount);
		this.isBetOnPass = isBetOnPass;
		this.player = player;
	}

	private void setAmount(int amount) {
		if(amount <= 0)
			throw new IllegalArgumentException();
		else
			this.amount = amount;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public boolean getIsBetOnPass(){
		return isBetOnPass;
	}
}
