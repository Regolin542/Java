package TiJ;


class Dog{
	String name;
	
	public void Bark() {
		if(name == "Dominik") System.out.println("Zdrovit");
		else if(name == "Azor") System.out.println("Bark!!");
		else System.out.println("Hau!");
	}
	
	public void Howl() {
		if(name == "Dominik") System.out.println("Woooooooooooooooooooooodka");
		else System.out.println("Aaaaaaaaaaauuuuuuuuuuuuuu!!");
	}
	
}

public class First_OOP {

	
	public static void main(String[] args) {
			Dog d = new Dog();
			Dog d2 = new Dog();
			
			d.name = "Dominik";
			d.Bark();
			d.Howl();
			
			d2.name = "Azor";
			d2.Bark();
			d2.Howl();
		}

	}