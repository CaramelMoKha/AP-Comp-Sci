import java.util.Scanner;

public class ScrambleWord 
{	
	public static void main(String[] args) throws Exception
	{

		System.out.println(scrambleWord("TEN"));
		System.out.println(scrambleWord("ELECTRIC"));
		System.out.println(scrambleWord("SEEN"));
		System.out.println(scrambleWord("ELEVEN"));
		System.out.println(scrambleWord("E"));
		System.out.println(scrambleWord("EGG"));
		System.out.println(scrambleWord(""));
		System.out.println(scrambleWord("FORK"));
	}
	
	public static String scrambleWord(String word)
	{
		int length = word.length();
		
		for(int i = length - 1; i > 0; i--)
		{
			char letter = word.charAt(i);
			if((letter == 'E' || letter == 'e') && word.charAt(i - 1) != 'e' && word.charAt(i - 1) != 'E')
			{
				char tempWord = word.charAt(i - 1);
				word = word.substring(0, i - 1) + letter + tempWord + word.substring(i + 1);
				i -= 1;
			}
		}	
		return word;
	}
}