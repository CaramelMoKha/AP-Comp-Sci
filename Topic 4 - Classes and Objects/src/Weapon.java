public class Weapon implements Comparable<Weapon>
{
	private int weapon;
	
	//initailize weapon
	Weapon()
	{
		weapon = 0;
	}
	
	public void setWeapon(char w)
	{
		//test the value of w to set weapon to a value
		if(w == 'r')
			weapon = 1;
		else if(w == 'p')
			weapon = 2;
		else if(w == 's')
			weapon = 3;
	}
	

	//Rock = 1, Paper = 2, Scissors = 3
	public int compareTo(Weapon other)
	{
		if(this.weapon == 1 && other.weapon == 2) //other win(paper beats rock)
			return -1;
		
		else if(this.weapon == 1 && other.weapon == 3) //calling object win(rock beats scissors)
			return 1;
		
		else if(this.weapon == 2 && other.weapon == 3) //other win(scissors beat paper)
			return -1;
		
		else if(this.weapon == 2 && other.weapon == 1) //calling object win(paper beats rock)
			return 1;
		
		else if(this.weapon == 3 && other.weapon == 2) //calling object win(scissors beat paper)
			return 1;
		
		else if(this.weapon == 3 && other.weapon == 1) //other win(rock beats scissors)
			return -1;
		
		else //tie
			return 0;
	}
	
	public String toString()
	{
		if(weapon == 1)
			return "Rock";
		else if(weapon == 2)
			return "Paper";
		else
			return "Scissors";
	}
}


