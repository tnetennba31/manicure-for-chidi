package structs;

import enums.BrandName;
import enums.ColorFamily;

public class NailPolishStruct {
	
	private final BrandName brand;
	private final String color;
	private final ColorFamily colorFam;
	private final boolean holo_or_specialty;
	private final boolean topper;
	
	public NailPolishStruct (BrandName brand, String color, ColorFamily colorFam,
													 boolean holo_or_specialty, boolean topper) {
		this.brand = brand;
		this.color = color;
		this.colorFam = colorFam;
		this.holo_or_specialty = holo_or_specialty;
		this.topper = topper;
	}
	
	public BrandName getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public ColorFamily getColorFam() {
		return colorFam;
	}
	
	public boolean isHolo_or_specialty() {
		return holo_or_specialty;
	}
	
	public boolean isTopper() {
		return topper;
	}
	
	@Override
	public String toString() {
		return color + " by " + brand.name().replace('_', ' ');
	}
}