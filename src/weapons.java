// Isle-of-Gauznia
// weapons module 
// "V." tag added to weapons inserted by ArnoldM904, feel free to edit or delete. 

// Weapon related ideas:
// - Give weapons ID numbers
// - Give weapons more stats (IE: Magic damage, powers, attack speed, etc)


public class weapons
{
	// min(0), max(1), att(2), str(3), crit(4)
	// bronze weapons
	int[] bronze_dirk = { 1,2,1,1,6 };
	int[] bronze_dagger = { 1,2,2,1,7 };
	int[] bronze_shortsword = { 2,4,3,2,5 };
	int[] bronze_scimitar = { 1,5,3,3,3 };
	int[] bronze_longsword = { 2,5,3,3,3 };
	int[] bronze_hatchet = { 3,4,2,4,2 };
	int[] bronze_waraxe = { 2,5,2,4,3 };
	int[] bronze_battleaxe = { 2,7,2,5,4 };

	// iron weapons
	int[] iron_dirk = { 1,3,2,1,7 };
	int[] iron_dagger = { 1,3,2,1,9 };
	int[] iron_shortsword = {}; //V. {2,4,3,3,7}?
	int[] iron_longsword = {}; //V. {2,5,2,4,9}?
	int[] iron_greatsword = {}; //V. {4,8,2,6,12} - Cannot weild shield
	int[] iron_tanto = { 1,4,2,2,9 };
	int[] iron_katana = { 2,8,7,7,9 };

	// steel weapons
	int[] steel_stiletto = { 1,3,3,2,12 };
	int[] steel_dagger = { 2,3,3,2,11 };
	int[] steel_tanto = { 2,4,3,3,11 };
	int[] steel_shortsword = { 2,6,4,3,8 };
	int[] steel_gladius = { 2,6,4,4,9 };
	int[] steel_scimitar = { 2,6,5,5,9 };
	int[] steel_longsword = { 2,6,6,4,10 };
	int[] steel_staff = { 3,4,7,2,9 };
	int[] steel_greatsword {}; //V. {5,10,2,8,16}
	
	// Ranged weapons
	// min(0), max(1), hit_chance(2), str(3), crit(4), magic damage(5)
	// Each hit chance number represents a 10% chance to hit. IE: 1 = 10% chance to hit, 10 = 100% chance to hit
	
	// Bows
	int[] novice_bow = {1,2,8,1,4,0}; //V.
	int[] wooden_short_bow = {1,4,8,2,6,0}; //V.
	int[] sturdy_wooden_bow = {2,5,8,3,8}; //V.
	int[] maple_short_bow = {}; //V.
	int[] maple_long_bow = {}; //V.
	int[] magic_short_bow = {}; //V.
	int[] enchanted_fire_bow = {6,9,6,6,14,4}; //V.
	
	// Wands
	int[] novice_wand = {1,2,8,0,4,1};
	int[] beginners_wand = {};
	int[] apprentices_wand = {};
	int[] journeymans_wand = {};
	// add more
	int[] masters_wand = {};
	// add more?
	
	// Enchanted meele weapons
	
	// Tombs (IE: Necromancer spell books used as an off-hand)
}
