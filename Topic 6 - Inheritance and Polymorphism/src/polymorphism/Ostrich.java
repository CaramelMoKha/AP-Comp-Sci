package polymorphism;

public class Ostrich extends Bird
{
	public Ostrich(String n)
	{
		super(n);
	}
	
	public void move()
	{
		System.out.println("I run really fast");
	}
	
	public void characteristics()
	{
		super.characteristics();
		System.out.println("I have long legs");
	}
}
