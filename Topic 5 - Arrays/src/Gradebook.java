import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Gradebook 
{
	private double[][] storedGrades; 
	private int totalGrades;
	private int totalStudents;
	private Student[] s;
	private double[] scores;
	
	public Gradebook(int students, int grades, String fileName)
	{
		Scanner sc = new Scanner(new File(fileName));
		
		totalStudents = students;
		totalGrades = grades;
		
		storedGrades = new double[totalStudents][grades];
		
		for(int i = 0; i < fileName.length(); i ++)
			for(int j = 0; j < sc.next(); j ++)
			{
				
			}
	}
	
	public double[] findAssignmentAverages()
	{
		
	}
	
	public double[] findStudentAverages()
	{
		
	}
	
	public Student findTopStudent()
	{
		
	}
	
	public Student findStrugglingStudent()
	{
		
	}
	
	public Student findTopStudentForAssignment(int assignmentNum)
	{
		
	}
	
	public Student findStrugglingStudentForAssignment(int assignmentNum)
	{
		
	}
	
	public Student[] returnStudents()
	{
		
	}
	
	public String toString()
	{
		
	}
}
