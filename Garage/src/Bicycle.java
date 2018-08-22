
public class Bicycle extends Vehicle {
	private int gearNumber;
	
	public void Bicycle(String make, int wheelNumber, String colour, boolean hasEngine) {
		this.setMake(make);
		this.setWheelNumber(wheelNumber);
		this.gearNumber = gearNumber;
		this.setColour(colour);
	}
}
