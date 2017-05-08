package interfaces;

public class GradeClient 
{
	public static void main(String[] args)
	{
		Gradable[] classes = new Gradable[3];
		classes[0] = new AcademicClass();
		classes[1] = new HonorsClass();
		classes[2] = new APClass();
		
		for(Gradable g : classes)
			System.out.println(g.calculateGPA(4.375, 4, 18, 'A'));
	}
}
