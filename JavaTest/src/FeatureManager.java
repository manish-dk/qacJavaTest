import java.util.ArrayList;
import java.util.Scanner;

public class FeatureManager {
	
	private Scanner s = new Scanner(System.in);
	private ArrayList<Feature> featureList = new ArrayList<>();
	private boolean gameState = true;

	
	public ArrayList<Feature> getFeatureList() {
		return featureList;
	}

	public void setFeatureList(ArrayList<Feature> featureList) {
		this.featureList = featureList;
	}
	
	public void addFeature(Feature a) {
		featureList.add(a);
	}
	

	public void movePlayer() {
		
//		System.out.println("1 for north, 2 for east, 3 for south, 4 for west, 5 to exit");
		
//		Using int instead of string cos scanner was being funny
		
		int move = s.nextInt();
		
		if(move == 1) {
			this.featureList.get(0).setY(featureList.get(0).getY()+1);
		}
		
		else if(move == 3) {
			this.featureList.get(0).setY(featureList.get(0).getY()-1);
		}
		
		else if(move == 2) {
			this.featureList.get(0).setX(featureList.get(0).getX()+1);
		}
		else if(move == 4) {
			this.featureList.get(0).setX(featureList.get(0).getX()-1);
		}
		
		else if(move ==5) {
			gameState = false;
			System.out.println("Wow, what a quitter!");
		}
		
	}
	
	public void gameLoop() {
		System.out.println("You are a new trainee at QAC, you are having a good time but running into the wrong person could be dangerous. \nIf you run into a good trainer you will finish training and land a job paying $9999999/yr. \nIf you run into an evil trainer you will be fired. Also you will die.");
		while(gameState) {
			
			System.out.println("Your position: x:" + featureList.get(0).getX() +" y:" + featureList.get(0).getY());
			System.out.println("1 for north, 2 for east, 3 for south, 4 for west, 5 to exit");
			
			movePlayer();
			checkStatus();
			checkLocation();
			
//			System.out.println("Your position: x:" + featureList.get(0).getX() +" y:" + featureList.get(0).getY());
			
			
		}
	}
	
	public void checkStatus() {
		for(Feature f : featureList) {
			if(featureList.get(0).getX() == f.getX() & featureList.get(0).getY() == f.getY()) {
				if(f instanceof Player) {
					continue;
				}
				else if(f instanceof AngryLunatic) {
					gameState = false;
					System.out.println("You ran into an evil trainer. You are dead.");
				}
				else if(f instanceof Treasure) {
					gameState = false;
					System.out.println("You ran into a good trainer! Congrats on that sweet new job!");
				}
			}
			
//			if(featureList.get(0).getX() > f.getX() & featureList.get(0).getY() >f.getY()) {
//				System.out.println("There is someone to the South West");
//			}
//			else if(featureList.get(0).getX() > f.getX() & featureList.get(0).getY() == f.getY()) {
//				System.out.println("There is someone to the West");
//			}
//			else if(featureList.get(0).getX() == f.getX() & featureList.get(0).getY() > f.getY()) {
//				System.out.println("There is someone to the South");
//			}
//			else if(featureList.get(0).getX() < f.getX() & featureList.get(0).getY() < f.getY()) {
//				System.out.println("There is someone to the North East");
//			}
//			else if(featureList.get(0).getX() == f.getX() & featureList.get(0).getY() < f.getY()) {
//				System.out.println("There is someone to the North");
//			}
//			else if(featureList.get(0).getX() < f.getX() & featureList.get(0).getY() == f.getY()) {
//				System.out.println("There is someone to the East");
//			}
		}
	}
	
	public void checkLocation() {
		for(Feature f : featureList) {
			
			if(featureList.get(0).getX() > f.getX() & featureList.get(0).getY() > f.getY()) {
				System.out.println("There is someone to the South West");
			}
			else if(featureList.get(0).getX() < f.getX() & featureList.get(0).getY() > f.getY()) {
				System.out.println("There is someone to the South East");
			}
			else if(featureList.get(0).getX() > f.getX() & featureList.get(0).getY() == f.getY()) {
				System.out.println("There is someone to the West");
			}
			else if(featureList.get(0).getX() == f.getX() & featureList.get(0).getY() > f.getY()) {
				System.out.println("There is someone to the South");
			}
			else if(featureList.get(0).getX() < f.getX() & featureList.get(0).getY() < f.getY()) {
				System.out.println("There is someone to the North East");
			}
			else if(featureList.get(0).getX() > f.getX() & featureList.get(0).getY() < f.getY()) {
				System.out.println("There is someone to the North West");
			}
			else if(featureList.get(0).getX() == f.getX() & featureList.get(0).getY() < f.getY()) {
				System.out.println("There is someone to the North");
			}
			else if(featureList.get(0).getX() < f.getX() & featureList.get(0).getY() == f.getY()) {
				System.out.println("There is someone to the East");
			}
		}
	}
}
