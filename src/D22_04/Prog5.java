package D22_04;

public class Prog5 {
	Prog5(String s)
	{
		System.out.println("Constructor running without "+ s);
	}
	
	public void m1()
	{
		System.out.println("m1() sleeping");
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		Prog5 t = new Prog5("corona");
		t.m1();
		System.out.println("main() ends...");

	}

}
