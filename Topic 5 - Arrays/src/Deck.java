
public class Deck 
{
	public static final int NUMCARDS = 52;
	private int[] cards;
	
	public Deck()
	{
		cards = new int[NUMCARDS];
		for(int i = 0; i < cards.length; i++)
			cards[i] = i;
	}
	
	public String toString()
	{
		String result = "";
		
		for(int i = 0; i < cards.length; i++)
		{
			result += cardString(cards[i]) + "\t";
			if((i+ 1) % 13 == 0 && i != 0)
				result += "\n";
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		Deck d = new Deck();
		System.out.println(d);
		
		d.shuffle();
		System.out.println("After Shuffle: ");
		System.out.println(d);  
	}
	
	public void shuffle()
	{
		//iterate through list, swap current element with a random element 
		for(int i = 0; i < cards.length; i++)
			swap(i, (int) (Math.random() * 52));
	}
	
	private void swap(int i, int j)
	{
		int temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}
	//precondition: 0 <= number < NUMCARDS
	//postcondition: String representation of a card with label number is returned
	public String cardString(int number)
	{
		//number % 13 result will be some number 0 - 12(13 possible results). This will correspond to the face value of the card
		//number / 13 result will be some number from 0 - 3 (4 possible results), corresponding to the suit
		int faceValue = number % 13;
		int suit = number / 13;
		
		String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] suits = {"S", "H", "D", "C"};
		
		String cardValue = cardValues[faceValue];
		String suitValue = suits[suit];
		
		return suitValue + cardValue;
	}
	
}
