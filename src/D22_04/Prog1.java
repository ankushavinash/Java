package D22_04;

public class Prog1 {
	Prog1()
	{
		System.out.println("Constructor running without arg");
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		new Prog1();
		System.out.println("main() ends...");
	}

}
