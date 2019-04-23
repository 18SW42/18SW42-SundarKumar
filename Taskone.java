import java.util.Scanner;
public class Taskone {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" MARKS SHEET");
		System.out.println("Enter Marks Of C++ ,Data Structures and Operating Systems Respectively");
		float x = input.nextFloat();
		float y= input.nextFloat();
		float z= input.nextFloat();
		System.out.println("Subjects \t \t Marks");
		System.out.println("\nC++ \t \t \t " + x);
		System.out.println("Data Structures  \t " + y );
		System.out.println("Operating Systems  \t " + z );
		int total =300;
		System.out.println("Total      \t \t " +total);
		float sum = x+y+z ;
		double percentage = ((sum   / total ) * 100);
		System.out.println("Percentage \t \t " + percentage + "%");

		if(percentage>= 90.0)
		{
			System.out.print("Grade = A ");
		}

		else if(percentage >=80.0 && percentage <89.0)
		{
			System.out.print("Grade = B " );

		}
		
		else if(percentage <60.0 )
		{
			System.out.print("Result = Fail ");
		}
		
		else if(percentage >=70.0 && percentage < 79.0 )
		{
			System.out.print("Grade = C");
		}

		else if(percentage >=0 && percentage < 60 )
		{
			System.out.print("Grade = D ");
		}






	}

}
