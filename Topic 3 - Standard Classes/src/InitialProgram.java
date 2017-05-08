import java.util.Scanner;

public class InitialProgram 
{
	public static void main(String[] args)
	{
		System.out.println("Please enter your full name: ");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String[] listNames = name.split(" ");
		
		if(listNames.length == 3)
		{
			String firstName = name.split(" ")[0];
			
			String middleName = name.split(" ")[1];
			
			String lastName = name.split(" ")[2];
			
			System.out.print(firstName.charAt(0));
			System.out.print(middleName.charAt(0));
			System.out.print(lastName.charAt(0));
		}
		if(listNames.length == 2)
		{
			String firstName = name.split(" ")[0]; 
			
			String middleName = name.split(" ")[1];
			
			System.out.print(firstName.charAt(0));
			System.out.print(middleName.charAt(0));
		}
		if(listNames.length == 1)
		{
			System.out.println(name.charAt(0));
		}
	}
}

