import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayingWithLoops 
{
	public static void main(String[] args)
	{
/*		Scanner sc = new Scanner(System.in);
		int n, nFactorial = 1, counter;
		
		System.out.print("Please enter a non-negative integer: ");
		n = sc.nextInt();
		
		counter = n;
		
		while(counter >= 1)
		{
			nFactorial = nFactorial * counter;
			//nFactorial *= counter;
			counter --;
		}
		
		System.out.println(n + "! = " + nFactorial);*/
		
/*		int sum = 0;
		int nFactorial = 1;
		for(int i = 1; i <= 1; i ++)
		{
			sum += i*i;
		}
		
		System.out.println("Summation: " + sum);
		
		sum = 0;
		for(int i = 2; i <= n; i += 2)
		{
			sum += 1;
		}
		
		System.out.println("The sum of the even numbers from 0 to " + n + "is: " + sum);*/
		
		
		
/*		int tempCals, totalCals = 0;
		System.out.println("Please enter the caloric count for each item that you ate today\nTerminate the list with a negative number");
		
		
		do
		{
			tempCals = sc.nextInt();
			totalCals = tempCals + totalCals;
		}
		while(tempCals >= 0);
		
		totalCals -= tempCals;
		
		System.out.println("You ate a total of " + totalCals + " calories today");*/
		
		
		/*int rows, columns;
		System.out.println("Please enter the number of rows: ");
		rows = sc.nextInt();
		System.out.println("Please enter the number of columns: ");
		columns = sc.nextInt();
		
		for(int i = 0; i < rows; i ++)
		{
			for(int j = 0; j < columns; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		Scanner sc = new Scanner(System.in);
		int h, b;
		
		System.out.println("Please enter the height of your triangle: ");
		h = sc.nextInt();
		System.out.println("Please enter the base of your triangle ");
		b = sc.nextInt();
		
/*		for(int i = 0; i < b; i ++)
		{
			for(int j = 0; j <= i; j ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		for(int i = 0; i < b; i++)
		{
			for(int j = 0; j < b - i - 1; j++)
			{
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*
 * Define: local, scope, accumulator, counter
 * 1. calculate n! (2 ways) - for loop together, while loop independently
 * 2. calculate the summation of the series...(2 ways) - 
 * 		while loop together, for loop independently
 * 3. add all the even numbers from 0 to n together
 * 4. calorie calculator - allow the user to enter the calorie count of the items 
 * 		they ate today.  
 * 		the user will specify he/she is done by entering -1
 * 		what structure should we use?
 * 		Define: sentinel value, temporary variable
 * 5. Draw a square with user defined row and column numbers 
 * 		Define: nesting
 * 6. Draw an isosceles right triangle with user defined base
 * 
 * */

//here, nFactorial is an ACCUMULATOR variable
//an ACCUMULATOR is a variable that changes either incrementally
	//or by a multiple of itself (sums, products)
	//general rule: initialize accumulators to the identity
	//of whatever operation is being performed (sum - 0, product - 1)

//counter variable: a special kind of variables that
	//tallies, counts, or keeps track of the number of times
	//something occurs (in this example, i is our counter)

//local: a variable is considering LOCAL to the block of code
	//in which its declared, meaning it can only be used
	//in that block

//scope: a description of where a variable can be used