
public class OrderedPair implements Comparable<OrderedPair>
{
	private int x;
	private int y;
	
	//constructor - initialize instance data
	//default constructor - constructor that has no parameters, it initializes instance data to "default" values
	public OrderedPair()
	{
		x = 0;
		y = 0;
	}
	
	public OrderedPair(int userX, int userY)
	{
		x = userX;
		y = userY;
	}

	//accessors(getters) - allow the user to access the value of private data
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	//mutators(setters) - allows user to change the value of private data on our terms
	public void setX(int userX)
	{
		x = userX;
	}
	
	public void setY(int userY)
	{
		y = userY;
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
	public boolean equals(Object o)
	{
		//return true if the calling object's x and y are equal to o's x and y
		OrderedPair other = (OrderedPair)o;
		//if o is NOT ACTUALLY an orderedPair, this will cause a ClassCastException
		return this.x == other.x && this.y == other.y;
	}
	
	//returns the distance between the origin and THE CALLING OBJECT
	public double getMagnitude()
	{
		return Math.sqrt(x * x + y* y);
	}
	
	//returns the distance between the calling object and other
	public double getDistance(OrderedPair other)
	{
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}
	
	//returns slope of the line created by connecting the calling object and the origin
	public double getSlope()
	{
		return (double)y/x;
	}
	
	//returns slope of the line created by connecting the calling object and other
	public double getSlopeBetween(OrderedPair other)
	{
		return (double)(this.y - other.y) / (this.x - other.x);
	}

	//return an OrderedPair that represents the calling object reflected over the x axis
	//postcodition: the calling objects data is unchanged
	public OrderedPair reflectOverX()
	{
		return new OrderedPair(x, -y);
	}
	
	public OrderedPair reflectOverY()
	{
		return new OrderedPair(-x,y);
	}
	
	//returns -1 if the calling object's magnitude is less than other's
	//returns 1 if the calling object's magnitude is greater than other's
	//returns 0 if the calling object's magnitude is equal than other's
	public int compareTo(OrderedPair other)
	{
		double thisMag = this.getMagnitude(), otherMag = other.getMagnitude();
		
		if(thisMag > otherMag)
			return -1;
		else if(thisMag < otherMag)
			return -1;
		else
			return 0;
	}
}
