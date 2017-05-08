/*
 * Sum
 * average
 * Factorial
 * Area of Circle
 * Area of Rectangle
 * Determinant
 * Quadratic root (pos)
 * Quadratic root (neg)
 * swap ****
 * get positive input
 * connect Scanner to file
 * 
 * 	//precondition: (describes what has to be true before a function executes)
 * 	//postcondition: (describe what should be true after a function executes)
 * 
 *  * Method Overloading: two or more methods with the same method
* 	signature (return type,  name), but different parameter lists
* 	(either number or type of parameters)
* 	Often referred to as "ad hoc polymorphism" - 
* 	early binding - match between method call and method to be executed
* 	occurs during compilation - opposed to true polymorphism (late/dynamic binding)
* 	we'll talk much much more about this (polymorphism) later!
* 
* 	java is a PASS BY VALUE language, which means that the VALUE
	of the arguments, not the arguments themselves, are passed to the 
	method parameters

*/
import java.io.*;
import java.util.Scanner;

public class CommonOperations
{
	//Driver - a special method or classs that's sole purpose is to test other methods or classes
	public static void main (String[] args) throws FileNotFoundException 
	{
		Scanner fileScan = connectToFile("Data.txt");
	}
	public static double findAverage(int op1, int op2)
	{
		return (op1 + op2)/2.0;
	}
	public static int findFactorial(int n)
	{
		int factorial = 1;

		for(int i = 2; i <= n; i++)
			factorial *= i;
		return factorial;
	}
	public static double calcCircArea(double radius)
	{
		return Math.PI * radius * radius;
	}

	public static double findDiscriminant(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}

	//swap the values of x and y
	public static void swap(int x, int y)
	{
		System.out.println(x + " " + y); // 5  42  
		int temp = x;
		x = y;
		y = temp;
		System.out.println(x + " " + y); // 42  5
	}

	//returns a Scanner connected to the file nameed fileName
	public static Scanner connectToFile(String fileName) throws FileNotFoundException
	{
		
		File fl = new File(fileName);
		Scanner sc = new Scanner(fl);

		return sc;
	}

		//precondition: fileScanner has been connected to a file that exists in the directory
		//the file contains only numeric data
	//postcondition: return the sum of the values in the file
	public static double sumFile(Scanner fileScanner)
	{
		double sum = 0;
		while(fileScanner.hasNextDouble())
		{
			//read in a value
			//add it on to a sum
			sum += fileScanner.nextDouble();
		}
		
		return sum;
	}
}