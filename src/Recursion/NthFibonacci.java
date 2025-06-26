package Recursion;

public class NthFibonacci {

	public static int Fibonacci(int a) {
		if(a<=1) {
			return a;
			
		}
		else {
			return Fibonacci(a-1)+Fibonacci(a-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Fibonacci(5                                                                                                    ));

	}

}
