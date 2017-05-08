import java.util.Scanner;
import java.util.InputMismatchException;

public class RadixTransformation 
{
	public static void main(String[] args)
	{
		while(true)
			{
				int baseCon = 0;
				int baseTen = 0;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Please enter a base 10 value: ");
				
				boolean repeatOne = true, repeatTwo = true;
				
				do
				{
					try
					{
						baseTen = sc.nextInt();
						if (baseTen < 0)
							throw new InputMismatchException();
						
						repeatOne = false;		
					}
					catch(InputMismatchException e)
					{
						System.out.println("Please enter a whole number to convert: ");
						sc.nextLine();
					}
				}while(repeatOne);
				
				System.out.println("Please enter the base to convert to: ");
				
				do
				{
					try
					{
						baseCon = sc.nextInt();
						if(baseCon < 2 || baseCon > 36)
							throw new InputMismatchException();
						
						repeatTwo = false;
					}
					catch(InputMismatchException e)
					{
						System.out.println("Please enter a base as an integer value between 2 and 36: ");
						sc.nextLine();
					}
				}while(repeatTwo);
				
				System.out.println(baseTen + " in base " + baseCon + " is " +baseCalc(baseTen, baseCon));
			}
	}
	
	public static String baseCalc(int number, int convertTo)
	{
		String convertedNumber = "";
		String finalNumber = new String();
		
		do
		{
			int digit = number % convertTo;
			number = number / convertTo;
			
			if(digit >= 10)
				convertedNumber += String.valueOf((char)(digit + 55));
			else
				convertedNumber += Integer.toString(digit);
		}while(number != 0);	
		
		int flipNumber = convertedNumber.length();
		
		for(int j = flipNumber - 1; j >= 0; j--)
		{
			char position = convertedNumber.charAt(j);
			finalNumber += position;
		}
		return finalNumber;
	}
}




