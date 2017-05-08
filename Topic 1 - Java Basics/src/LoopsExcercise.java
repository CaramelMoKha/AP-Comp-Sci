
import java.util.Scanner;
import java.util.InputMismatchException;

public class LoopsExcercise 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/*int n = 1, nMax, counter;
		
		System.out.print("Enter how many numbers there are: ");
		nMax = sc.nextInt();
		
		counter = n;*/
		
/*		while (counter < nMax)
		{
			n = n*n;
			n++;
			counter ++;
		}
		
		System.out.print("The sum is: " + n);*/
		
		int sum = 0, n = 1;
		
		for(int i = 1; i <= n; i++)
		{
			sum += i * i;
		}
		
		System.out.println("Summation: " + sum);
	}
}
