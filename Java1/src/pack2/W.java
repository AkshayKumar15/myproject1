package pack2;

interface X
{
	static final int i=20;
	public abstract void test1();
}
interface Y
{
	public abstract void test2();
}
interface Z
{
	public abstract void test3();
}


public class W implements X,Y,Z
{
	public void test1()
	{
		System.out.println("test1 implemented");
	}
	public void test2()
	{
		System.out.println("test2 implemented");
	}
	public void test3()
	{
		System.out.println("test3 implemented");
	}

	public static void main(String[] args) 
	{
		W w1=new W();
		w1.test1();
		w1.test2();
		w1.test3();

	}

}
