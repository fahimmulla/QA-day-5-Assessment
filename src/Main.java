import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		{Scanner userinput = new Scanner(System.in);

		System.out.println("Welcome to The Adventure of the barren moor");
		System.out.println("Lets begin the game");
		System.out.println("Enter your name");
	
		String userName = userinput.nextLine();
		System.out.println("Welcome :" + userName );
	
		System.out.println("You have entered the swamp");
		
		System.out.println();
		Swamp landgrid = new Swamp();

		Player p1 = new Player (1, 1);

		TreasureChest gold = new TreasureChest(7,3);
		
		p1.getX();
		
	    landgrid.creategrid(p1,gold);

		gold.getX();
		
		
		
		if (input.equal("north") || input .equals ("south") || input .equals ("east") || input  ("west") {
		
		switch (userinput.nextLine().charAt(0))
		{
		case ("north"):
			p1.movetoNorth(landgrid);
			break;
		case ("south"):
			p1.movetoSouth
			break;
		case ("east"):
			p1.movetoEast
			break;
		case  ("west"):
			p1.movetoWest
			break;
		default:
			
	}
	
		}
		
	}
}
