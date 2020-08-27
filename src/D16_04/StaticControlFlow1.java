package D16_04;

public class StaticControlFlow1 {
	static int x = 15;
	static int z = 20;
	static
	{
		System.out.println("Static Block Running 1");
		m1();
		/*System.out.println(y); we cannot access y here because it is in 
		read only stage means the y is declared at the last*/
		System.out.println(z);
	}
	public static void m1()
	{
		System.out.println("m1() running...");
		System.out.println(y);
		System.out.println(x);
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
	}
	static
	{
		System.out.println("Static block running 2");
		//System.out.println(x+y); CTE as y is in read only stage
		System.out.println(z);
	}
	static int y = 30;

}
