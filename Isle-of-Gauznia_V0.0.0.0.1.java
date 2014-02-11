import java.util.Scanner;
import javax.swing.JOptionPane;

public class main
{
	
	public static void main(String[] args)
	{
		int health, armor, attack, def, str, magic, ranged;
		String playerName;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Greetings, and welcome to Isle of Gauznia!\n");
		System.out.println("What is your name, adventurer? ");
		playerName = input.next();
		
		System.out.println("Welcome, " + playerName + "!");
	}
}
