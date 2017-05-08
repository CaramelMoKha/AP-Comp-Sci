import java.util.*;
import java.io.*;

public class TSP 
{
	
	private int N;
	private int[] x;
	private int[] y;
	private boolean[] marked;
	private double length_of_cycle;
	
	public TSP(String fileName) throws FileNotFoundException
	{
		
		Scanner sc = new Scanner(new File(fileName));
		
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++)
		{
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		marked = new boolean[N];
	}
	
	public double distance(int i, int j)
	{
		double distanceBetweenPoints = 0;
		
		distanceBetweenPoints = Math.sqrt(Math.pow((y[i] - y[j]), 2) + Math.pow((x[i] - x[j]), 2));
		
		return distanceBetweenPoints;
	}
	
	public int findUnmarkedPointClosestToPoint(int j)
	{
		int closest = 0;
		double distance = distance(j, 0);
		
		for(int i = 0; i < marked.length; i++)
		{
			if(distance(i, j) < distance)
				if(marked[i] = false)
				{
					closest = i;
					distance = distance(i, j);
				}
		}
		
		return closest;
	}
	
	public boolean leftUnmarked()
	{
		boolean temp = false;
		
		for(int i = 0; i < marked.length; i++)
		{
			if(marked[i] = false)
				temp = true;
		}
		
		return temp;
	}
	
	public void applyDoubleNeighborHeuristic()
	{
		int A = 0;
		int B  = findUnmarkedPointClosestToPoint(A);
		length_of_cycle = distance(A, B);
		
		marked[A] = true;
		marked[B] = true;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int pOne = findUnmarkedPointClosestToPoint(A);
		int pTwo = findUnmarkedPointClosestToPoint(B);
		double s = distance(A, pOne);
		double t = distance(B, pTwo);
		
		while(leftUnmarked() == true)
		{
			if(s < t)
			{
				A = pOne;
				list.add(0, A);
				marked[A] = true;
				length_of_cycle += s;
			}
			
			else
			{
				B = pTwo;
				list.add(B);
				marked[B] = true;
				length_of_cycle += t;
			}
		}
		
		System.out.println("Traveling Salesperson Problem");
		System.out.println("Double Neighbor Heuristic");
		
		for(int i = 0; i < N; i++)
		{
			
		}
	}
}