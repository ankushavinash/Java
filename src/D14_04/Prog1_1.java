package D14_04;

class Prog1_1 {
	static int x = 10 ;
	static
	{
		///System.out.println(x);
	   x = 50;
	}

	public static void main(String[] args) {
		System.out.println("Main Running");
		System.out.println(x);
		System.out.println("Main Finish");
	}

}
