
public class Bicycle extends Vehicle {
	int gearNumber;
	
	public Bicycle(String make, int wheelNumber, String colour,int gearNumber, boolean hasEngine) {
		this.setMake(make);
		this.setWheelNumber(wheelNumber);
		this.gearNumber = gearNumber;
		this.setColour(colour);
	}
}
