package pack1;

public class P 
{
	P()
	{
		System.out.println("constructor1");
	}
	
	P(int i)
	{
		System.out.println("constructor2");
	}
	
	P(int i, int j)
	{
		System.out.println("constructor3");
	}

	public static void main(String[] args) 
	{
		P p1=new P();
		P p2=new P(10);
		P p3=new P(10,20);

	}

}
