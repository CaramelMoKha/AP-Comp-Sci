import java.util.Scanner;

public class Keno 
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);

		boolean[] playerNumbers;
		playerNumbers = new boolean[80];
		boolean[] compNumbers;
		compNumbers = new boolean[80];

		double playerMoney = 100;

		System.out.println("Welcomt to Keno!");
		System.out.println("Please enter your name: ");
		String name = sc.next();


		System.out.println("Would you like to begin? (Enter 1 for Yes or 2 for No): ");
		int begin = sc.nextInt();

		int playAgain = 0;
		do
		{
			playerNumbers = new boolean[80];
			compNumbers = new boolean[80];
			
			int computerNumbers = 0;
			do
			{
				compNumbers[(int)(Math.random() * 80)] = true;
				computerNumbers ++;
			}while(computerNumbers < 7);
			
			if(begin == 1)
			{
				System.out.println("Great! You have " + playerMoney + " to start. What will you wager?: ");
				double bet;
				do
				{
					bet = sc.nextDouble();
					if(bet > playerMoney || bet < 1)
						System.out.println("Please enter a bet amount between 1 and " + playerMoney + " dollars");
				}while(bet > playerMoney || bet < 1);
				for(int i = 1; i <= 7; i++)
				{
					System.out.println("Please enter a unique number between 1 and 80");
					int uNumber;
					boolean goAgain = false;
					do
					{
						goAgain = false;
						uNumber = sc.nextInt();
						if(uNumber <= 80 && uNumber >= 1)
						{
							if(playerNumbers[uNumber - 1] == true)
							{
								System.out.println("Please enter a number between 1 and 80 that you have not already entered");
								goAgain = true;
							}
						}
						else
						{
							System.out.println("Please enter a number between 1 and 80 that you have not already entered");
							goAgain = true;
						}
					}while(goAgain == true);

					playerNumbers[uNumber - 1] = true;
				}
					
					System.out.println("The computer is selecting its numbers...");
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					int decision = compareArray(playerNumbers, compNumbers);
					double winnings = 0;
					
					if(decision < 4)
						winnings = bet * 0;
					else if(decision == 4)
						winnings = bet * 1;
					else if(decision == 5)
						winnings = bet * 20;
					else if(decision == 6)
						winnings = bet * 200;
					else if(decision == 7)
						winnings = bet * 12000;
					
					System.out.println("You matched " + decision + " number(s), you get $" + winnings);
					playerMoney = playerMoney + winnings;
					System.out.println(name + ",You have $" + playerMoney +  ", would you like to play again? (1 is Yes, 2 is No)");
					playAgain = sc.nextInt();
				}
				else
					System.out.println("Thanks for playing!");
				if(playAgain == 2)
					System.out.println("Thanks for Playing!");
			}while(playAgain == 1);
		}

		public static int compareArray(boolean[] ar, boolean[] arOne) //function that determines how many numbers are the same
		{
			int numbersInCommon = 0;
			for(int x = 0; x < 80; x++)
			{
				if(ar[x] == true && arOne[x] == true)
					numbersInCommon ++;
			}
			return numbersInCommon;
		}
	}



