package D08_05;

public class DemoNSFlow {
	int  x = 10;
	int y = 20;
	static int m = 15;
	static int n = 25;
	
	{
		System.out.println("NSBR1");
		m1();
		System.out.println(x+y);
		x= 15;
	}
	static
	{
		System.out.println("SBR1");
		m3();
		System.out.println(m+n);
	}
	
	public static void m3()
	{
		System.out.println("m3 run");
		System.out.println(l);
		System.out.println(k);
		System.out.println(l+k+m+n);
	}
	
	public void m1()
	{
		System.out.println("m1 run");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b+x+y);
	}
	
	DemoNSFlow()
	{
		System.out.println("const run");
		x = a;
		y=b;
	}
	
	static
	{
		System.out.println("SBR2");
		m3();
		m=n;
	}
	
	{
		System.out.println("NSBR2");
		System.out.println(y+x);
		x=y=24;
		m2();
	}
	
	public void m2()
	{
		System.out.println("m2 run");
		System.out.println(b+a);
		System.out.println(a+x+b+y+m+n+l+k);
		m3();
	}

	public static void main(String[] args) {
		System.out.println("main start");
		DemoNSFlow dn1 = new DemoNSFlow();
		dn1.m1();
		dn1.m2();
		DemoNSFlow dn2 = new DemoNSFlow();
		System.out.println("main end");

	}
	int a = 25;
	int b =5;
	static int l= 23;
	static int k= 10;

}
