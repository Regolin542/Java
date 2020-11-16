package TiJ;

class Pets{
	public void Cat(int i, String s) {
		this.Dog("Hello World", 420);
	}
	
	public void Dog(String s, int i) {
		System.out.println("String s = " + s);
		System.out.println("Int i = " + i);
	}
}


public class Const_in_const {

	public static void main(String[] args) {
		Pets p = new Pets();
		p.Cat(420, "Hello World");
	}

}
