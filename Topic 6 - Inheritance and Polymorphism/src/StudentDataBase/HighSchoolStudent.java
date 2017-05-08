package StudentDataBase;

public class HighSchoolStudent extends Student
{ 
	   
	   private String StreetAddress;
	   private String City;
	   private String State;
	   private String Zip;


	   HighSchoolStudent(String[] line)
	   {
		  super(line);
		  StreetAddress = line[3];
		  City = line[4];
		  State = line[5];
		  Zip = line[6];
		  setUserName(line[7]);
	   }

	   public String toString()
	   {
		   return super.toString() + "\n" + "Address: " + StreetAddress + "\n" + City + ", " + State + Zip + "\n" + "User Name: " + username;
	   } 

	   public void setUserName(String uName)
	   {
		   if(uName.length() == 6 && uName.substring(0, 1) != "0")
			   username = uName;
		   else
			   username = null;  //change this to a UserNameException
	   }
	}

