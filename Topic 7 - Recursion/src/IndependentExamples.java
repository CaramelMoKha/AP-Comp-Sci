import java.util.*;

public class IndependentExamples 
{
	public static void main(String[] args)
	{
		System.out.println(factorialRecursive(5));
		System.out.println(factorial(5));
		System.out.println(fibonacciRecursive(6));
		System.out.println(fibonacci(6));
	}
	
	public static int factorialRecursive(int n)
	{
		if(n == 1)
			return 1;
		else
			return n * factorialRecursive(n - 1);
	}
	
	public static int factorial(int n)
	{
		int num = n;
		for(int i = n; i > 1; i--)
			num *= (i - 1);
		
		return num;
	}
	
	public static int fibonacci(int n)
	{
		int num1 = 0, num2 = 1, num3 = 1;
		int num = 0;
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
		{
			for(int i = 2; i < n; i++)
			{
				num = num1 + num2 ;
			}
			return num;
		}
	}
	
	public static int fibonacciRecursive(int n)
	{
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
			
	}
}
