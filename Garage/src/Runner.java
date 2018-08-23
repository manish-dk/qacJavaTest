import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		Garage g1 = new Garage();
		Car c1 = new Car(27,4,"red","Ferrari",true);
		Car c2 = new Car(16,4,"red","Ferrari",true);
		Helicopter h1 = new Helicopter(200, 0, "blue", "some make",true);
		Bicycle b1 = new Bicycle("make x", 2, "green", 10, false);
		Bicycle b2 = new Bicycle("make x", 2, "green", 3, false);
		g1.addVehicle(c1);
		g1.addVehicle(c2);
		g1.addVehicle(h1);
		g1.addVehicle(b1);
		g1.addVehicle(b2);
//		g1.removeVehicle(4);
//		g1.emptyGarage();
//		System.out.println(g1.vehicleList.size());
		
		System.out.println(g1.calcBill(g1.vehicleList));
	}
}
