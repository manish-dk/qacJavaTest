import java.util.ArrayList;

public class People {
	public static void main(String[] args) {
		ArrayList<Object> personArray = new ArrayList<>();
		
		Person person1 = new Person("John",55,"Banker");
		personArray.add(person1);
		
		Person person2 = new Person("Mark",36,"Mechanic");
		personArray.add(person2);
		
		Person person3 = new Person("John",46,"Mechanic");
		personArray.add(person3);
		
		for(Object i : personArray) {
			System.out.println(i);
		
	
		}
		
	}
	
	public static String getPersonByName(String name) {
		for (Object i : personArray) {
			if (i.name == name)
					return i.name;
		else
			return personArray[0];
		}
		
	}
	
	

}