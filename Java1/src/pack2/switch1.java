package pack2;

public class switch1 {

	public static void main(String[] args) 
	{
		int a=1;
		String day;
		switch (a) 
		{
		case 1: day="mon";
		break;
		case 2: day="tue";
		break;
		case 3: day="wed";
		break;
		case 4: day="thu";
		break;
		case 5: day="fri";
		break;
		case 6: day="sat";
		break;
		case 7: day="sun";
		break;
		default: day="invalid entry";
		break;
		}
		System.out.println(day);

	}

}
