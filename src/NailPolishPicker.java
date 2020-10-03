import enums.BrandName;
import enums.ColorFamily;
import structs.NailPolishStruct;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NailPolishPicker {
	
	ArrayList<NailPolishStruct> polishInventory = new ArrayList<>();
	
	public NailPolishPicker() {
		createPolishInventory();
	}
	
	public NailPolishStruct choosePolish(boolean base) {
		NailPolishStruct selection = null;
		boolean chosen = false;
		
		while (!chosen) {
			selection = polishInventory.get((int) (Math.random() * polishInventory.size()));
			if ((base && !selection.isTopper()) || (!base && selection.isTopper())) {
				chosen = true;
			}
		}
		
		return selection;
	}
	
	public void createPolishInventory() {
		store(BrandName.Sally_Hansen_Insta_Dri, "493 Midnight Drive", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "443 Va-Va Violet", ColorFamily.PURPLE, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "428 Zip Wine", ColorFamily.PURPLE, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "338 Coral Commotion", ColorFamily.PINK, false, true);
		store(BrandName.Sally_Hansen_Insta_Dri, "313 Watermelon Wizz", ColorFamily.PINK, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "193 Slick Slate", ColorFamily.GREY, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "163 Taupe To Go", ColorFamily.BROWN, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "158 Hot Shot", ColorFamily.COPPER, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "153 Go For Gold", ColorFamily.GOLD, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "123 Champagne Supernova", ColorFamily.NEUTRAL, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "018 Gold Rush", ColorFamily.GOLD, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "014 Violet Velvet", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "403 Go Garnet", ColorFamily.RED, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "390 Red Carpet", ColorFamily.RED, false, false);
		store(BrandName.OPI, "Manicurist of Seville", ColorFamily.RED, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "920 Wax Poetic", ColorFamily.RED, false, false);
		store(BrandName.China_Glaze, "81570 Just Be-Claws", ColorFamily.RED, false, false);
		store(BrandName.China_Glaze, "81573 Be Merry, Be Bright", ColorFamily.RED, false, true);
		store(BrandName.NYC, "268 Fashion Ave Fuchsia", ColorFamily.RED, false, false);
		store(BrandName.PURE_ICE, "Kissing Cupid", ColorFamily.RED, false, false);
		store(BrandName.Wet_n_Wild_Megalast, "[unknown]", ColorFamily.RED, false, false);
		store(BrandName.Wet_n_Wild_Wild_Shine, "414A Red Red", ColorFamily.RED, false, false);
		store(BrandName.Finger_Paints, "Free Form Fawn", ColorFamily.RED, false, false);
		store(BrandName.Funky_Fingers, "[unknown]", ColorFamily.RED, false, false);
		store(BrandName.China_Glaze, "81571 Santa Red My List", ColorFamily.RED, false, false);
		store(BrandName.Sinful_Colors, "80 Dream On", ColorFamily.RED, false, false);
		store(BrandName.LA_Colors, "[unknown]", ColorFamily.RED, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "413 Expresso", ColorFamily.PINK, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "125 Pumped Up Pink", ColorFamily.PINK, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "820 Peach Babe", ColorFamily.PINK, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "830 Floaties", ColorFamily.PINK, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "176 Mauve It", ColorFamily.PINK, false, false);
		store(BrandName.Zoya, "Bebe", ColorFamily.PINK, false, false);
		store(BrandName.ORLY, "Bubbly Bombshell", ColorFamily.PINK, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "140 Rockstar Pink", ColorFamily.PINK, false, true);
		store(BrandName.Milani, "118 Pink Out Loud", ColorFamily.PINK, false, false);
		store(BrandName.Zoya, "[unknown]", ColorFamily.PINK, false, false);
		store(BrandName.Sally_Hansen_Sugar_Coat, "700 Cotton Candies", ColorFamily.PINK, false, false);
		store(BrandName.Wet_n_Wild_Megalast, "[unknown]", ColorFamily.PINK, false, false);
		store(BrandName.LA_Colors, "[unknown]", ColorFamily.PINK, false, false);
		store(BrandName.China_Glaze, "096 Jetstream", ColorFamily.PINK, false, false);
		store(BrandName.China_Glaze, "1012 Rose Among Thorns", ColorFamily.PINK, false, false);
		store(BrandName.China_Glaze, "1086 Under the Boardwalk", ColorFamily.PINK, false, false);
		store(BrandName.Chameleon, "chameleon?", ColorFamily.PINK, false, false);
		store(BrandName.Wet_n_Wild_Wild_Shine, "478E Lavender Creme", ColorFamily.PINK, false, false);
		store(BrandName.PURE_ICE, "Tease", ColorFamily.PINK, false, false);
		store(BrandName.Sinful_Colors, "387 Bali Mist", ColorFamily.PINK, false, false);
		store(BrandName.Revlon, "815 Glow Rosy", ColorFamily.PINK, false, false);
		store(BrandName.PURE_ICE, "Strip Tease", ColorFamily.PINK, false, false);
		store(BrandName.Bonita, "The Kiss", ColorFamily.PINK, false, false);
		store(BrandName.Wet_n_Wild_Wild_Shine, "429D Dreamy Poppy", ColorFamily.PINK, false, false);
		store(BrandName.LA_Colors, "[unknown]", ColorFamily.PINK, false, false);
		store(BrandName.Revlon_ColorStay_Gel_Envy, "400 Royal Flush", ColorFamily.PINK, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "405 Coral Reef", ColorFamily.PINK, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "219 Strobe Light", ColorFamily.PINK, true, true);
		store(BrandName.Sally_Hansen_Diamond_Strength, "43 Ruby Sequin", ColorFamily.PINK, false, false);
		store(BrandName.Savina, "Prom Dress", ColorFamily.PINK, false, false);
		store(BrandName.Wet_n_Wild_Megalast, "206C Undercover", ColorFamily.PINK, false, false);
		store(BrandName.Wet_n_Wild_Wild_Shine, "480C Sparked", ColorFamily.PINK, false, true);
		store(BrandName.Merle_Norman, "Vanilla Ice", ColorFamily.PINK, false, false);
		store(BrandName.Milani, "502 Awesome Orange", ColorFamily.ORANGE, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "20 Crushed", ColorFamily.ORANGE, false, false);
		store(BrandName.Bonita, "Cocktails and Carving", ColorFamily.ORANGE, false, false);
		store(BrandName.PURE_ICE, "Really Rio", ColorFamily.ORANGE, false, false);
		store(BrandName.LA_Colors, "[unknown]", ColorFamily.ORANGE, false, false);
		store(BrandName.China_Glaze, "178 Light My Tiki", ColorFamily.ORANGE, false, false);
		store(BrandName.ORLY, "Terracotta", ColorFamily.ORANGE, false, false);
		store(BrandName.Funky_Fingers, "[unknown]", ColorFamily.ORANGE, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "460 Snappy Sorbet", ColorFamily.ORANGE, false, false);
		store(BrandName.Wet_n_Wild_Megalast, "[unknown]", ColorFamily.ORANGE, false, true);
		store(BrandName.Wet_n_Wild_Wild_Shine, "Sunny Side Up", ColorFamily.ORANGE, false, false);
		store(BrandName.PURE_ICE, "Naughty Girl", ColorFamily.ORANGE, false, false);
		store(BrandName.Merle_Norman, "Coral Dawn", ColorFamily.ORANGE, false, false);
		store(BrandName.Sinful_Colors, "955 Pull Over", ColorFamily.YELLOW, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "27 Mellow Yellow", ColorFamily.YELLOW, false, false);
		store(BrandName.PURE_ICE, "Excuse Me", ColorFamily.YELLOW, false, false);
		store(BrandName.Sally_Hansen_Triple_Shine, "260 Statemint", ColorFamily.YELLOW, false, false);
		store(BrandName.Bitzy, "That Artista", ColorFamily.YELLOW, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "840 Teeny Bikini", ColorFamily.YELLOW, false, false);
		store(BrandName.Bitzy, "Tomatillo", ColorFamily.GREEN, false, false);
		store(BrandName.Bitzy, "Perky", ColorFamily.GREEN, false, true);
		store(BrandName.NYC, "118 Big Money Frost", ColorFamily.GREEN, false, false);
		store(BrandName.Sinful_Colors, "198 Irish Green", ColorFamily.GREEN, false, false);
		store(BrandName.Maurices, "[unknown]", ColorFamily.GREEN, false, false);
		store(BrandName.Sally_Hansen_Fuzzy_Coat, "600 Fuzzy Fantasy", ColorFamily.GREEN, false, true);
		store(BrandName.Sinful_Colors, "944 Innocent", ColorFamily.GREEN, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "02 Green With Envy", ColorFamily.GREEN, false, false);
		store(BrandName.Wet_n_Wild_Megalast, "[unknown]", ColorFamily.GREEN, false, false);
		store(BrandName.Revlon, "430 Whimsical", ColorFamily.GREEN, false, false);
		store(BrandName.China_Glaze, "1307 I Sea the Point", ColorFamily.BLUE, false, false);
		store(BrandName.ORLY, "Royal Navy", ColorFamily.BLUE, false, false);
		store(BrandName.Wet_n_Wild_Wild_Shine, "464 Rain Check", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_Sugar_Coat, "500 Razzleberry", ColorFamily.BLUE, false, false);
		store(BrandName.Sinful_Colors, "105 Midnight Blue", ColorFamily.BLUE, false, false);
		store(BrandName.Wet_n_Wild_Wild_Shine, "481E Putting on Airs", ColorFamily.BLUE, false, false);
		store(BrandName.Revlon, "460 Mysterious", ColorFamily.BLUE, false, false);
		store(BrandName.Milani, "505 Dude Blue", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "130 Blue Me Away!", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_HD, "15 DVD", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_GEM_Crush, "04 Blingtastic", ColorFamily.BLUE, false, true);
		store(BrandName.Sally_Hansen_Lustre_Shine, "007 Scarab", ColorFamily.BLUE, false, false);
		store(BrandName.Revlon_ColorStay_Gel_Envy, "440 Wild Card", ColorFamily.BLUE, false, false);
		store(BrandName.PURE_ICE, "On His Saddle", ColorFamily.BLUE, false, false);
		store(BrandName.NYC, "124 Cashmere Creme", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_Lustre_Shine, "004 Azure", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "80 S-teal a Base", ColorFamily.BLUE, false, false);
		store(BrandName.LA_Colors, "[unknown-tinyblue]", ColorFamily.BLUE, false, false);
		store(BrandName.LA_Colors, "[unknown-big]", ColorFamily.BLUE, false, false);
		store(BrandName.China_Glaze, "1007 Turned Up Turquoise", ColorFamily.BLUE, false, false);
		store(BrandName.LA_Colors, "[unknown-tinyteal]", ColorFamily.BLUE, false, false);
		store(BrandName.essie, "993 Viva Antigua!", ColorFamily.BLUE, false, false);
		store(BrandName.China_Glaze, "1216 Too Yacht to Handle", ColorFamily.BLUE, false, false);
		store(BrandName.China_Glaze, "1426 Give Me the Green Light!", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_Fuzzy_Coat, "500 Fuzz-Sea", ColorFamily.BLUE, false, true);
		store(BrandName.Sally_Hansen_Magnetic, "906 Ionic Indigo", ColorFamily.BLUE, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "170 Deep Purple", ColorFamily.PURPLE, false, false);
		store(BrandName.Sinful_Colors, "929 Let's Talk", ColorFamily.PURPLE, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "420 Lively Lilac", ColorFamily.PURPLE, false, false);
		store(BrandName.Revlon, "820 Flash of Fuchsia", ColorFamily.PURPLE, false, false);
		store(BrandName.Revlon, "917 Plum Seduction", ColorFamily.PURPLE, false, false);
		store(BrandName.LA_Colors, "[unknown]", ColorFamily.PURPLE, false, false);
		store(BrandName.LA_Colors, "Amethyst", ColorFamily.PURPLE, false, false);
		store(BrandName.Wet_n_Wild_Megalast, "208B Through the Grapevine", ColorFamily.PURPLE, false, false);
		store(BrandName.Old_Navy, "Purple Flourish", ColorFamily.PURPLE, false, false);
		store(BrandName.essie, "300 Play Date", ColorFamily.PURPLE, false, false);
		store(BrandName.Sally_Hansen_Diamond_Strength, "22 Forever Lilac", ColorFamily.PURPLE, false, true);
		store(BrandName.Sally_Hansen_Sugar_Coat, "100 Bubble Plum", ColorFamily.PURPLE, false, false);
		store(BrandName.Milani, "04A Orchidia", ColorFamily.PURPLE, false, false);
		store(BrandName.Wet_n_Wild_Wild_Shine, "488B Who is Ultra Violet?", ColorFamily.PURPLE, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "860 Water Orchid", ColorFamily.PURPLE, false, false);
		store(BrandName.Funky_Fingers, "[unknown]", ColorFamily.PURPLE, false, false);
		store(BrandName.Loreal, "500 Violet Vixen", ColorFamily.PURPLE, false, false);
		store(BrandName.Covergirl, "[unknown]", ColorFamily.PURPLE, false, false);
		store(BrandName.Revlon_Chalkboard, "Homecoming", ColorFamily.PURPLE, false, false);
		store(BrandName.Revlon_Chalkboard, "Straight A's", ColorFamily.WHITE, false, false);
		store(BrandName.Revlon, "335 Spirit", ColorFamily.WHITE, false, false);
		store(BrandName.Sinful_Colors, "Koko-Nuts", ColorFamily.WHITE, false, false);
		store(BrandName.Loreal, "102 Lightening", ColorFamily.WHITE, false, false);
		store(BrandName.Loreal, "104 Resort", ColorFamily.WHITE, false, false);
		store(BrandName.Wet_n_Wild_Megalast, "[unknown]", ColorFamily.WHITE, false, true);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "139 White On", ColorFamily.WHITE, false, false);
		store(BrandName.OPI, "Lights of Emerald City", ColorFamily.WHITE, false, true);
		store(BrandName.PURE_ICE, "Laven-dare", ColorFamily.GREY, false, false);
		store(BrandName.Finger_Paints, "Art Avenue", ColorFamily.GREY, false, false);
		store(BrandName.Sinful_Colors, "1480 Prosecco", ColorFamily.GREY, false, false);
		store(BrandName.Wet_n_Wild_Wild_Shine, "424A Black Creme", ColorFamily.BLACK, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "940 Chain Mail", ColorFamily.BLACK, false, false);
		store(BrandName.Sally_Hansen_Hard_As_Nails, "880 Black Heart", ColorFamily.BLACK, false, false);
		store(BrandName.PURE_ICE, "Bite Me", ColorFamily.GOLD, false, false);
		store(BrandName.Old_Navy, "Glitteratti", ColorFamily.GOLD, false, true);
		store(BrandName.OPI, "Gold Shatter", ColorFamily.GOLD, false, true);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "310 Gunmetal", ColorFamily.SILVER, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "220 Celeb City", ColorFamily.SILVER, false, false);
		store(BrandName.Sinful_Colors, "923 Queen of Beauty", ColorFamily.SILVER, false, true);
		store(BrandName.Kiss, "Step 1", ColorFamily.SILVER, false, false);
		store(BrandName.Kiss, "Step 2", ColorFamily.SILVER, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "230 Silver Sweep", ColorFamily.SILVER, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "970 Family Jewels", ColorFamily.MULTI, false, true);
		store(BrandName.PURE_ICE, "1014 RespecK", ColorFamily.MULTI, false, false);
		store(BrandName.Bitzy, "Sweetie Pie", ColorFamily.MULTI, false, true);
		store(BrandName.Revlon, "903 Hot for Chocolate", ColorFamily.BROWN, false, false);
		store(BrandName.Wet_n_Wild_Megalast, "201C Wet Cement", ColorFamily.BROWN, false, false);
		store(BrandName.Finger_Paints, "Art History 101", ColorFamily.BROWN, false, false);
		store(BrandName.Ceramic_Smooth, "[unknown]", ColorFamily.NEUTRAL, false, false);
		store(BrandName.Sally_Hansen_Hard_As_Nails, "Sheer French", ColorFamily.NEUTRAL, false, false);
		store(BrandName.Sally_Hansen_Xtreme_Wear, "810 Pearl Up", ColorFamily.NEUTRAL, false, false);
		store(BrandName.Wet_n_Wild_Megalast, "[unknown]", ColorFamily.NEUTRAL, false, false);
		store(BrandName.Finger_Paints, "Primitively Posh", ColorFamily.COPPER, false, false);
		store(BrandName.China_Glaze, "934 Swing Baby", ColorFamily.COPPER, false, false);
		store(BrandName.Sally_Hansen_Diamond_Strength, "670 Boardwalk", ColorFamily.COPPER, false, false);
		store(BrandName.Sally_Hansen_Insta_Dri, "Snappy Sprinkles", ColorFamily.COPPER, false, true);
		store(BrandName.Finger_Paints, "Surreal Sunset", ColorFamily.COPPER, false, false);
		store(BrandName.Cupcake_Polish, "Re-Vamped", ColorFamily.BLUE, true, false);
		store(BrandName.Finger_Paints, "Colorful Collage", ColorFamily.GOLD, true, true);
		store(BrandName.NYC, "105 Starry Silver Glitter", ColorFamily.MULTI, true, true);
		store(BrandName.ILNP, "Juliette", ColorFamily.PINK, true, false);
		store(BrandName.Superchic_Lacquer, "Mischief Night", ColorFamily.GREY, true, false);
		store(BrandName.Starrily, "Eclipse", ColorFamily.SILVER, true, true);
		store(BrandName.Starrily, "Indigo Child", ColorFamily.BLUE, true, false);
		store(BrandName.Starrily, "Ultraviolet", ColorFamily.PURPLE, true, false);
		store(BrandName.Starrily, "Rio de Janeiro", ColorFamily.PURPLE, true, true);
		store(BrandName.Glitter_Daze, "Trippy", ColorFamily.MULTI, true, false);
		store(BrandName.Cirque_Colors, "XX", ColorFamily.MULTI, true, true);
		store(BrandName.LA_Colors, "[unknown-holo]", ColorFamily.SILVER, true, true);
		store(BrandName.Lacquer_Lust, "Bonfire", ColorFamily.BROWN, true, false);
		store(BrandName.Lacquer_Lust, "Glass Slipper", ColorFamily.BLUE, true, false);
		store(BrandName.Lacquer_Lust, "Frozen Hot Chocolate", ColorFamily.BROWN, true, false);
		store(BrandName.Lacquer_Lust, "Through the Grapevine", ColorFamily.PURPLE, true, false);
		store(BrandName.Femme_Fatale, "[unknown-thermal]", ColorFamily.PURPLE, true, false);
		store(BrandName.Cirque_Colors, "We Trippy", ColorFamily.SILVER, true, true);
		store(BrandName.OPI, "Which is Witch?", ColorFamily.SILVER, true, true);
		store(BrandName.Twinkled_T, "Holo Lightning", ColorFamily.SILVER, true, true);
		store(BrandName.Twinkled_T, "Hidden Woods", ColorFamily.MULTI, true, false);
		store(BrandName.Starrily, "Balloon Animal", ColorFamily.MULTI, true, true);
		store(BrandName.Cirque_Colors, "After Party", ColorFamily.GREY, true, false);
		store(BrandName.Kiss, "Step 3", ColorFamily.GREY, true, true);
		store(BrandName.Picture_Polish, "Cabaret", ColorFamily.RED, true, false);
	}
	
	public void store(BrandName bn, String color, ColorFamily cf, boolean holo, boolean top) {
		polishInventory.add(new NailPolishStruct(bn, color, cf, holo, top));
	}
	
	public ArrayList<NailPolishStruct> getPolishInventory() {
		return polishInventory;
	}
	
}