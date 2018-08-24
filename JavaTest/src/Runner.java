import java.util.Random;

public class Runner {
	public static void main(String[] args) {

		Random test = new Random();
		
		FeatureManager fm = new FeatureManager();
		
		Player p1 = new Player(test.nextInt(51),test.nextInt(51));
		fm.addFeature(p1);
		
		AngryLunatic al1 = new AngryLunatic(test.nextInt(51),test.nextInt(51));
		fm.addFeature(al1);
		
		Treasure t1 = new Treasure(test.nextInt(51),test.nextInt(51));
		fm.addFeature(t1);
		
		AngryLunatic al2 = new AngryLunatic(test.nextInt(51),test.nextInt(51));
		fm.addFeature(al2);
		
		Treasure t2 = new Treasure(test.nextInt(51),test.nextInt(51));
		fm.addFeature(t2);
		
		fm.gameLoop();
	
	}
}
