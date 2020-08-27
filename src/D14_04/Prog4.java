package D14_04;

class Test4_1 {
	    static int x = 30;
		static
		{
			System.out.println(5);
		}		
}

class Prog4{
		static
		{
			System.out.println(12);
		}
		
	public static void main(String[] args) {
		System.out.println(Test4_1.x + Test4_2.x);
	}
}

class Test4_2
{
	static int x = 20;
	static
	{
		System.out.println(50);
	}
}
