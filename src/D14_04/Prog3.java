package D14_04;

class Test {
	static int x = 10;
	static int y = 20;
	
	static
	{
		System.out.println("1");
		int x = 50;
		System.out.println(x+y);
	}
	
	static
	{
		System.out.println("30");
		int x = 60;
		System.out.println(x+y);
	}
}

public class Prog3 {

	public static void main(String[] args) {
		System.out.println(Test.x);
		System.out.println(Test.y);
		System.out.println(Test.x + Test.y);
	}
}
