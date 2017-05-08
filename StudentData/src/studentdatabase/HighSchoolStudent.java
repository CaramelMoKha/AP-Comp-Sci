package studentdatabase;

public class HighSchoolStudent extends Student
{ 
	   
	   private String StreetAddress;
	   private String City;
	   private String State;
	   private String Zip;


	   HighSchoolStudent(String[] line)
	   {
		  super(line);
		  StreetAddress = line[2];
		  City = line[3];
		  State = line[4];
		  Zip = line[5];
		  username = line[6];
	   }

	   public String toString()
	   {
		   return super.toString() + "\n" + "Address: " + "\n" + StreetAddress + "\n" + City + ", " + State + " " + Zip + "\n" + "User Name: " + username;
	   } 

	   public void setUserName(String uName) throws UserNameException
	   {
		   if(uName.length() == 6 && uName.substring(0, 1) != "0")
		   {
			   username = uName;
		   }
		   else
			  throw new UserNameException();
	   }
	}

