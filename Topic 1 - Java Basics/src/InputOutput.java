
import java.util.Scanner;  //import statement; only imports Scanner class
import java.util.*;      //import statement; imports all classes in the util package


public class InputOutput   
{
	public static void main(String[] args)
	{
		//constructor: a special type of function(method) that makes/creates/allocates memory for an object - much like a
		//variable declaration for a primitive data type
		
		//general form: OjectName identifier = new ObjectName(argument(s));
		Scanner sc = new Scanner(System.in); //System.in is the standard input stream
		
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.println("Hello " + name + "!");
		
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		/*
		 * next() - returns a String, read in until it reaches ANY whitespace
		 * nextLine()- returns a String, red in until it reaches a new line
		 * nextInt()- returns an int - will produce an error if it attempts to read in a non integer type
		 * nextDouble()- returns a double, will produce an error if it attempts to read in a non numeric type
		 * 
		 * concatenation: an operation that is performed with a string and any other piece of data using the + operator
		 * example 1: "4" + "2" = "42"
		 * example 2: int x = 5;
		 * 			  String result = "" + x;
		 * 			  System.out.printIn(result);   //5 result = "5"
		 * 
		 * literal vs. variable
		 * literal: an actual value
		 * 		examples: 5(literal int), 2.2 (literal double), 'A' (literal char), "Hello" (literal String), true (literal boolean)
		 * 
		 * variable: memory location
		 * 		examples: int x(x is the variable)
		 * 				  double y(y is the variable
		 * 
		 * when you output a literal, its the value that outputs
		 * when you output a variable, its the value of the variable that outputs.
		 * 
		 * escape characters: characters that have a special meaning
		 * 	always begin with a \
		 * 
		 * \n - new line
		 * \t - tab
		 * \" - quote
		 * \\ - backslash
		 */
		System.out.println("Name:\t" + name + "\nAge:\t" + age);
	}
	
}
