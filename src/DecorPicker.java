import structs.DecorStruct;
import structs.NailPolishStruct;

import java.util.ArrayList;

public class DecorPicker {
	
	ArrayList<String> howMuchOptions = new ArrayList<>();
	ArrayList<String> decorTypeOptions = new ArrayList<>();
	ArrayList<String> stampingPlateOptions = new ArrayList<>();
	ArrayList<String> stampingPolishOptions = new ArrayList<>();
	ArrayList<String> gemOptions = new ArrayList<>();
	ArrayList<String> glitterOptions = new ArrayList<>();
	ArrayList<String> vinylOptions = new ArrayList<>();
	ArrayList<String> stickerOptions = new ArrayList<>();
	ArrayList<String> handDrawnOptions = new ArrayList<>();
	
	public DecorPicker() {
		createHowMuchOptions();
		createDecorTypeOptions();
		createStampingPlateOptions();
		createStampingPolishOptions();
		createGemOptions();
		createGlitterOptions();
		createVinylOptions();
		createStickerOptions();
		createHandDrawnOptions();
	}
	
	public DecorStruct chooseDecor() {
		String howMuch = chooseHowMuch();
		String type = chooseType();
		String details = chooseDetails(type);
		
		return new DecorStruct(howMuch, type, details);
	}
	
	public void createHowMuchOptions() {
		howMuchOptions.add("index finger");
		howMuchOptions.add("thumb and ring finger");
		howMuchOptions.add("all nails");
	}
	
	public void createDecorTypeOptions() {
		decorTypeOptions.add("stamping");
		decorTypeOptions.add("topper polish");
		decorTypeOptions.add("gems");
		decorTypeOptions.add("glitter");
		decorTypeOptions.add("nail vinyls");
		decorTypeOptions.add("stickers");
		decorTypeOptions.add("hand-drawn");
	}
	
	public void createStampingPlateOptions() {
		stampingPlateOptions.add("rectangle plate 26");
		stampingPlateOptions.add("rectangle plate Time Machine 134");
		stampingPlateOptions.add("rectangle plate 206");
		stampingPlateOptions.add("rectangle plate 207");
		stampingPlateOptions.add("rectangle plate 217");
		stampingPlateOptions.add("rectangle plate 218");
		stampingPlateOptions.add("rectangle plate 220");
		stampingPlateOptions.add("square plate 102");
		stampingPlateOptions.add("square plate 103");
		stampingPlateOptions.add("square plate 104");
		stampingPlateOptions.add("square plate 105");
		stampingPlateOptions.add("square plate 106");
		stampingPlateOptions.add("square plate 107");
		stampingPlateOptions.add("square plate 108");
		stampingPlateOptions.add("square plate 112");
		stampingPlateOptions.add("square plate 114");
		stampingPlateOptions.add("square plate 116");
		stampingPlateOptions.add("square plate 120");
		stampingPlateOptions.add("square plate 170");
		stampingPlateOptions.add("square plate 172");
		stampingPlateOptions.add("square plate 179");
		stampingPlateOptions.add("square plate 189");
		stampingPlateOptions.add("square plate 190");
		stampingPlateOptions.add("square plate 206");
		stampingPlateOptions.add("square plate 213");
		stampingPlateOptions.add("square plate 214");
		stampingPlateOptions.add("square plate 219");
		stampingPlateOptions.add("square plate 220");
		stampingPlateOptions.add("square plate 232");
		stampingPlateOptions.add("square plate 302");
		stampingPlateOptions.add("square plate 303");
		stampingPlateOptions.add("square plate 318");
		stampingPlateOptions.add("square plate 409");
		stampingPlateOptions.add("circle plate 020");
		stampingPlateOptions.add("circle plate 202");
		stampingPlateOptions.add("circle plate 203");
		stampingPlateOptions.add("circle plate 207");
		stampingPlateOptions.add("circle plate 216");
		stampingPlateOptions.add("circle plate 225");
		stampingPlateOptions.add("circle plate 417");
		stampingPlateOptions.add("circle plate 418");
		stampingPlateOptions.add("circle plate 420");
		stampingPlateOptions.add("circle plate 421");
		stampingPlateOptions.add("circle plate 422");
		stampingPlateOptions.add("circle plate 426");
		stampingPlateOptions.add("circle plate 701");
		stampingPlateOptions.add("circle plate 709");
		stampingPlateOptions.add("circle plate 710");
		stampingPlateOptions.add("circle plate 712");
		stampingPlateOptions.add("circle plate 714");
		stampingPlateOptions.add("circle plate 717");
		stampingPlateOptions.add("circle plate 721");
		stampingPlateOptions.add("circle plate 722");
	}
	
