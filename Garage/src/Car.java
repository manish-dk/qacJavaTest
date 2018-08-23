
public class Car extends Vehicle {
	int bootSize;
	
	public Car(int bootSize, int wheelNumber, String colour, String make, boolean hasEngine) {
		this.bootSize = bootSize;
		this.setColour(colour);
		this.setMake(make);
		this.setEngine(hasEngine);
	}
	
}
