package interfaces;

public class AcademicClass implements Gradable
{
	public double calculateGPA(double GPA, double classCredits, double totalCredits, char grade)
	{
		return(GPA * totalCredits + Gradable.MULTIPLIERS[grade - 65] * classCredits) / (totalCredits + classCredits);
	}
}
