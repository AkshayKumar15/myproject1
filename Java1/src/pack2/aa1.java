package pack2;

public class aa1 {

	public static void main(String[] args) 
	{
		int month=6;
		String monthString;
		switch(month) {
		case 1: monthString="sun";
		break;
		case 2: monthString="mon";
		break;
		case 3: monthString="tue";
		break;
		case 4: monthString="wed";
		break;
		case 5: monthString="thu";
		break;
		case 6: monthString="fri";
		break;
		case 7: monthString="sat";
		break;
		default: monthString="invalid";
		break;
		}
		System.out.println(monthString);

	}

}
