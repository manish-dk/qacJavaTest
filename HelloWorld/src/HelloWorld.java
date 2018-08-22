import java.util.Random;

public class HelloWorld {

	Random rand = new Random();
	public static void main(String[] args) {

		int[] anArray = {1,2,6,7,8};
		System.out.println("Hello World!");
		assignment();
		parameters("test");
		System.out.println(returnTypes());
		System.out.println(addition(2,3));
		System.out.println(sumOrMult(2,3, false));
		System.out.println(con2(2,0,false));
		iteration();
		arrays();
		iterateArray(anArray);
	}
	public static void assignment() {
		String test = "Hello World!";
		System.out.println(test);
	}
	
	public static void parameters(String someString) {
		System.out.println(someString);
	}
	public static String returnTypes() {
		return "return a string";
	}
	public static int addition(int x, int y) {
		return x + y;
	}
	public static int sumOrMult (int x, int y, boolean z) {
		if (z) 
			return x + y;
		else
			return x*y;
		
	}
	public static int con2 (int x, int y, boolean z) {
		if (x == 0)
			return y;
		if (y==0)
			return x;
		if (z) 
			return x + y;
		else
			return x*y;
	}
	public static void iteration() {
		for(int i=0;i<10;i++)
			System.out.println(con2(i,3,true));
	}
	public static void arrays() {
		int[] someArray = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(someArray);
		System.out.println(con2(someArray[3],someArray[7],false));
	}
	public static void iterateArray(int[] test) {
		for (int element : test) {
			System.out.println(element);
		}
	}
	public static void iterateArray2(int[] someArray) {
		for (int i : someArray) {
			someArray[i] = rand.nextInt(100);
		}
	}
	

}
