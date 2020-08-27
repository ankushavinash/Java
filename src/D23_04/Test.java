package D23_04;

public class Test {
	Test(byte b)
	{
		System.out.println("crime master gogo");
	}
	
	Test(short x)
	{
		System.out.println("mere karan arjun aayange");
	}
	
	Test(int x)
	{
		System.out.println("bhag milkha bhag");
	}
	
	Test(long x)
	{
		System.out.println("bhagam bhag");
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		Test t = new Test(15);
		//For accessing byte we have to first declare the type than access
		byte b = 20;
		Test t1 = new Test(b);
		System.out.println("main() ends...");

	}

}
