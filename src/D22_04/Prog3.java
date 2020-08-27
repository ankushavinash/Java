package D22_04;

public class Prog3 {
	Prog3()
	{
		System.out.println("Constructor running without arg");
	}
	
	{
		System.out.println("Non static block 1 running");
	}
	public static void main(String[] args) {
		System.out.println("main() starts...");
		new Prog3();
		System.out.println("main() ends...");
	}
	
	{
		System.out.println("Non static block 2 running");
	}

}
