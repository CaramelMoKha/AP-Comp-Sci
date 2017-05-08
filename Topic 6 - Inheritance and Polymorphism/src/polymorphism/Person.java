package polymorphism;

public class Person extends Animal
{
	public Person(String n)
	{
		super(n);
	}
	
	public void move()
	{
		System.out.println("I walk on two legs");
	}
	
}
