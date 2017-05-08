import java.util.*;
import java.io.*;

public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> randoms = getList(30);
		System.out.println(randoms);	
		swap(randoms, 0, 1);
		System.out.println(randoms);
		
		printNegatives(randoms);
	}
	
	public static void printNegatives(ArrayList<Integer> list)
	{
		for(Integer x : list)
			if(x < 0)
				System.out.println(x + "  ");
		System.out.println();
	}
	
	//precondition: i and j are valid indexes in list
	//postcondition: elements at indexes i and j in list have been swapped
	public static void swap(ArrayList<Integer> list, int i, int j)
	{
		int value = list.get(i);
		int valueTwo = list.get(j);
		
		list.set(j, value);
		list.set(i, valueTwo);
	}
	
	public static void insert(ArrayList<Integer> list, Integer value)
	{
		for(int i = 0; i < list.size(); i++)
			if(value < list.get(i))
			{
				list.add(i, value);//if value is less than the current element, insert value at the current index
				return;
			}
		list.add(value);
	}
	
	public static void print(ArrayList<Integer> list)
	{
		for(Integer x : list)
			System.out.println(x);
	}
	
	//postcondition: returns an ArrayList with numElements random integers from -50 to 50 inclusive
	public static ArrayList<Integer> getList(int numElements)
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for(int i = 0; i < numElements; i++)//iterate numElements times
		{				//for each iteration, add a random integer to myList
			int rand = (int)(Math.random() * 101) - 50;
			myList.add(rand);
		}
		
		return myList;
	}
}
