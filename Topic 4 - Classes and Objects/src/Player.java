public class Player 
{
	private String firstName;
	private String lastName;
	private int losses;
	private int wins;
	private double cashOnHand;
	private double currentBetAmount;
	private Weapon currentChoice = new Weapon();
	
	Player(String fName, String lName, double coh)
	{
		firstName = fName;
		lastName = lName;
		losses = 0;
		wins = 0;
		cashOnHand = coh;
		currentBetAmount = 0;
	}
	
	public void shoot(char w)
	{
		currentChoice.setWeapon(w);
	}
	
	public void setBet(double betAmount)
	{
		currentBetAmount = betAmount;
	}
	
	public void setCash(double cashAmount)
	{
		cashOnHand = cashAmount;
	}
	
	//win - add bet to cash on hand, win counter increase
	public void winner()
	{
		wins ++;
		cashOnHand += currentBetAmount;
	}
	
	//lose - subtract bet from cash on hand, lose counter increase
	public void loser()
	{
		losses ++;
		cashOnHand -= currentBetAmount;
	}
	
	public String toString()
	{
		return "Your Stats:\n" + firstName + "\n" + lastName + "\n" + currentChoice + "\n" + cashOnHand + "\n" + currentBetAmount + "\n";
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getLosses()
	{
		return losses;
	}
	
	public int getWins()
	{
		return  wins;
	}
	
	public double getCashOnHand()
	{
		return cashOnHand;
	}
	
	public double getCurrentBetAmount()
	{
		return currentBetAmount;
	}
	
	public Weapon getWeapon()
	{
		return currentChoice;
	}
}




