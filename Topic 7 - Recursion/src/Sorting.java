import java.util.Arrays;

public class Sorting 
{
	public static void main(String[] args)
	{
		int[] nums = {1, 5, 2, 3, 4};
		selection(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void insertion(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] > ar[i + 1])
				i++;
				
		}
	}
	
	public static void selection(int[] ar)
	{
		for(int i = ar.length - 1; i > 0; i--)
		{
			int max = 0;
			for(int j = 0; j <= i; j++)
			{
				if(ar[j] > ar[max])
					max = j;
			}
			swap(ar, max, i);
		}
	}
	
	public static void merge(int[] ar)
	{
		
	}
	
	public static void swap(int[] ar, int index, int index2)
	{
		int temp = ar[index];
		ar[index] = ar[index2];
		ar[index2] = temp;
	}
}
