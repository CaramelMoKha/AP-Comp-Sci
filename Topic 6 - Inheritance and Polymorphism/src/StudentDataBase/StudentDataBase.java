package StudentDataBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class StudentDataBase 
{
	   private ArrayList<Student> StudentRecords;
	   private Stack<Double> stack;

	   public StudentDataBase(String sf, String ef) throws FileNotFoundException
	   {
		   StudentRecords = new ArrayList<Student>();
		   stack = new Stack<Double>();
		   
		   Scanner sc = new Scanner(new File(sf));
		   while(sc.hasNextLine())
		   {
			   String student = sc.nextLine();
			   if(student.length() == 7)
			   {
				   String[] line = student.split(",");
				   HighSchoolStudent hs = new HighSchoolStudent(line);
			   }
			   else
			   {
				   String[] line = student.split(",");
				   CollegeStudent cs = new CollegeStudent(line);
			   }
		   }
		   
		   Scanner sc2 = new Scanner(new File(ef));
		   while(sc2.hasNextLine())
		   {
			   String[] expression = sc.nextLine().split(",");
			   String SSN = expression[0];
			   String RPN = expression[1];
			   int creditsEarned = Integer.parseInt(expression[2]);
			   int index = find(SSN);
			   StudentRecords.get(index).setGPA(evaluate(RPN));
			   StudentRecords.get(index).setCreditsEarned(creditsEarned);
		   }
	   } 

	   public int find(String ssn)
	   {
		   int index = 0;
		   for(int i = 0; i < StudentRecords.size(); i++)
		   {
			   if(StudentRecords.get(i).SSN().equals(ssn))
				   index = i;   
		   }
		   return index;
	   }

	   public double evaluate(String exp)
	   {
		   stack = new Stack<Double>();
		   StringTokenizer st = new StringTokenizer(exp, " +/-*^", true);
		   double answer = 0;
		   while(st.hasMoreTokens())
		   {
			   String temp = st.nextToken();
			   if(temp.equals("+"))
			   {
				   double num1 = stack.pop();
				   double num2 = stack.pop();
				   answer = num1 + num2;
				   stack.push(answer);
			   }
			   else if(temp.equals("-"))
			   {
				   double num1 = stack.pop();
				   double num2 = stack.pop();
				   answer = num2 - num1;
				   stack.push(answer);
			   }
			   else if(temp.equals("/"))
			   {
				   double num1 = stack.pop();
				   double num2 = stack.pop();
				   answer = num2/num1;
				   stack.push(answer);
			   }
			   else if(temp.equals(" "))
			   {
				   
			   }
			   else if(temp.equals("*"))
			   {
				   double num1 = stack.pop();
				   double num2 = stack.pop();
				   answer = num1*num2;
				   stack.push(answer);
			   }
			   else if(temp.equals("^"))
			   {
				   double num1 = stack.pop();
				   double num2 = stack.pop();
				   answer = Math.pow(num2, num1);
				   stack.push(answer);
			   }
			   else
				   stack.push(Double.parseDouble(temp));
		   }
		   return stack.pop();
	   }
	   
	   public void display()
	   {
		   Collections.sort(StudentRecords);
		   for(int i = 0; i < StudentRecords.size(); i++)
			   System.out.println(StudentRecords.get(i));
	   }
	}

