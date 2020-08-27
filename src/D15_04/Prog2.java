package D15_04;

public class Prog2 {
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
		System.out.println("main ends");
	}

}
