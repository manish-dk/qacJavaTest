
public class Level2 {
	public static void main(String[] args) {
		System.out.println(blackjack(22,2));
		System.out.println(uniqueSum(1,1,1));
		System.out.println(tooHot(100,false));
	}
	public static int blackjack(int a, int b) {
		if (a < 0 | b < 0)
			return 0;
		if (a >= b & a < 22 | a < 22 & b > 21)
			return a;
		if (b > a & b < 22 | b < 22 & a > 21)
			return b;
		else
			return 0;
		
	}
	
	public static int uniqueSum(int a, int b, int c) {
		if (a == b && b == c) 
			return 0;
		if (a == b)
			return c;
		if (a == c)
			return b;
		if (b == c)
			return a;
		
		else
			return a + b + c;
	}
	public static boolean tooHot(int temp, boolean isSummer) {
		if (isSummer)
			if (temp > 59 & temp < 101)
				return false;
			else
				return true;
			
		else if (temp > 59 & temp < 91)
				return false;
		else
			return true;
	}

}
