import java.lang.*;
import java.util.Scanner;

public class TheGameOfCraps
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double point = 0, start;
		int diceOne, diceTwo;
		int playAgain;
		
		System.out.println("Welcome to The Game of Craps!");
		System.out.println("-----------------------------");
																//Start Menu messages
		System.out.println("Please enter '1' to Start");
		System.out.println("Enter any other number to quit");
		
		start = sc.nextInt();
		
		if(start == 1)			//Starts Game
		{
			System.out.println("Good Luck!");    
		}
		
		else if(start != 1)		 //Ends game and program
		{
			System.out.println("Thanks for playing!"); 
			return;
		}
		
		do			
		{
			System.out.println("You roll the dice...");		//player rolls dice
			
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				
			}
			
			diceOne = (int)(Math.random() * 6) + 1;
			diceTwo = (int)(Math.random() * 6) + 1;
			
			if(diceOne + diceTwo == 2 || diceOne + diceTwo == 3 || diceOne + diceTwo == 12) //player rolls losing numbers
			{
				System.out.println("Sorry, your losing roll was " + (diceOne + diceTwo));
			}
			
			else if(diceOne + diceTwo == 7 || diceOne + diceTwo == 11)	//player rolls winning numbers
			{
				System.out.println("GGWP! Your winning roll was " + (diceOne + diceTwo));
			}
			
			else	//player rolls neither... a point value is assigned
			{
				System.out.println("The point is now " + (diceOne + diceTwo));
				
				try
				{
					Thread.sleep(200);
				}
				catch(InterruptedException e)
				{
					
				}
				
				point = diceOne + diceTwo;
				
				int dice1;
				int dice2;
				
				do
				{
					dice1 = (int)(Math.random() * 6) + 1;
					dice2 = (int)(Math.random() * 6) + 1;
					
					System.out.println("You roll again... ");
					
					try
					{
						Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{
						
					}
					
					System.out.println("Rolled " + (dice1 + dice2));	//roll dice
					
					try
					{
						Thread.sleep(100);
					}
					catch(InterruptedException e)
					{
						
					}
					
					if(dice1 + dice2 == point)
					{
						System.out.println("GGWP! You rolled the point"); //sum of dice equals point, win
						break;
					}
					
					else if(dice1 + dice2 == 7)
					{
						System.out.println("RIP, you rolled a 7");	//roll seven, loss
						break;
					}
				}while(dice1 + dice2 != point && dice1 + dice2 != point);
			}
			
			System.out.println("Would you like to play again? Enter '1' to play again or any other number to quit"); //replay menu
			playAgain = sc.nextInt();
			
		}while(playAgain == 1);
		System.out.println("Thanks for Playing!");
	}
}
