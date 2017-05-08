import java.util.Date;

public class Client2 
{
	public static void main(String[] args) throws InvalidPinException, NegativeAmountException
	{
		BankAccount mine = new BankAccount(.0125, "8989", "Mo", "Khatami", new Date(5, 23, 15));
		BankAccount yours = new BankAccount(0, "6667", "Nikhil", "Behari", new Date(4, 23, 2000));
		
		System.out.println(mine);
		System.out.println(yours);
		
		mine.deposit(1000);
		System.out.println(mine);
	}
}
