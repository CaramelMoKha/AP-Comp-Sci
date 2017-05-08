import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Trip 
{
	private String flightData;
	private int numflights;
	
	public Trip(String fileName) throws FileNotFoundException
	{
		numflights = 0;
		flightData = "";
		
		Scanner sc = new Scanner(new File(fileName));
		
		while(sc.hasNext())
		{
			flightData += sc.next() + ",";
			numflights++;
		}
		numflights /= 2;
	}
	
	public int getDuration() throws InvalidTimeException
	{
		String[] list = flightData.split(",");
		if(numflights == 0)
			return 0;
		
		String first, last;
		first = list[0];
		last = list[list.length - 1];
		
		Flight f = new Flight(first, last);
		return f.getDepartureTime().minutesUntil(f.getArrivalTime());
	}
	
	//precondition: the departure time for each flight is later than the arrival
	//time of its preceding flight
	//returns the smallest number of minutes between the arrival of a flight
	//and the departure of the flight immediately after it, if there are two or more flights
	//in the trip; -1 if there are fewer than two flights in the trip

	public int getShortestLayover() throws InvalidTimeException
	{
		String[] list = flightData.split(",");
		
		if(numflights < 2)
			return -1;
		
		int shortest = 0;
		
		for(int i = 1; i < list.length - 1; i += 2)
		{
			Flight f = new Flight(list[i], list[i + 1]);
			if(i == 1)
				shortest = f.getDepartureTime().minutesUntil(f.getArrivalTime());
			else
				if(shortest > f.getDepartureTime().minutesUntil(f.getArrivalTime()))
					shortest = f.getDepartureTime().minutesUntil(f.getArrivalTime());
		}
		
		return shortest;
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Trip t = new Trip("flight.txt");
		System.out.println(t.flightData);
		System.out.println(t.numflights);
		
		
	}
}
