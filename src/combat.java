public class combat(/*player_health_cb, enemy_health_cb*/){

	void round(){
		System.out.print("An enemy approaches!\n");
		}
		
	// Pseudocode is better than no code -- V.
	// 
	// User and enemy are placed together in a function
	// Armor, weapon, and creature values are initalized
	
	// User is given a choice
	
	// Unique attack (IE: Class special move such as fireball)
	// other unique attacks?
	// Basic attack
	// Flee
	
	// (Assuming player attack)
	// Generate random number + chance of crit based on user stats and attack choice
	// Generate random chance of hitting based on stats and attack choice
	// If hit subtract number from monster's health
	
	// Monster generates random number amount of damage based on stats and stance (IE: Frenzied)
	// Monster percentage for crit generated, if crit, add to damage
	// Monster generates random number % chance of hit
	// If hit = true, then deal damage to player
	
	// Players turn again, repeat above processes until either
	// player is dead, player flees, or monster is dead
	
	// Loop finishes
	// Player is given loot?
	
	// Leave combat
}
