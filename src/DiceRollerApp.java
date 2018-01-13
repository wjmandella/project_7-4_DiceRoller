import java.util.Scanner;

public class DiceRollerApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!\n");
			
		Scanner sc = new Scanner(System.in);
		String choice = Console.askToRoll(sc, "Roll dice? (y/n): ");
		System.out.println();
		
		while (choice.equalsIgnoreCase("y")) {	
			Dice d = new Dice();
			d.printRoll();	
			choice = Console.askToRoll(sc, "Roll again? (y/n): ");
			System.out.println();
		}	
		System.out.println("\nBye!");
	}
}
