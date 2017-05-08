
import java.util.*;

public class SwitchStatements 
{
	public static void main(String[] args)
	{
		int option = 0;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Menu\n1. Play Game\n2. Instructions\n3. High Scores\n4. Help\n5. Exit");
			try
			{
				option = sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
			}
			
			switch(option)
			{
			case 1:
				System.out.println("Have fun playing!");
				break;
			case 2:
				System.out.println("printing instructions...");
				break;
			case 3:
				System.out.println("Samir:\t100\nNikhil:\t75");
				break;
			case 4:
				System.out.println("Always wash your hands after you leave this class");
				break;
			case 5:
				System.out.println("Thanks for playing! Goodbye.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option, enter #1 - 5");	
			}
		}
		while(option != 5);
	}

}
