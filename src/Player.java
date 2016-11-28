
public class Player {
	
		private String name;
		private int cash;
		
		public Player(String name, int cash) {
			this.name = name;
			if(cash >= 0)
				this.cash = cash;
			else 
				throw new IllegalArgumentException();
		}
		
		public String getName(){
			return name;
		}
		
		public int getCash(){
			return cash;
		}

	}


