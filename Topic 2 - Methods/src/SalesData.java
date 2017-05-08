import java.util.*;
import java.io.*;
import java.text.*;

public class SalesData 
{
	//instance data
	private double totalSales;
	private double averageSale;
	private int numberOfSales;
	
	//constructor - a special method; its job is to initialize instance data
	//general form:public ClassName(parameter list)
	public SalesData(String fileName) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File(fileName));
		
		totalSales = 0;
		numberOfSales = 0;
		
		while(sc.hasNextDouble())
		{
			totalSales += sc.nextDouble();
			numberOfSales++;
		}
		
		averageSale = totalSales / numberOfSales;
	}
	
	//accessor methods - GETTER methods - their job is to allow the user to access the value of private data
	public double getTotalSales()
	{
		return totalSales;
	}
	
	public double getAverageSale()
	{
		return averageSale;
	}
	
	public int getNumberOfSales()
	{
		return numberOfSales;
	}
	
	public void display()
	{
		DecimalFormat df = new DecimalFormat("$###,###.00");
		System.out.println("There were " + numberOfSales + " sales this period");
		System.out.println("Total Sales:\t" + df.format(averageSale));
		System.out.println("Average Sale:\t" +df.format(averageSale));
	}
	
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("$###,###.00");
		String builder = "";
		builder += "There were " + numberOfSales + " sales this period\n";
		builder += "Total Sales:\t" + df.format(totalSales) + "\n";
		builder += "Average Sale:\t" +df.format(averageSale) + "\n";
		
		return builder;
	}
}
