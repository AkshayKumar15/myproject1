package pack2;

public class sibiib 
{
	sibiib()				// constructor
	{
		System.out.println("constructor");
	}
	static
	{
		System.out.println("SIB1");
	}
	{
		System.out.println("IIB1");
	}
	
	static void test()
	{
		System.out.println("test method");
	}

	public static void main(String[] args) 
	{
		sibiib a1=new sibiib();
		System.out.println("==================");
		test();
		System.out.println("==================");
		sibiib a2=new sibiib();

	}

}
