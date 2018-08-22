package Tests;

public class Factorials {
	public static void main(String[] args) {
		System.out.println(factorialTF(120));
		System.out.println(factorialTF(150));
		System.out.println(factorialTF(3628800));
		System.out.println(factorialTF(479001600));
		System.out.println(factorialTF(6));
		System.out.println(factorialTF(18));
	}
	public static String factorialTF(int arg1) {
		int inc = 2;
		while (true) {
			if (arg1==0) {
				return "NONE";
			}
			if (arg1%inc != 0) {
				return "NONE";
			}
			arg1 /= inc;
			if (arg1 == 1) {
				return  inc + "!";


			}
			inc++;
		}
		
	}
}
