package D22_04;

public class Prog2 {
	Prog2(int x, int y)
	{
		System.out.println("Constructor running with 2 int arg");
	}
	public static void main(String[] args) {
		System.out.println("main() starts...");
		//new Prog2(); CTE without argument it is called
		Prog2 t = new Prog2(4,24);
		System.out.println("main() ends...");

	}

}
