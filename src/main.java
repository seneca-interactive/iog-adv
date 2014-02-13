// Isle-of-Gauznia_V0.0.0.0.3
import java.util.Scanner;

public class main
{
	private static Scanner input;
	public static void main(String[] args)
	{
		int health, armor, attack, def, str, magic, ranged; // Currently unused

		String playerName; 
		input = new Scanner(System.in);
		
		System.out.println("Greetings, and welcome to Isle of Gauznia!\n");
		System.out.println("What is your name, adventurer? ");
		playerName = input.next(); // Records the user's name.
		
		System.out.println("Welcome, " + playerName + "!");


		System.out.println("An enemy approaches!");

//		int loop_counter = 0;
//		while (loop_counter > 10){
//		loop_counter += 1;
//		System.out.println("We've printed this line " + loop_counter + " times.");
//		}

//		int round_counter = 0;


//   Player Class Arrays
//	ARRAYS SYNTAX:
// hp(0), armor(1), attack(2), def(3), str(4), magic(5), ranged(6)
		int[] assassin_Ary = { 13,2,6,2,3,1,2 };
		int[] necroman_Ary = { 8,1,3,2,2,7,1 };
		int[] ranger_Ary   = { 12,3,4,3,3,1,6 };



//   Enemy Combatants
//   (Same array syntax as player classes)
		int[] rat_stats = { 4,1,1,1,1,1,0 };		
		int[] bat_stats = { 2,1,1,1,1,1,0 };

		System.out.println( assassin_Ary[5]);

	}
}
