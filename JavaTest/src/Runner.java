import java.util.Random;

public class Runner {
	public static void main(String[] args) {

//		Forgot how to generate random numbers for locations of features.
//		Random test = new Random
		
		FeatureManager fm = new FeatureManager();
		
		Player p1 = new Player(5,6,"healthy");
		fm.addFeature(p1);
		
		AngryLunatic al1 = new AngryLunatic(6,6);
		fm.addFeature(al1);
		
		Treasure t1 = new Treasure(5,5);
		fm.addFeature(t1);
		
		fm.gameLoop();
	
	}
}
