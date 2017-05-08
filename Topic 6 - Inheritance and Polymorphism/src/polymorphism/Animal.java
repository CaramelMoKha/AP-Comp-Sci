package polymorphism;

public class Animal 
{
	private String name;
	
	public Animal(String n)
	{
		name = n;
	}
	
	public void move()
	{
		System.out.println("I move");
	}
	
	public void characteristics()
	{
		System.out.println("I am alive");
	}
	
	public String toStirng()
	{
		return "My name is " + name + " and I am a " + this.getClass().getSimpleName();
	}
}
