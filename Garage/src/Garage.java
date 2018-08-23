import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	
	public String calcBill(ArrayList<Vehicle> someArray) {
		String bill = "";
		int carNumber = 1;
		int helicopterNumber = 1;
		int bicycleNumber = 1;
		if (someArray.isEmpty()) {
			return "Garage is empty";
		}
		for(Vehicle i : someArray) {
			if(i instanceof Car) {
				Car iCar = (Car) i;
				bill = bill +"\nCar"+ Integer.toString(someArray.indexOf(i))+ " - $" +iCar.bootSize*2; 
				carNumber++;
			}
			else if(i instanceof Helicopter) {
				Helicopter iHelicopter = (Helicopter) i;
				bill = bill + "\nHelicopter"+ Integer.toString(someArray.indexOf(i))+ " - $" +iHelicopter.propellerSize*2000;
				helicopterNumber++;
			}
			else if(i instanceof Bicycle) {
				Bicycle iBicycle = (Bicycle) i;
				bill = bill + "\nBicycle"+ Integer.toString(someArray.indexOf(i))+ " - $" + iBicycle.gearNumber * 20;
				bicycleNumber++;
			}
		}
		return bill;
	}
	
	public void addVehicle(Vehicle a) {
		vehicleList.add(a);	
		
	}
	
	public void emptyGarage() {
		vehicleList.clear();
	}
	
	public void removeVehicle(int i) {
		vehicleList.remove(i);
	}
	
}
