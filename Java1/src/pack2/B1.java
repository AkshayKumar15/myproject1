package pack2;

abstract class A1
{
	abstract void test();
	void test1()
	{
		System.out.println("parent class");
	}
}

public class B1 extends A1
{
	void test()
	{
		System.out.println("child class");
	}

	public static void main(String[] args) 
	{
		B1 b1=new B1();
		b1.test();
		b1.test1();

	}

}
