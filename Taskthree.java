import java.util.Scanner;
public class Taskthree
{

	public static void main(String[] args)
	{
		char ch;
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter A Single Character : ");
		ch = input.next().charAt(0);
		switch (ch)
		{
			case 'a':
			{
				System.out.println(" It is a Vowel");
				break;
			}

			case 'e':
			{
				System.out.println(" It is a Vowel ");
				break;
			}

			case 'i':
			{
				System.out.println(" It is a Vowel ");
				break;
			}

			case 'o':
			{
				System.out.println(" It is a Vowel ");
				break;
			}

			case 'u':
			{
				System.out.println(" It is a Vowel ");
				break;
			}

			default :
			{
				System.out.println("It is a Consonant");
			}



	}
	}
}