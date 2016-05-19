package pack1;

import java.util.Scanner;

public class K {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		
		System.out.println("Enter your Address: ");
		String address=sc.next();
		
		System.out.println("My name is " + name);
		System.out.println("My address is "+ address);
	}

}
