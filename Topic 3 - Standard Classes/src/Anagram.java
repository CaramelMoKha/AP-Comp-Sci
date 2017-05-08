import java.util.Scanner;
import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args)
	{
		System.out.println("Please enter two words to compare: ");
		
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		
		word1 = (word1.toLowerCase().trim().replace(" ",""));
		word2 = (word2.toLowerCase().trim().replace(" ",""));
		
		char[] wordOne = word1.toCharArray();
		char[] wordTwo = word2.toCharArray();
		
		Arrays.sort(wordOne);
		Arrays.sort(wordTwo);
		
		if(Arrays.equals(wordOne, wordTwo))
			System.out.println("The words are anagrams!");
		else
			System.out.println("The words are not anagrams!");
	}
}