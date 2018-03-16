
public class Main {

	public static void main(String[] args) {

		Swamp landgrid = new Swamp();

		Player p1 = new Player (4, 1);

		TreasureChest gold = new TreasureChest(7,3);
		
		p1.getX();
		
	    landgrid.grid(p1,gold);

		gold.getX();
	}

}