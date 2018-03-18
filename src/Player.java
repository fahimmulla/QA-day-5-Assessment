public class Player {

	private int x;
	private int y;
	
	
	
	public Player(int x, int y) {
	
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public void movePositionNorth(int [] [] grid) {
		grid [x][y] = 0;
		x = x-1;
		if ( x == -1 ) {
			x = x +1;
		}
		grid [x][y] = 1;
	}
		
		public void movePositionSouth(int [] [] grid) {
			grid [x][y] = 0;
			x = x-1;
			if ( x == -1 ) {
				x = x +1;
			}
			grid [x][y] = 1;
		}
		
		public void movePositionEast(int [] [] grid) {
			grid [x][y] = 0;
			x = x-1;
			if ( x == -1 ) {
				x = x +1;
			}
			grid [x][y] = 1;
		
		}
			public void movePositionWest(int [] [] grid) {
				grid [x][y] = 0;
				x = x-1;
				if ( x == -1 ) {
					x = x +1;
				}
				grid [x][y] = 1;
			
		// if(p1.getY() == 0) return false, if the statement is not true, then the player is not at the top of the grid
				//int temp = multiArray[p1.getX()] [p1.getY - 1];
				//multiArray[p1.getX()][p1.getY() - 1] = 1
				//multiArray[p1.getX()][p1.getY()] = temp;
				//p1.setY = p1.getY - 1;
		
			}

}
