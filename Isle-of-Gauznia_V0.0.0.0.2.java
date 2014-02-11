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
	}
}
