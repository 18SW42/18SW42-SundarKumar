import java.util.Scanner;
public class Tasktwo
{

	public static void main(String[] args)
	{
		int unit;
		long bill;
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter number of units : ");
		unit = input.nextInt();
		
		if(unit <=50)
		{
			bill = 10*unit ;
			System.out.println("Bill is : Rs." + bill);
		}
		else if( unit > 50 && unit <= 100)
		{
			bill = (50*10) + (unit-50) * 15;
			System.out.println( "Bill is : Rs." + bill );
		}
		else if( unit >=101 && unit < 200)
		{
			bill = (50*10) + (100-50) * 15 + (unit-100) * 20;
			System.out.println( "Bill is : Rs." + bill );
		}
		else if( unit >=200 && unit < 300)
		{
			bill = (50*10) + (100-50) * 15 + (200-100) * 20 + (unit-200) * 25;
			System.out.println( "Bill is : Rs." + bill );
		}
		else if( unit >=301)
		{
			bill = (50*10) + (100-50) * 15 + (200-100) * 20 + (300-200) * 25 + (unit-300) * 30;
			System.out.println( "Bill is : Rs." + bill );
		}
	}
}	