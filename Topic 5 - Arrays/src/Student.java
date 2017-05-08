
public class Student 
{
	private String name;
	private double studentAverage;
	
	public Student(String n, double[] grades, double[] pointsPossible)
	{
		name = n;
		double gradeSum = 0;
		double pointSum = 0;
		
		for(int i = 0; i < grades.length - 1; i ++)
		{
			gradeSum += grades[i];
		}
		for(int i = 0; i < pointsPossible.length - 1; i ++)
		{
			pointSum += pointsPossible[i];
		}
		
		studentAverage = gradeSum / pointSum;
	}
	
	public String toString()
	{
		return "Name: " + name + "     " + "Grade: " + studentAverage;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getGrade()
	{
		return studentAverage;
	}
}
