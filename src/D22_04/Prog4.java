package D22_04;

public class Prog4 {
	Prog4()
	{
		System.out.println("Constructor running without arg");
	}
	
	{
		System.out.println("Non static block 1 running");
	}
	
	public static void main(String[] args) {
		System.out.println("main() starts...");
		new Prog4().m1();
		System.out.println("main() ends...");

	}
	
	public void m1()
	{
		System.out.println("m1() running");
	}

}
