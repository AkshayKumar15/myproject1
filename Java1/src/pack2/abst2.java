package pack2;

interface A
{
 void test1();

	
}

public class abst2 implements A{
	
	public void test1()
	{
		System.out.println("method");
	}

	public static void main(String[] args) 
	{
		abst2 a1=new abst2();
		a1.test1();

	}

}
