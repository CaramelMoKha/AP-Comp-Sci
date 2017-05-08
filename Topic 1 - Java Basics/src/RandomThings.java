import java.util.Random;

public class RandomThings 
{
	public static void main(String[] args)
	{
		//generate a random integer between 2 and 14 (inclusive)
		int rand = (int)(Math.random() * 13) + 2;
		
		//general form to generate a random int between max and min (inclusive)
		//(int)(Math.random() * (max - min + 1) + min;
		//NOTE: max - min + 1 is the number of possible values
		
		Random rd = new Random();
		rand = rd.nextInt(13) + 2;
		//rd.nextInt(max - min + 1) + min
	}
}
