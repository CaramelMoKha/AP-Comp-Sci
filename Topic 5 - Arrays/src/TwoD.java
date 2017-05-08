import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TwoD 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int[][] list = fillArray("data2");
		print2d(list);
		
		System.out.println(findSum(list));
		
		int[] rSums = findRowSums(list);
		print1d(rSums);
		
		int[] cSums = findColSums(list);
		print1d(cSums);
		
		modify(list, 1);
		print2d(list);
	}
	
	//precondition: ar is a square matrix
	//postcondition: ar is unchanged, returns the sum of the major left to right diagonal
	public static int sumDiagonal(int[][] ar)
	{
		
	}
	
	//precondition: rowNum >= 0 and rowNum < ar.length
	//post: every element in ar[rowNum] has been increased by 10
	public static void modify(int[][] ar, int rowNum)
	{
		for(int i = 0; i < ar[rowNum].length; i++)
				ar[rowNum][i] += 10;
	}
	
	public static int[] findColSums(int[][] ar)
	{
		int[] colSums = new int[ar[0].length];
		//length of colSums should be equal to the number of columns in ar
		//at this point, every element in colSums has the value of 0
		
		for(int j = 0; j < ar[0].length; j++)	//one iteration of this loop will process ONE COLUMN of ar
			for(int i = 0; i < ar.length; i++)
				colSums[j] += ar[i][j];
		return colSums;
	}
	
	public static int[] findRowSums(int[][] ar)
	{
		int[] rowSums = new int[ar.length];
		//the length of rowSums should be equal to the number of rows in ar(which is ar.length)
		//at this point, every element in rowSums has the value of 0
		
		for(int i = 0; i < ar.length; i++)	//one iteration of this loop will process ONE ROW
			for(int x : ar[i])
				rowSums[i] += x;
		
		return rowSums;
	}
	
	public static int findSum(int[][] ar)
	{
		int sum = 0;
		
		for(int[] row : ar)
			for(int x : row)
				sum += x;
		
		return sum;
	}
	
	//precondition: the text file called fileName has as its first element, the number of rows of data, as its second element, the number of columns
	//of data, followed by rows * cols numbers
	
	//postcondition: returns an array filled with the values in the text file fileName, except for the first two elements
	public static int[][] fillArray(String fileName) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File(fileName));
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] grid = new int[rows][cols];
		
		//row major: process one row at a time
		//grid.length gives us the number of rows in grid
		//grid[i].length gives us the number of elements in row i
		
		for(int i = 0; i < grid.length; i++)
			for(int j = 0; j < grid[i].length; j++)
				grid[i][j] = sc.nextInt();
		
		return grid;
	}
	
	public static void print1d(int[] ar)
	{
		System.out.print("[");
		for(int i = 0; i < ar.length - 1; i++)
			System.out.print(ar[i] + ", ");
		System.out.println(ar[ar.length - 1] + "]");
	}
	
	public static void print2d(int[][] ar)
	{
		for(int[] row : ar)
			print1d(row);
	}
}
