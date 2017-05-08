package StudentDataBase;

public abstract class Student implements Comparable
{
	   private String firstName;
	   private String lastName;
	   private String SSN;
	   protected String username;
	   private double gpa;
	   private int creditsEarned;

	   public Student(String[] str)
	   {
		   firstName = str[0];
		   lastName = str[1];
		   SSN = str[2];
	   }

	   public String SSN()
	   {
		   String three = SSN.substring(0, 4);
		   String two = SSN.substring(4, 7);
		   String four = SSN.substring(7);
		   
		   return three + "-" + two + "-" + four + "-";
	   }

	   public void setCreditsEarned(int credits)
	   {
		   creditsEarned = credits;
	   }


	   public void setGPA(double gpa)
	   {
		   this.gpa = gpa;
	   }

	   public int compareTo(Object other)
	   {
		   Student student = (Student)other;
		   int compared = this.lastName.compareTo(student.lastName);
		   if(compared < 0)
			   return -1;
		   else if(compared == 0)
			   return 0;
		   else
			   return 1;
	   }


	   public String toString()
	   {
		   return "Name: " + lastName + ", " + firstName + "\n" + "SSN: " + SSN + "\n" + "Credits Earned: " + creditsEarned + "\n" + "GPA: " + gpa;
	   }     

	   public abstract void setUserName(String str); 
	}
