/*
 * Identifier: anything the programmer names 
 * 		(class, function, variable, constant)
 * Rules for naming identifiers:
 * 1. can't be a keyword (reserved word)
 * 2. can only begin with a letter, underscore, or dollar sign
 * 3. can only contain letters, underscores, digits, or dollar signs
 * 
 * Naming Conventions
 * 1. constants should be declared in all caps
 * 2. classes should be capitalized
 * 3. variables and functions should not be capitalized
 * 4. identifier names should be MEANINGFUL
 */
		
		


		/*
		 * primitive data types - data stored directly in memory
		 * 1. int - an integer type - only whole number values
		 * 2. double - can hold a decimal
		 * 3. short
		 * 4. long
		 * 5. float
		 * 6. boolean - true/false value
		 * 7. char - a single character, enclosed in single quotes
		 * 8. byte
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Arithmetic Operators
		 * 	+	addition
		 * 	-	subtraction
		 * 	*	multiplication
		 * 	%	modular division (remainder division)
		 * 				Examples:
		 * 				5 % 6 = 5
		 * 				6 % 6 = 0
		 * 				0 % 3 = 0
		 * 				12 % 5 = 2
		 * 				13 % 5 = 3
		 *	/ Division
		 *		1. Integer Division - performed if both operands
		 *			are of type integer - this could be literal or variable - 
		 *			evaluates to the whole number only, meaning the remainder
		 *			is truncated
		 *				Examples:
		 *				2 / 2 = 1
		 *				3 / 2 = 1
		 *				2 / 6 = 0
		 *		2. Floating Point Division - is performed when one or
		 *			the other or both operands are of floating point
		 *			type, this could be literal or variable - this functions
		 *			the way that we would normally consider division to operate
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int x = 5, y = 7, z;
		double b = 1.0, c;
		
		z = x / y;
		System.out.println(z);	// 0
		
		c = y / x;
		System.out.println(c);	// 1
		
		c = y / b;
		System.out.println(c);	// 7.0

		c = x / 2;
		System.out.println(c);	// 2.0
		
		c = x / 2.0;
		System.out.println(c);	// 2.5
		
		z = y % x;
		System.out.println(z);	// 2
		
		z = x % y;
		System.out.println(z);	// 5
		
		
		
		
		
		
		
		
		/*
		 * Shortcut Operators
		 * 
		 * 	+=		x = x + 2;		x += 2;
		 * 	-=		x = x - 9;		x -= 9;
		 * 	*=		x = x * 4;		x *= 4;
		 * 	/=		x = x / y;		x /= y;
		 * 	%=		x = x % z;		x %= z; 
		 * 
	
		 * 	++ increment operator
		 * 	--	decrement
		 * post increment: x++; - the increment occurs after the current operation
		 * pre increment: ++x;	- the increment occurs before the current operation
		 */
public class variables 
{
	public static void main (String[] args)
	{
		//variable declaration: allocating memory for a particular piece of data
		//general form: dataType variableName;
		
		int number, wholeNumber;
		double decimal = 1.5;
		boolean loop = true;
		char letter;
		
		//assignment statement: gives a variable a value
		number = 5;
		decimal = 2.2;
		loop = false;
		letter = 'a';
		wholeNumber = number;
		number = 6;
		
		int x = 8, y;
		
		System.out.println(x);     //8
		System.out.println(++x);   //9
		System.out.println(x);     //9
		
		
		x = 42;
		y = x++;
		
		System.out.println(x);    //43
		System.out.println(y);    //42
		
		x = 42;
		y = ++x;
		
		System.out.println(x);    //43
		System.out.println(y);    //43
		
		/*
		 * 
		 */
	}
}
