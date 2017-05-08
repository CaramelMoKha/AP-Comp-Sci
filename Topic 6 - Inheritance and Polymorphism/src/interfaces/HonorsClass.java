package interfaces;

public class HonorsClass implements Gradable
{
	public double calculateGPA(double GPA, double classCredits, double totalCredits, char grade)
	{
		return(GPA * totalCredits + 1.125 * Gradable.MULTIPLIERS[grade - 65] * classCredits) / (totalCredits + classCredits);
	}
	
}
