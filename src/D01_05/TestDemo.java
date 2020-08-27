package D01_05;

public class TestDemo {

	public static void main(String[] args) {

		Test t = new Test();
	}

}

class Demo{
	Demo()
	{
		System.out.println("Demo Constructor running");
	}
}

class Test extends Demo {
	Test()
	{
		System.out.println("Test Constructor running");
	}
}