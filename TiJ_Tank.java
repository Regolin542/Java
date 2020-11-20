package TiJ;

import java.util.Scanner;

class Tank{
	public int v = 20;
	public void fill() {
		if(v>=0 || v!=100) {
			for(int i = v; i<=100; i++) {
				System.out.println("Current fill percent: " + i);
			}
		}
		
		else {
			System.out.println("Tank is not empty");
		}
	}
	
	public void empty(){
		if(v!=0) {
			for(int i = v; i>=0; i--) {
				System.out.println("Current fill percent: " + i);
			}
		}
		
		else {
			System.out.println("Tank is already empty");
		}
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		String scr = sc.nextLine();
				
		switch(scr) {
		
		 	case "Fill": this.fill();
		 break;
		 
		 	case "fill": this.fill();
		 break;
			 
		 	case "empty": this.empty();
		 break;
		 
		 	case "Empty": this.empty();
		break;
		 
		 default: System.out.println("Give the program a correct statement");
		 break;
		}
	}
}

public class TiJ_Tank {

	public static void main(String[] args) {
		Tank t = new Tank();
		
		
		
		int v = 20;
		System.out.println("Current tank fill percent is: " + v);
		System.out.print("What do you want to do: ");
		t.input();
	}

}
