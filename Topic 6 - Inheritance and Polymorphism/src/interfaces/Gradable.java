package interfaces;

public interface Gradable 
{
	public static double[] MULTIPLIERS = {4.0, 3.0, 2.0, 1.0, 0.0};
	
	//precondition: grade is a letter grade between A - E
	public double calculateGPA(double GPA, double classCredits, double totalCredits, char grade);
}
