import java.util.Scanner;

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
		//if(p1.getY() == 0) return false, if the statement is not true, then the player is not at the top of the grid
		//int temp = multiArray[p1.getX()] [p1.getY - 1];
		//multiArray[p1.getX()][p1.getY() - 1] = 1
		//multiArray[p1.getX()][p1.getY()] = temp;
		//p1.setY = p1.getY - 1;
		//
		
		//

}
}