import java.io.*;
import java.util.Scanner;

public class Day1 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int[] numbers;
		numbers = new int[7];
		
		char[] letters = {'a', 'b', 'c', 'd'};
		
		boolean[] truths = new boolean[3];
		
		printArray(numbers);
		
		int[] fileData = fillArray("data.txt");
		printArray(fileData);
		
		System.out.println("There are " + countEvens(fileData) + " even numbers in the list.");
		
		//change(fileData);
		//printArray(fileData);
		
		int mindex = findMinIndex(fileData);
		System.out.println("The minimum element in the list occurs at index " + mindex);
		
		squareContents(fileData);
		
		swap(fileData, 3, 5);
		printArray(fileData);
	}
	
	//precondition: 0 <= i < ar.length and 0 <= j < ar.length
	//postcondition: the values of ar[i] and ar[j] have been swapped
	public static void swap(int[] ar, int i, int j)
	{
		int e = ar[i];
		ar[i] = ar[j];
		ar[j] = e;
	}
	
	//postcondition: all of the elements in the ar have been squared
	public static void squareContents(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
			ar[i] = ar[i] * ar[i];
	}
	
	//precondition: ar is not empty
	//postcondition: returns the value of the minimum element in ar
	public static int findMinimum(int[] ar)
	{
		int minimum = ar[0];
		
		for(int x : ar)
			if(x < minimum)
				minimum = x;
		
		return minimum;
	}
	
	//precondition: ar is not empty
	//postcondition: return the index of the first occurrence of the minimum element in ar
	public static int findMinIndex(int[] ar)
	{
		int minIndex = 0;//assume that the first element is the minimum
		
		for(int i = 1; i < ar.length; i++) //search through the rest of the list
			if(ar[i] < ar[minIndex])
				minIndex = i;//if you reach an element that is less than the current minimum index, reassign the minimum index to the current index
		
		return minIndex;
	}
	
	//postcondition: all even indexed elements in ar have been changed to 0
	public static void change(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
			if(i % 2 == 0)//if index is even
				ar[i] = 0;//change array element to 0
	}
	
	//postcondition: return the number of even elements in ar
	public static int countEvens(int[] ar)
	{
		int count = 0;
		
		//search through the list, if array element is even, then increment counter
		for(int x : ar)
			if(x % 2 == 0)
				count ++;
		return count;
	}
	
	public static void printArray(int[] ar)
	{
		System.out.print("{");
		for(int i = 0; i < ar.length - 1; i++)
			System.out.print(ar[i] + ", ");
		System.out.println(ar[ar.length - 1] + "}");
	}
	
	//precondition: file fileName contains only integers, the first integer has the value of the number of subsequent integers
	//postcondition: returns an array that holds all of the values in file fileName
	public static int[] fillArray(String fileName) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File(fileName));
		
		int size = sc.nextInt();
		int[] list = new int[size];
		
		for(int i = 0; i < list.length; i++)
		{
			list[i] = sc.nextInt();
		}
		return list;
	}
}
