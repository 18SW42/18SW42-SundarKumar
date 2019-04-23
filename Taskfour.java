public class Taskfour
{

	public static void main(String[] args)
	{
		args.length = 3;
		String s = args[2];
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		char ch = s.charAt(2);
;
		
		switch (args[2])
		{
			case ("+"):
			{
			
				System.out.println(" Result will be " + (args[0]+args[1]));
				break;
			}

			case ("-"):
			{

				System.out.println(" Result will be " +(args[0] - args[1]));
				break;

				
			}

			case ("*"):
			{
				System.out.println(" Result will be " + (args[0]*args[0]));
				break;
				
			}
			

			case ("/"):
			{
				System.out.println(" Result will be " + (args[0]/args[0]));
				break;
			
			}
		
		
		
		
		
	
		}
	}
}	
