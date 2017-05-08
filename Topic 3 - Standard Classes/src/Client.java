import java.util.Arrays;

public class Client 
{
	public static void main(String[] args)
	{
		OrderedPair origin = new OrderedPair();
		OrderedPair point = new OrderedPair(-1, -2);
		OrderedPair point2 = new OrderedPair(3, 5);
		
		System.out.println(origin);
		System.out.println(point);
		System.out.println(point2);
		
		double distance = point.getDistance(point2);
		OrderedPair reflection = point2.reflectOverY();
		System.out.println(reflection);
	}
}
