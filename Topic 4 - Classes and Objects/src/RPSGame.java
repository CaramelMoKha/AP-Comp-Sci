import java.util.Scanner;

public class RPSGame 
{
	public static void main(String[] args)
	{
		int repeat = 0;
		double bet = 0;
		double cash = 0;
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("-------------------------------");

		//player enters their stats
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fName = sc.nextLine();
		System.out.println("Please enter your last name: ");
		String lName = sc.nextLine();
		System.out.println("Please enter how much money do you have: ");
		int repeatError;
		//error catching for cash on hand
		do
		{
			cash = sc.nextDouble();
			if(cash <= 0)
				System.out.println("Please enter a number greater than zero.");
		}while(cash <= 0);
		
		Player human = new Player(fName, lName, cash);
		Player comp = new Player("Dat", "Boi", cash);

		//game loop
		do
		{
			System.out.println("How much will you wager?");	
			
			//error catching for bet amount
			do
			{
				bet = sc.nextDouble();
				human.setBet(bet);
				comp.setBet(bet);
				if(human.getCurrentBetAmount() <= 0 || bet > human.getCashOnHand())
					System.out.println("Please enter a bet that is greater than zero and less than or equal to your current balance.");
			}while(human.getCurrentBetAmount() <= 0 || human.getCurrentBetAmount() > human.getCashOnHand());
			
			human.setBet(bet);	
			comp.setBet(bet);
		
			System.out.println("Your opponent is ready");
			System.out.println("Enter your weapon choice (Rock - r, Paper - p, Scissors - s)");
			
			char weapon;
			
			//error catching for weapon
			do
			{
				weapon = sc.next().charAt(0);
			
				if(weapon != 'r' && weapon != 'p' && weapon != 's')
					System.out.println("Please enter r, p, or s for your weapon choice.");
				else	
					human.shoot(weapon);
			}while(weapon != 'r' && weapon != 's' && weapon != 'p');	
			

			int computer = (int) (Math.random() * 3); 

			if(computer == 1)
				comp.shoot('r');
			else if(computer == 2)
				comp.shoot('p');
			else
				comp.shoot('s');

			int winner = human.getWeapon().compareTo(comp.getWeapon());
			
			System.out.println("SHOOT");

			if(winner == -1)
			{
				System.out.println("You Lose!");
				System.out.println(comp.getWeapon() + " beats " + human.getWeapon());
				human.loser();
			}

			else if(winner == 1)
			{
				System.out.println("You Win!");
				System.out.println(human.getWeapon() + " beats " + comp.getWeapon());
				human.winner();
			}

			else if(winner == 0)
			{
				System.out.println("Tie! Your opponent chose " + comp.getWeapon());
			}
			System.out.println("");
			System.out.println(human.toString());
			System.out.println("Would you like to play another round? Enter 1 for Yes and 2 for No");
			
		
			
			do
			{
				repeatError = sc.nextInt();
				if(repeatError != 1 && repeatError != 2)
					System.out.println("Please enter 1 to play again or 2 to quit");
			}while(repeatError != 1 && repeatError != 2&& human.getCashOnHand() > 0 && comp.getCashOnHand() > 0);
			System.out.println(repeat);
		}while(repeatError == 1 && human.getCashOnHand() > 0 && comp.getCashOnHand() > 0);
		
		//final winner determination
		if(human.getCashOnHand() > comp.getCashOnHand())
			System.out.println("You have more money! Winner!");
		else
			System.out.println("The computer has more money! You lose...");
		
		System.out.println("Thanks for playing!");
	}
}
