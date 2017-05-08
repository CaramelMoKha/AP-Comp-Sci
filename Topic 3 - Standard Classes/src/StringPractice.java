
public class StringPractice 
{
	public static void main(String[] args)
	{
		String a = "apple";
		String aa = "appleS";
		String b = "banana";
		String B = "Banana";
		String c = "cantaloupe";
		
		System.out.println(a.compareTo(a));	// 0
		System.out.println(a.compareTo(b));	// -
		System.out.println(b.compareTo(a));	// +
		System.out.println(a.compareTo(c));	// -
		System.out.println(b.compareTo(c));	// -
		System.out.println(b.compareTo(B));	// +
		System.out.println(aa.compareTo(a));// +
			
		int length = a.length();
		System.out.println(length);   // 5
		
		String sub1 = a.substring(3); 
		String sub2 = b.substring(2, 5);
		
		System.out.println(sub1);  // le
		System.out.println(sub2);  // nan
		
		sub1 = a.substring(a.length());	//""
		System.out.println(sub1 + "grape");		//grape
		
		//sub1 = a.substring(a.length() + 1);	//	error StringIndexOutOfBoundsException
		//sub2 = a.substring(3, a.length() + 1);	//		error
		
		sub1 = a.substring(3, 3);	//""
		System.out.println(sub1 + "grape");//	apgrape
		
		
		
		
		
		
		
		
		boolean truth;
		String first = "Hello";
		String second = "Hello";
		String third = new String("Hello");
		
		truth = first == second;
		System.out.println(truth);	// True
		
		truth = first == third;
		System.out.println(truth);	// False
		
		truth = second == third;
		System.out.println(truth);	// False
	
		
		
		
		
		
		char firstLetter = a.charAt(0);
		char lastLetter = a.charAt(a.length() - 1);
		//char doesThisWork = a.charAt(a.length());		//will it work? NO
		
		System.out.println(firstLetter + " " + lastLetter);	//		a  e
		
		
		
		
		//String reversedA = reverseString(a);
		//write a function called reverseString() that returns the string parameter in reverse order
		//System.out.println(reversedA);	//
		
	}

}
