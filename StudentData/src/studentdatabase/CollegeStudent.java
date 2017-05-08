package studentdatabase;

public class CollegeStudent extends Student
{ 
	   
	   private String roomNumber;
	   private String dormitory;
	   private String college;
	   private String status;
	   
	   CollegeStudent(String[] line)
	   {
		   super(line);
		   roomNumber = line[2];
		   dormitory = line[3];
		   college = line[4];
		   username = line[5];
		   
		   if(line[5].substring(0, 2).equals("FR"))
			   status = "Freshman";
		   else if(line[5].substring(0, 2).equals("SO"))
			   status = "Sophomore";
		   else if(line[5].substring(0, 2).equals("JU"))
			   status = "Junior";
		   else
			   status = "Senior";
	   }

	   public String toString()
	   {

		   return super.toString() + "\n" + "Address: " + "\n" + roomNumber + " " + dormitory + "\n" + college + 
				   "\n" + "Status: " + status + "\n" + "User Name: " + username;
	   }    

	   public void setUserName(String uName) throws UserNameException
	   {
		   String status = uName.substring(0, 2);
		   if(status.equals("FR") || status.equals("SO") || status.equals("JU") || status.equals("SE") &&  uName.length() == 6)
			   username = uName;
		   else
			   throw new UserNameException();
	   }
	   
	   private void setStatus(String str)
	   {
		   status = str;
	   }
}