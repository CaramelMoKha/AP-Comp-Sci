
public class InvalidPinException extends Exception
{
	public InvalidPinException(String pin)
	{
		super();
		System.out.println(pin + " is invalid; 4 digits only");
	}
}
