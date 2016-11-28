
public class Bet {
	private Player player;
	private int amount;
	private boolean isBetOnPass;
	public Bet(int amount, boolean isBetOnPass, Player player){
		this.amount = amount;
		this.isBetOnPass = isBetOnPass;
		this.player = player;
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
