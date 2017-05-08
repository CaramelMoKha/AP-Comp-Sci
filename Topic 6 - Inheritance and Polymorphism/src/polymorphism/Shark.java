package polymorphism;

public class Shark extends Fish
{
	public Shark(String n, WaterType w)
	{
		super(n, w);
	}
	
	public void characteristics()
	{
		super.characteristics();
		System.out.println("I have a skeleton made of cartilage");
	}
}
