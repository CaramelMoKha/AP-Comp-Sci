import java.io.FileNotFoundException;

public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String s = new String();
		TSP t = new TSP("points.txt");
		t.applyDoubleNeighborHeuristic();
	}
}
