package polymorphism;

public class AnimalClient 
{
	public static void main(String[] args)
	{
		Animal[] animals = new Animal[6];
		animals[0] = new Animal("Larry");
		animals[1] = new Person("Prince William");
		animals[2] = new Bird("Jewel");
		animals[3] = new Ostrich("Joschka");
		animals[4] = new Fish("Dory", Fish.WaterType.saltWater);
		animals[5] = new Shark("Bruce", Fish.WaterType.saltWater);
		
		for(Animal a : animals)
		{
			System.out.println(a);
			a.move();
			a.characteristics();
			if(a instanceof Fish)
				((Fish)a).getWater();
			System.out.println();
		}
	}
}
