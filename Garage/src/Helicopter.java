
public class Helicopter extends Vehicle {
	int propellerSize;
	
	public void Helicopter(int propellerSize, int wheelNumber, String colour, String make, boolean hasEngine) {
		this.propellerSize = propellerSize;
		this.setWheelNumber(wheelNumber);
		this.setMake(make);;
		this.setColour(colour);
	}

}
