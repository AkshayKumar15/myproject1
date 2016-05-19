package pack1;

public class B {
	
	static boolean test()		//no-arg method
	{
		System.out.println("Hamenth");
		return true;
	}
	static int test(int i)		// int type arg method
	{
		System.out.println("Harsha");
		return 10;
	}
	

	public static void main(String[] args) 
	{
		test();
		System.out.println("*******************");
		System.out.println(test());
		System.out.println("*******************");
		test(10);

	}

}