	public void createStampingPolishOptions() {
		stampingPolishOptions.add("BMC 125 Angelic White");
		stampingPolishOptions.add("BMC 126 Noir Black");
		stampingPolishOptions.add("BMC 127 Iced Silver");
		stampingPolishOptions.add("BMC 128 Liquid Gold");
		stampingPolishOptions.add("BMC 129 Royal Blue");
		stampingPolishOptions.add("BMC 130 Crimson Red");
		stampingPolishOptions.add("BMC 164 Planet Silk");
		stampingPolishOptions.add("BMC 196 Annato Clay");
		stampingPolishOptions.add("BMC 197 Tree of Life");
		stampingPolishOptions.add("BMC 200 Indikon");
		stampingPolishOptions.add("BMC 201 Arabica");
		stampingPolishOptions.add("BMC 244 Malachite");
		stampingPolishOptions.add("BMC 253 Ultra Violet");
		stampingPolishOptions.add("Twinkled T 2 Red");
		stampingPolishOptions.add("Twinkled T 4 Teal");
		stampingPolishOptions.add("Twinkled T 5 Green");
		stampingPolishOptions.add("Twinkled T 7 Pearly White");
		stampingPolishOptions.add("Twinkled T 9 Blue");
		stampingPolishOptions.add("Twinkled T 11 Purple");
	}
	
	public void createGemOptions() {
		gemOptions.add("Seashells");
		gemOptions.add("Shape Gems");
		gemOptions.add("Metal Dots");
		gemOptions.add("Lil Balls");
		gemOptions.add("Blue Sequins");
		gemOptions.add("Neon Caps");
		gemOptions.add("Emo Rhinestones");
		gemOptions.add("Clear Candy Gems");
		gemOptions.add("Wheel Gems");
	}
	
	public void createGlitterOptions() {
		glitterOptions.add("Big Holo Hexagons");
		glitterOptions.add("Relique Raspberry");
		glitterOptions.add("Relique Chartreuse");
		glitterOptions.add("Relique Glitz Silver");
		glitterOptions.add("Shattered Opal");
		glitterOptions.add("Shattered Fire Opal");
		glitterOptions.add("Holo Glitter Powder");
		glitterOptions.add("Gold Leaf");
		glitterOptions.add("Rose Gold Leaf");
	}
	
	public void createVinylOptions() {
		vinylOptions.add("BMC Hearts");
		vinylOptions.add("BMC Wonky Hearts");
		vinylOptions.add("BMC Anchor");
		vinylOptions.add("BMC Martini");
		vinylOptions.add("BMC Palm Tree");
		vinylOptions.add("BMC Heartbeat");
		vinylOptions.add("BMC Squiggles & Hearts");
		vinylOptions.add("Cina Crazy Lines");
	}
	
	public void createStickerOptions() {
		stickerOptions.add("Kiss Seaside");
		stickerOptions.add("Kiss Holiday");
		stickerOptions.add("Kiss OG Edges");
		stickerOptions.add("Cina Santa's Helpers");
		stickerOptions.add("Sloths");
		stickerOptions.add("Cina Under the Sea");
		stickerOptions.add("Cina Petal Pusher");
	}
	
	public void createHandDrawnOptions() {
		handDrawnOptions.add("French Tips");
		handDrawnOptions.add("Watermarble");
		handDrawnOptions.add("Flowers");
		handDrawnOptions.add("Doticure");
	}
	
	public String chooseHowMuch() {
		return chooseRandom(howMuchOptions);
	}
	
	public String chooseType() {
		return chooseRandom(decorTypeOptions);
	}
	
	public String chooseDetails(String type) {
		String result = "";
		
		switch (decorTypeOptions.indexOf(type)) {
			case 0:	// stamping
				String plate = chooseRandom(stampingPlateOptions);
				String polish = chooseRandom(stampingPolishOptions);
				result = plate + " and stamping polish";
				
				int numExtraPolishes = (int) (Math.random() * 2);
				if (numExtraPolishes > 0) {
					result += "es " + polish;
					StringBuilder resultBuilder = new StringBuilder(result);
					for (int i = 0; i < numExtraPolishes; i++) {
						boolean added = false;
						while (!added) {
							String newPolish = chooseRandom(stampingPolishOptions);
							if (!resultBuilder.toString().contains(newPolish)) {
								resultBuilder.append(", ").append(newPolish);
								added = true;
							}
						}
					}
					result = resultBuilder.toString();
				} else {
					result += " " + polish;
				}
				break;
			case 1:	// topper polish
				NailPolishPicker chooseTopper = new NailPolishPicker();
				NailPolishStruct topper = chooseTopper.choosePolish(false);
				result = topper.toString();
				break;
			case 2:	// gems
				result = chooseRandom(gemOptions);
				break;
			case 3:	// glitter
				result = chooseRandom(glitterOptions);
				break;
			case 4:	// nail vinyls
				result = chooseRandom(vinylOptions);
				break;
			case 5:	// stickers
				result = chooseRandom(stickerOptions);
				break;
			case 6:	// hand-drawn
				result = chooseRandom(handDrawnOptions);
		}
		
		return result;
	}
	
	public String chooseRandom(ArrayList<String> list) {
		return list.get((int) (Math.random() * list.size()));
	}

}