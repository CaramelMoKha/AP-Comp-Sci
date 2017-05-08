
public class NegativeAmountException extends Exception
{
	public NegativeAmountException(double amount)
	{
		super();
		System.out.println(amount + " is negative");
	}
}
