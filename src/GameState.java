
public class GameState {
	private int round;
	private int point;

	public GameState(int round, int point){
		this.round = round;
		this.point = point;
	}
	
	public void setRound(int round){
		this.round = round;
	}
	public int getRound(){
		return round;
	}
	
	public void setPoint(int point){
		this.point = point;
	}
	public int getPoint(){
		return point;
	}
}
