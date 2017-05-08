

import java.text.DecimalFormat;
import java.util.Scanner;

public class ControlStructureIteration1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$###,###.00");
		//# - if there's a digit in that place, output it
		//0 - if there's a digit in that place, output it, otherwise, output a 0
		
		double hoursWorked, hourlyRate, paycheck, projectedAnnual = 0, taxRate, taxes, netPay, dailyAverage, annualSalary;
		char payType, repeat;
		
		do
		{
				System.out.println("Please enter the method through which you are paid\n1. Hourly\n2. Salary");
				String input = sc.next();
				payType = input.charAt(0);
			
		
				
			if(payType == '1')
			{
				do
				{	
					System.out.println("Please enter the amount of hours worked this week: ");
					hoursWorked = sc.nextDouble();
				}
				while(hoursWorked < 0 || hoursWorked > 168);
				do
				{
				System.out.println("Please enter your hourly wage: $");
				hourlyRate = sc.nextDouble();
				if(hourlyRate < 0)
					{
						System.out.println("Invalid Input");
					}
				}
				while (hourlyRate < 0);
				
					if(hoursWorked <= 40)    //not working overtime
					{
						paycheck = hourlyRate*hoursWorked;	
					}
					else	//working overtime
					{
						paycheck = hourlyRate*40 + (hoursWorked-40)*(1.5*hourlyRate);
					}
					projectedAnnual = paycheck*52;
			}
			else if (payType == '2')
			{
				do
				{
					System.out.print("Please enter your annual salary: $");
					annualSalary = sc.nextDouble();
				}
				while(annualSalary < 0);
				paycheck = annualSalary / 52;
				projectedAnnual = annualSalary;
			}
			else
			{
				System.out.println("Invalid input, enter a '1' or '2'");
				paycheck = -1;   //here, paycheck of -1 is a sentinel value (flag)
			}
			if(paycheck != -1)
			{
				if(projectedAnnual < 20000)
				{
					taxRate = .10;
				}
				else if(projectedAnnual < 50000)
				{
					taxRate = .15;
				}
				else if(projectedAnnual < 75000)
				{
					taxRate = .20;
				}
				else
				{
					taxRate = .30;
				}
				
				taxes = taxRate * paycheck;
				netPay = paycheck - taxes;
				dailyAverage = paycheck / 7;
				
				
				System.out.println("Your gross pay this week is: \t\t" + df.format(paycheck));
				System.out.println("Your average daily gros pay is: \t\t" + df.format(dailyAverage));
				System.out.println("The amount of taxes deducted this week are:\t" + df.format(taxes));
				System.out.println("Your net pay this week is: \t\t" + df.format(netPay));
			}
			do
			{
				System.out.println("Would you like to perform another calculation\n1. Yes\n2. No");
				input = sc.next();
				repeat = input.charAt(0);
			}
			while(repeat != '1' && repeat != '2');
		}
	    while(repeat == '1');
	}
}

/*
 * Control Structures
 * 1. Branching Structure
 * 		-if statement
 * 				if(boolean statement)
 * 				{
 * 					//code that will execute if statement is true
 * 				}
 * 
 * 		-if-else statement
 * 				if(boolean statement)
 * 				{
 * 					//code that will execute if statement is true
 * 				}
 * 				else
 * 				{
 * 					//code that will execute if statement is false
 * 				}
 * 
 * 		-if-else-if
 * 				if(booleanstatement)
 * 				{
 * 					//code to execute if statement is true
 * 				}
 * 				else if(booleanstatement2)
 * 				{
 * 					//code to execute if statement2 is true
 * 				}
 * 				//as many else-if statements as necessary
 * 				else
 * 				{
 * 					//code to execute if none of the statements above are true
 * 				} 
 * 
 *  * 		-switch statement
 * 				controllingExpression must be of type int
 * 					int, long, short, enum, char
 * 				switch(controllingExpression)
 * 				{
 * 					case __:
 * 						//code to execute if case is matched
 * 						break;
 * 					case __:
 * 						//code to execute if case is matched
 * 						break;
 * 					.
 * 					.
 * 					.
 * 					default:
 * 						//code to execute if no case is matched
 * 				}
 * 

 * 
 * 2. Looping (Iterative) Structure
 * 		-while loop - when the number of iterations is not known
 * 				while(booleanStatement)
 * 				{
 * 					//code that will execute as long as the statement is true
 * 				}
 * 		-do-while loop - used when the number of iterations is not known, 
 * 				always executes at least once
 * 
 * 				do
 * 				{
 * 					//code that will execute as long as the statement is true
 * 				}
 * 				while(booleanStatement);
 * 		-for loop - used when the number of iterations is known (in either literal or variable form)
 * 				for(initialization; booleanStatement; update)
 * 				{
 * 
 * 				}
 * 
 * 		REMEMBER: the condition describes the situation in which you want the 
 * 			loop to continue iterating
 */

