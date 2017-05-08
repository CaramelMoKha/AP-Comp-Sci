
public class ManyDecks 
{
	private int numDecks;
	private Deck[] myDecks;
	
	public ManyDecks(int n)
	{
		numDecks = n;
		myDecks = new Deck[numDecks];
		
		for(int i = 0; i < myDecks.length; i++)
			myDecks[i] = new Deck();
		//since myDecks is of type Deck, we not only need to initialize the array, but also each element IN the array. Otherwise, all elements
		//will have the value of null, and a NullPointerException is likely to occur		
	}
	
	public String toString()
	{
		String result = "";
		for(int i = 0; i < myDecks.length; i++)
		{
			result += "Deck " + (i + 1) + "\n";
			result += myDecks[i].toString();
			result += "\n";
		}
		
		return result;
	}
	
	public void shuffleAll()
	{
		for(Deck d : myDecks)
			d.shuffle();
	}
	
	public static void main(String[] args)
	{
		ManyDecks m = new ManyDecks(3);
		System.out.println(m);
		
		m.shuffleAll();
		System.out.println(m);
	}
}
