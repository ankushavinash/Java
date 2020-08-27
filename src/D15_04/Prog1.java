package D15_04;

public class Prog1 {
	static
	{
		System.out.println("Outer static Block");
		int x=10;
		int y=20;
		{
			System.out.println("Inner Static Block");
			int z=30;
			System.out.println(x+z);
		}
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println("main ends");

	}
}
