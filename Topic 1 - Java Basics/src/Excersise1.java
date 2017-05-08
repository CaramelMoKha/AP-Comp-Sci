import java.util.Scanner;
import java.util.*;


public class Excersise1 
{
	public static void main(String[] args)
	{
		double base = 0, height = 0, radius = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the base length: ");
		try
		{
			base = sc.nextDouble();
		}
		catch(InputMismatchException e)
		{
			sc.nextLine();
		}
		
		System.out.print("Please enter the height length: ");
		height = sc.nextDouble();
		
		System.out.print("Please enter the radius: ");
		radius = sc.nextDouble();
		
		System.out.println("Triangle:       " + Math.round(((1.0/2)*base*height)* 100.0)/100.0);
		System.out.println("Rectangle:      " + Math.round((base*height)*100.0)/100.0);
		System.out.println("Circle:         " + Math.round((Math.PI)*radius*radius*100.0)/100.0); //would have been System.out.println("Circle:  " + (22.0/7)*radius*radius);
	}
}
