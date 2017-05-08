
public class LogicalRelationalOperators 
{
	public static void main(String[] args)
	{
		/*
		 * Arithmetic Expression vs. Boolean Expression
		 * 
		 * Arithmetic Expression - 
		 * 		Operands - numeric
		 * 		Operators - arithmetic operators (+, -, *, / %)
		 * 		Evaluates to - numeric
		 * 
		 * Boolean Expression - 
		 * 		evaluates to - boolean (true/false)
		 * 		operators
		 * 			1. Relational (<, >, <=, >=, ==, !=)
		 * 				operands - numeric
		 * 			2. Logical (&&, ||, ^, !)
		 * 				operands - boolean			 * 
		 * 
		 * short circuit evaluation - boolean expressions are evaluated until the truth value is known
		 * 
		 * examples:  T || ____ is true, so the evaluation stops after the ||
		 * 			  F && ____ is false, so the evaluation stops after the &&
		 * 
		 * test to see if den divides evenly into num
		 * if(den != 0 && num % den == 0);
		 * 
		 */
	boolean truthValue;
	int x = 5, y = 0, z = -1;
	
	truthValue = x < y;
	System.out.println(truthValue);	// false
	
	truthValue = x == x;
	System.out.println(truthValue);	// true
	
	truthValue = !(x != y);
	System.out.println(truthValue);	// false
	
	truthValue = x < y && y < z;
	System.out.println(truthValue);	// false
	
	truthValue = y < x || x == y;
	System.out.println(truthValue);	// true
	
	truthValue = y < x || (x / y < 0);
	System.out.println(truthValue); 	// true
	}
}
