package D16_04;

public class StaticControlFlow {
	static int x = 10;
	static
	{
		System.out.println("Static Block Running 1");
		m1();
		System.out.println(x);
	}
	public static void m1()
	{
		System.out.println("m1() running...");
		System.out.println(y);
		System.out.println(x);
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		m2();
		m1();
		System.out.println("main() ends...");
	}
	
	public static void m2()
	{
		x= x+y;
		System.out.println("m2() running");
		System.out.println(x+y);
	}
	
	static 
	{
		System.out.println("Staatic block running 2");
		System.out.println(x);
		m2();
	}
	
	static int y=20;

}
