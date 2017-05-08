import java.util.*;
public class Day1 
{
	public static void main(String[] args)
	{
		/*Scanner in = new Scanner(System.in);
		stackWords(in);*/
		/*drawTriangle(4);*/
		System.out.println(summation(4));
	}
	
	public static int summation(int n)
	{
		if(n == 0)
			return 0;
		else
			return n * n + summation(n - 1);
	}
	
	public static void stackWords(Scanner sc)
	{
		String temp = sc.next();
		
		if(temp.equals(".")) //base case
			return;
		else				 //non-base case
		{
			stackWords(sc);
			System.out.println(temp);
		}
	}
	
	public static void drawTriangle(int n)
	{
		if(n == 0)
			System.out.println("That's all folks!");
		else
		{
			
			for(int i = 0; i < n; i++)
				System.out.print("* ");
			System.out.println();
			drawTriangle(n - 1);
		}
	}
}
