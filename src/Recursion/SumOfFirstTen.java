package Recursion;


public class SumOfFirstTen {
	
	static int sum=0;
	public static int Sum(int a){
		
		if(a<=0) {
			return a; 	
		}
		else{
			return (a)+Sum((a-1));     //Print 1 to 10 in reverse recursion
		}
		
	}

	public static void main(String[] args) {
		System.out.println(Sum(10));
	}

}
