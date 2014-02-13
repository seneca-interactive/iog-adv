// Isle-of-Gauznia_V0.0.0.5
import java.util.Scanner;

public class main
{
	private static Scanner input;
	public static void main(String[] args)
	{
		int health, armor, attack, def, str, magic, ranged; // Currently unused

		String playerName;
		String playerClass;
		String assassin_title = "assassin";
		String necromancer_title = "necromancer";
		String ranger_title = "ranger";
		
		input = new Scanner(System.in);
		
		System.out.println("Greetings, and welcome to Isle of Gauznia!\n");
		System.out.println("What is your name, adventurer? ");
		playerName = input.nextLine(); // Records the user's name.
		
		System.out.println("Welcome, " + playerName + "!\n");
		System.out.println("Please select a class: ");
		// System.out.println("Paladin");
		// System.out.println("Barbarian");
		// System.out.println("Mage");
		// System.out.println("Druid");
		System.out.println("a - Assassin");
		System.out.println("n - Necromancer");
		System.out.println("r - Ranger\n");
		playerClass = input.next();
		
		
		if(playerClass.equals("a"))
		{
			playerClass = assassin_title;
		}
		else if(playerClass.equals("n"))
		{
			playerClass = necromancer_title;
		}
		else if(playerClass.equals("r"))
		{
			playerClass = ranger_title;
		}
		else
		{
			System.out.println("Please go back and enter the correct input.");
		}
		
		System.out.println("Ah, I knew it, you looked like a " + playerClass + " to me.");
		
		System.out.println("An enemy approaches!");

		// int round_counter = 0;

		// Player Class Arrays
		// ARRAYS SYNTAX:
		// hp(0), armor(1), attack(2), def(3), str(4), magic(5), ranged(6)
		int[] assassin_starter_stats = { 13,2,6,2,3,1,2 };
		int[] necromancer_starter_stats = { 8,1,3,2,2,7,0 }; // Default class stats
		int[] ranger_starter_stats = { 12,3,4,3,3,0,6 };
		
		// Enemy Combatants
		// (Same array syntax as player classes)
		int[] rat_stats = { 4,1,1,1,1,1,0 };	
		int[] bat_stats = { 2,1,1,1,1,1,0 };

		System.out.println( assassin_starter_stats[5]);
		
	}
}
