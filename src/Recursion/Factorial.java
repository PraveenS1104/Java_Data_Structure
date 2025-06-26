package Recursion;

public class Factorial {
	public static int fact(int a) {
		if(a==0 || a==1) {
			return a;
		}
		else {
			return a*fact(a-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
