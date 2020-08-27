package D16_04;

public class Prog3 {
	int x = 10;
	static int y = 15;
	{
		System.out.println("NSBR1");
		System.out.println(x+y);
		x=y=25;
	}

	{
		System.out.println("NSBR2");
		System.out.println(x+y);
		x=y/5;
		y= x*2;
	}

	public static void main(String[] args) {
		Prog3 t = new Prog3();
		System.out.println(t.x + y);

	}

}
