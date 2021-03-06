// Isle-of-Gauznia
// armor module 

public class armor_gear
{
	// armor(0), def(1), 
	// copper armor
	int[] copper_bracers = { 1,0 };	
	int[] copper_breastplate = { 2,1 };
	int[] copper_headband = { 1,0 };
	int[] copper_buckler = { 1,2 };

	// bronze armor
	int[] bronze_boots = { 3,1 };
	int[] bronze_bracers = { 1,1 };	
	int[] bronze_pauldron_left = { 2,1 }; // shield arm pauldron
	int[] bronze_pauldron_right_sm = { 1,1 }; // small pauldron
	int[] bronze_breastplate = { 5,2 };
	int[] bronze_breastplate_runed = { 7,4 };
	int[] bronze_cuirass = { 8,5 };
	int[] bronze_helmet_small = { 2,2 };
	int[] bronze_helmet_full = { 3,3 };
	int[] bronze_helmet_hoplite = { 4,3 };
	int[] bronze_buckler = { 5,5 };
	
	// iron armor
	int[] iron_gauntlets = { 3,2 };
	int[] iron_bracers = { 3,1 };	
	int[] iron_chainmail = { 6,2 };
	int[] iron_cuirass = { 11,6 };
	int[] iron_helmet_small = { 4,3 };
	int[] iron_helmet_full = { 5,4 };
	int[] iron_boots = { 5,2 };
	int[] iron_pauldron_left = { 3,2 }; // shield arm pauldron
	int[] iron_pauldron_right = { 3,2 }; // shield arm pauldron
	int[] iron_pauldron_right_sm = { 2,2 }; // small pauldron
	int[] iron_greaves = { 7,4 };
	int[] iron_buckler = { 6,6 };
	int[] iron_shield_circle = { 7,7 };
	int[] iron_shield_tower = { 8,9 };
	
	// steel armor -- V.
	int[] steel_gauntlets = { 4,3 }; //V.
	int[] steel_bracers = { 3,2 }; //V.
	int[] steel_chainmail = { 8,3 }; //V.
	int[] steel_cuirass = { 13,7 }; //V.
	int[] steel_helmet_small = { 5,4 }; //V.
	int[] steel_helmet_full = { 6,5 }; //V.
	int[] steel_boots = { 6,3 }; //V.
	int[] steel_pauldron_left = { 5,3 }; // shield arm pauldron -- V.
	int[] steel_pauldron_right = { 5,3 }; // shield arm pauldron -- V.
	int[] steel_pauldron_right_sm = { 3,3 }; // small pauldron -- V.
	int[] steel_greaves = { 8,5 }; //V.
	int[] steel_buckler = { 8,7 }; //V.
	int[] steel_shield_circle = { 9,8 }; //V.
	int[] steel_shield_tower = { 10,12 }; //V.

	// cloth gear
	int[] black_cloth_robe = { 1,0 };
	int[] black_cloth_robe_oriental = { 1,0 };
	int[] black_cloth_robe_oriental_ench = { 1,3 };
	int[] white_cloth_robe = { 1,0 };
	int[] white_cloth_robe_oriental = { 1,0 };
	int[] white_cloth_robe_oriental_ench = { 1,3 };
	int[] green_cloth_robe = { 1,0 };
	int[] green_cloth_robe_oriental = { 1,0 };
	int[] green_cloth_robe_oriental_ench = { 1,3 };
	int[] grey_cloth_robe = { 1,0 };
	int[] grey_cloth_robe_oriental = { 1,0 };
	int[] grey_cloth_robe_oriental_ench = { 1,3 };
	int[] tan_cloth_robe = { 1,0 };
	int[] tan_cloth_robe_oriental = { 1,0 };
	int[] tan_cloth_robe_oriental_ench = { 1,3 };
	int[] white-black_cloth_robe = { 1,0 };
	int[] white-black_cloth_robe_oriental = { 1,0 };
	int[] white-black_cloth_robe_oriental_ench = { 1,3 };
	int[] gold_cloth_robe = { 1,0 };
	int[] gold_cloth_robe_oriental = { 1,0 };
	int[] gold_cloth_robe_oriental_ench = { 1,3 };

	int[] white_silk_robe_oriental = { 2,0 };
	int[] white_silk_robe_oriental_ench = { 2,3 };
	int[] black_silk_robe_oriental = { 2,0 };
	int[] black_silk_robe_oriental_ench = { 2,3 };
	int[] green_silk_robe_oriental = { 2,0 };
	int[] green_silk_robe_oriental_ench = { 2,3 };
	int[] purple_silk_robe_oriental = { 2,0 };
	int[] purple_silk_robe_oriental_ench = { 2,3 };

	int[] straw_sandals = { 1,0 };
	int[] cloth_wristbands = { 1,0 };
	int[] white_cloth_handwrappings = { 1,0 };
	int[] black_cloth_handwrappings = { 1,0 };
	int[] grey_cloth_handwrappings = { 1,0 };
	int[] white_cloth_shinwrappings = { 1,0 };
	int[] black_cloth_shinwrappings = { 1,0 };
	int[] grey_cloth_shinwrappings = { 1,0 };
	int[] white_cloth_cape = { 0,0 };
	int[] black_cloth_cape = { 0,0 };
	int[] gold_cloth_cape = { 0,0 };
	int[] purple_cloth_cape = { 0,0 };
	int[] white_silk_cape = { 1,0 };
	int[] black_silk_cape = { 1,0 };
	int[] green_silk_cape = { 1,0 };
	int[] purple_silk_cape = { 1,0 };
	
	// Tomes (Necromancer off-hand)
	// Stats = ?????
	// We could have each tome give different abilities even.. IE: Some just give stat boosts but others
	// Could give access to a new attack option while wielding such as "Summon wild imp"
	// That could instantly do 4 damage to your enemy and run away
	// With X% chance of summoning / control failure and the creature attacking you instead for Y damage.
	int[] tome_of_the_apprentice = {}; // Basic stat boost
	int[] tome_of_summon_wild_imp = {}; // See above idea
	int[] tome_of_summon_imp = {}; // Could stay and do damage several fight rounds, like fire damage?
	int[] book_of_Savragta = {}; 

	// rare gear (rare as in categorized as such, not necessarily
	// actual rarity, IE: some of the cloth colors above will be
	// just as rare)

	int[] senseis_robe = { 2,2 };
	int[] robe_of_the_dragon = { 0,4 };
	int[] robe_of_black_omen = { 2,3 };
	int[] robe_of_recklessness = { 0,5 };

}
