import java.util.*;
public class ErrorCatching 
{
	public static void main(String[] args)
	{
		//try-catch demo
		//force the user to enter a positive NUMBER
		
		boolean loop = true;
		int number;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Please enter a positive number: ");
			try
			{
				number = sc.nextInt();
				if(number <= 0) //range error
				{
					//explicitly throw an exception
					throw new InputMismatchException();
				}
				loop = false;
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Positive numeric input only please");
			}
		}
		while(loop);
	}
}
