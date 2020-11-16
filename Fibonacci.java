package Fibonacci;

public class Fibonacci {

public static void Fib(){
		int x = 1;
		int y = 1;
				
		for(int i = 0; i < 15; i++) {
				x =  y - x;
				y =  y + x;
				System.out.println(x);
				
		}
		
}
	public static void main(String[] args) {
		Fib();

	}

}
