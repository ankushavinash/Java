package D15_04;

public class Prog3 {
	{
		//without object creation non static block will not execute
		System.out.println("non static block running");
	}
	static
	{
		System.out.println("Static block running");
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		new Prog3();
		System.out.println("main ends");
	}

}

