
public class Swamp {
	
	public void grid(Player p1, TreasureChest gold) {

		int[][] multiArray = new int[10][10];

		for (int x = 0; x < multiArray.length; x++) {
			System.out.println();
			for (int y = 0; y < multiArray.length; y++) {
				
					multiArray[p1.getX()][p1.getY()] = 1;
					
					multiArray[gold.getX()][gold.getY()] =5;
					
				System.out.print(multiArray[x][y]);

		}

	}
	}
	
	
}