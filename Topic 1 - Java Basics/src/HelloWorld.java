/*
 * block comment
 * Name: Mohammad Khatami
 * Date: 9/14
 * Purpose: to say hello to the world
 */

//line comment

//public: access modifier - any other class can access this one
//class: this is a class (as opposed some other type like enum or interface)
//HelloWorld: class name, must match the name of the java file

//identifier - anything we as the programmer, names (class, function, variable)
/*
 * 3 rules for naming identifiers:
 * 1. can contain letters, digits, underscores, or $
 * 2. can begin with a letter, underscore, or $
 * 3. cannot be a keyword (a word that already has a special meaning in the language)
 * 
 * naming conventions:
 * 1. class names should be capitalized
 * 2. variables and functions should begin with a lower case letter
 * 3. constants should be in all caps
 * 4. words should be separated using capitalization or underscores
 * 5. identifier names should be meaningful according to data or function
 */
public class HelloWorld //class header
{
	public static void main(String[] args)
	{
		//static: modifier - opposed to an instance function
		//void: return type of the function - this function won't return anything
		//main: name of the function
		//String[] args - parameter list (what the function needs to do its job)
			//we don't us this
		System.out.println ("Hello world!");
	}
}
