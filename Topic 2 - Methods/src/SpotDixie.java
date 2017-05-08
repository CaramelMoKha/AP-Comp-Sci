import java.io.*;
import java.util.*;
/*
 * Mohammad Khatami
 * Spot Dixie
 * 10/25/2016
 */

public class SpotDixie
{
	//driver function
	public static void main (String[] args) throws FileNotFoundException
	{
		double sum;
		double gas;
		double discountedPrice;
		int cents;
		
		File file = new File("data.txt");		//reads data file and sets scanner
		Scanner fileScan = new Scanner(file);
		
		sum = sumPoints(fileScan);  //calculates sum of points
		
		fileScan = new Scanner(file); //reset scanner
		
		gas = gasPrice(fileScan); //calculates gas price
		
		cents = centDiscount(gas, sum);  //calculates cents off
		
		discountedPrice = gas - ((double) cents/100); //subtracts discount from price of gas
		
		System.out.println("You earned a discount of " + cents + " cents per gallon; the price is therefore $" + Math.round(discountedPrice * 100) / 100.0 + " - CONGRATULATIONS");
	}


	//reads file and returns sum of points
	public static double sumPoints(Scanner fileScan)
	{
		double sum = 0;
		double temp = 0;
		while(fileScan.hasNextDouble())
		{
			sum += Math.floor(temp);
			temp = fileScan.nextDouble();
		}


		return sum;
	}
	
	//returns total spent on gas
	public static double gasPrice(Scanner fileScan)
	{
		double temp = 0;
		while(fileScan.hasNextDouble())
		{
			temp = fileScan.nextDouble();
		}


		return temp;
	}
	
	//calculates cents off gas
	public static int centDiscount(double gasPrice, double sumPrice)
	{
		int points;
		
		points = (int) (Math.floor(sumPrice/100)*10);
		return points;
	}
}
