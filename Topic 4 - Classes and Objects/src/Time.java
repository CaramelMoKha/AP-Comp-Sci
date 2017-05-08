public class Time 
{
	private int hours;
	private int minutes;
	
	public Time(int h, int m)
	{
		hours = h;
		minutes = m;
	}
	
	//returns the difference, in minutes, between this time and other;
	//difference is negative if other is earlier than this time
	public int minutesUntil(Time other)
	{
		return (other.hours * 60 + other.minutes) - (this.hours * 60 + this.minutes);
	}
	
	public String toString()
	{
		return hours + ":" + minutes;
	}

}
