
public class Flight 
{
	private Time departure;
	private Time arrival;
	
	public Flight(String depart, String arrive) throws InvalidTimeException
	{
		departure = checkTime(depart);
		arrival = checkTime(arrive);
	}
	
	private Time checkTime(String time) throws InvalidTimeException
	{
		//split by the colon
		String[] list = time.split(":");
		//check that resulting list has exactly two elements
		//check that second element in list has a length of 2
		if(list.length != 2 || list[1].length() != 2)
			throw new InvalidTimeException();
		//both elements in resulting list must be numbers
		int h, m;
		try
		{
			h = Integer.parseInt(list[0]);
			m = Integer.parseInt(list[1]);
		}
		catch(NumberFormatException e)
		{
			throw new InvalidTimeException();
		}
		//second element in list should be less than 60 and greater than or equal to 0
		//first element in list should be less than 24 and greater than or equal to 0
		if(h > 23 || h < 0 || m > 59 || m < 0)
			throw new InvalidTimeException();
		
		return new Time(h, m);
	}
	
	public Time getDepartureTime()
	{
		return departure;
	}
	
	public Time getArrivalTime()
	{
		return arrival;
	}
	
	
}
