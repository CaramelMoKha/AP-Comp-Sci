package interfaces;

public class APClass implements Gradable
{
	public double calculateGPA(double GPA, double classCredits, double totalCredits, char grade)
	{
		return(GPA * totalCredits + 1.25 * Gradable.MULTIPLIERS[grade - 65] * classCredits) / (totalCredits + classCredits);
	}
	
}
