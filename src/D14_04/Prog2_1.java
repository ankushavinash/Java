package D14_04;

public class Prog2_1 {
	static int x = 10;
	static int y = 20;
	static
	{
		System.out.println("Static Block Running 1");
		x = 50;
	}

	public static void main(String[] args) {
		System.out.println("Main Running..");
		System.out.println(x + y);
		System.out.println("Main Finish");
	}
	
	static
	{
		System.out.println("Static Block Running 2");
		y = 60;
	}

}
