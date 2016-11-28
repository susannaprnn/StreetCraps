
public class Player {
	
		private String name;
		private int cash;
		
		public Player(String name, int cash) {
			this.name = name;
			setCash(cash);
		}
		
		public String getName(){
			return name;
		}
		
		public int getCash(){
			return cash;
		}
		
		public void setCash(int cash){
			if(cash < 0)
				throw new IllegalArgumentException();
			
			this.cash = cash;
		}
	}


