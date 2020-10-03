package structs;

public class DecorStruct {
	
	private String howMuch;
	private String decorType;
	private String decorDetails;
	
	public DecorStruct(String howMuch, String decorType, String decorDetails) {
		this.howMuch = howMuch;
		this.decorType = decorType;
		this.decorDetails = decorDetails;
	}
	
	public String getHowMuch() {
		return howMuch;
	}
	
	public String getDecorType() {
		return decorType;
	}
	
	public String getDecorDetails() {
		return decorDetails;
	}
	
	public void setHowMuch(String howMuch) {
		this.howMuch = howMuch;
	}
	
	public void setDecorType(String decorType) {
		this.decorType = decorType;
	}
	
	public void setDecorDetails(String decorDetails) {
		this.decorDetails = decorDetails;
	}
	
	@Override
	public String toString() {
		return decorType + " on " + howMuch + " using " + decorDetails;
	}
}