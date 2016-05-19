package pack1;

class D
{
static void test()
{
	System.out.println("parent class");
}
}

public class C extends D
{
static void test()
{
	System.out.println("child class");
}
	
	public static void main(String[] args) 
	{
		test(); // child class method value
	

	}

}
