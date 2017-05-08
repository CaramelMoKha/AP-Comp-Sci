import java.text.DecimalFormat;
import java.util.Date;

public class BankAccount 
{
	private double balance;
	private double interestRate;
	private String accountNumber;
	private String pinNumber;
	private String firstName;
	private String lastName;
	private Date birthday;
	public static final int OVERDRAW_PENALTY = 35;
	private static int numberOfAccounts; //only going to be initialized the first time a BankAccount object is instantiated
	private static DecimalFormat accountFormat = new DecimalFormat("0000 0000 0000 0000");
	
	public BankAccount(double rate, String pin, String fName, String lName, Date d) throws InvalidPinException
	{
		balance = 0;
		interestRate = rate;
		numberOfAccounts++;
		accountNumber = accountFormat.format(numberOfAccounts);
		setPin(pin);
		firstName = fName;
		lastName = lName;
		birthday = d;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getName()
	{
		return lastName + ", " + firstName;
	}
	
	public Date getBirthDate()
	{
		return birthday;
	}
	
	public void withdraw(double amount) throws NegativeAmountException
	{
		if(amount < 0)
			throw new NegativeAmountException(amount);
		
		if(amount > balance)
			balance -= (amount + OVERDRAW_PENALTY);
		else
			balance -= amount;
	}
	
	public void deposit(double amount) throws NegativeAmountException
	{
		if(amount < 0)
			throw new NegativeAmountException(amount);
		
		balance += amount;
	}
	
	//returns simple interest
	public double calculateInterest()
	{
		return balance * interestRate;
	}
	
	//returns false if pin is not successfully changed, successfully changed pins return true and a new pin
	public boolean setPin(String oldPin, String newPin) throws InvalidPinException
	{
		if(!oldPin.equals(pinNumber))
			return false;
		else
		{
			setPin(newPin);
			return true;
		}
	}
	
	//if newPin is 4 digits long, sets pinNumber to newPin
	private void setPin(String newPin) throws InvalidPinException
	{
		if(newPin.length() != 4)
			throw new InvalidPinException(newPin);
		
		try
		{
			Integer.parseInt(newPin);
		}
		catch(NumberFormatException e)
		{
			throw new InvalidPinException(newPin);
		}
		
		pinNumber = newPin;
	}
	
	public String toString()
	{
		return getName() + "\nAccount Number: " + accountNumber + "\nBalance: " + balance;
	}
}
