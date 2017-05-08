package StudentDataBase;

public class CollegeStudent extends Student
{ 
	   
	   private String roomNumber;
	   private String dormitory;
	   private String college;
	   private String status;
	   
	   CollegeStudent(String[] line)
	   {
		   super(line);
		   roomNumber = line[3];
		   dormitory = line[4];
		   college = line[5];
		   status = line[6];
		   username = line[7];
	   }

	   public String toString()
	   {

		   return super.toString() + "\n" + "Address: " + "\n" + roomNumber + dormitory + "\n" + college + 
				   "\n" + "Status: " + status + "\n" + "User Name: " + username;
	   }    

	   public void setUserName(String uName)
	   {
		   String status = uName.substring(0, 2);
		   if(status.equals("FR") || status.equals("SO") || status.equals("JU") || status.equals("SE") &&  uName.length() == 6) //
			   username = uName;
		   else
			   username = null; //change to a UserNameException
	   }
	   
	   private void setStatus(String str)
	   {
		   status = str;
	   }
	  
	}

