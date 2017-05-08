package studentdatabase;

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
		   String[] name = str[0].split(" ");
		   firstName = name[0];
		   lastName = name[1];
		   SSN = str[1];
	   }

	   public String SSN()
	   {
		   String three = SSN.substring(0, 3);
		   String two = SSN.substring(3, 5);
		   String four = SSN.substring(5);
		   
		   return three + "-" + two + "-" + four;
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
		   return "Name: " + lastName + ", " + firstName + "\n" + "SSN: " + SSN() + "\n" + "Credits Earned: " + creditsEarned + "\n" + "GPA: " + gpa;
	   }     

	   public abstract void setUserName(String str) throws UserNameException; 
	}


