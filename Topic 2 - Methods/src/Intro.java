import java.util.*;

public class Intro 
{
	public static void main (String[] args)
	{
		int creditScore;
		final int CUTOFFSCORE = 730;
		boolean qualified;

		creditScore = getCreditScore();  //function (method) call
		qualified = isQualified(creditScore, CUTOFFSCORE);
		displayResults(qualified);
	}

	//returns an integer between 350 and 850
	public static int getCreditScore()
	{
		int cScore;
		Scanner sc = new Scanner(System.in);

		do
		{
			try
			{
				System.out.print("Enter your credit score: ");
				cScore = sc.nextInt();
				if(cScore < 350 || cScore > 850)
					throw new InputMismatchException();
			}
			catch (InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Please enter an integer between 350 and 850");
				cScore = -1;
			}
		}while (cScore < 350 || cScore > 850);

		return cScore;
	}

	//returns true if score is at least cutoff, false otherwise
	public static boolean isQualified(int score, int cutoff)
	{
		return score >= cutoff;
	}

	//display qualification results
	public static void displayResults(boolean status)
	{
		if(status)
			System.out.println("Congrats! You qualified for the loan");
		else
			System.out.println("Sorry, you do not qualify for the loan");
	}
}
	/*
terms to know: method header, method call, return value, return type, 
	return statement, void, parameter list

general form of method header:

access modifiers returnType methodName(parameterList)
{}

examples:
public static void main(String[] args)

public static int findSum(int a, int b)

public static double findDeterminant(int a, int b, int c)

public static void displayResult(double result)

public static int getInput()


two types of  methods:
1. value returning methods - must return data type as specified in header
	ex. calling findSum
	int sum = findSum(x, y);
	at the point of the method call, there must be an assignment statement
2. void  methods - typically the job of a void method is to display something
	displayResults(sum);


task: write a program that asks the user for their credit score.  
if their score is at least 730, tell them they qualify for a loan.  
otherwise, tell them they do not qualify.

subtasks:
1. asking user for credit score, and make sure their entry is between 350 and 850 (inclusive)
2. telling them they qualify
3. telling them the dont qualify

add functionality: tell them how many more points they need to qualify
*/