import java.io.FileNotFoundException;

public class Client 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		SalesData october = new SalesData("sales.txt");
		SalesData november = new SalesData("sales2.txt");
		
		october.display();
		System.out.println();
		november.display();
		
		//I want to dislay the difference in total sales from october to november
		//double difference = october.totalSales - november.totalSales; (doesn't work because totalSales is private)
		double difference = october.getTotalSales() - november.getTotalSales();
		
		System.out.println(october);
	}
}
