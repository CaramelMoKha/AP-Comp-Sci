import javax.swing.JOptionPane;

public class TwentyOnePickUp 
{
	public static void main(String[] args)
	{
		int playAgain;
		int playerAmount;
		int stones = 21;
		
		//introductory message
		int playGame = JOptionPane.showOptionDialog(null, 
				"Welcome to 21 Pick-Up!\n The rules are simple:\n " +
					"- You will start by removing 1 - 3 stones from a selection of 21 stones\n" +
					"- Your opponent will go next, following the same rules\n" +
					"- The player to remove the last stone wins\n", 
					"21 Pick-Up (NIM)", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
					new String[] {"  Begin  ", "   Quit   "}, 0);
				
		//game begins
		if(playGame == 0)
		{
			do
			{
				do
				{
					playerAmount = userGame(stones);
					stones -= playerAmount;
					JOptionPane.showMessageDialog(null, "There are " + stones + " stones left");
					int temp = stones;
					if(temp == 0)
					{
						JOptionPane.showMessageDialog(null, "You Win! GG");
						break;
					}
					int computerRemoved = computerAI(stones);
					stones -= computerRemoved;
					if(stones == 0)
					{
						JOptionPane.showMessageDialog(null, "Your opponent removes " + computerRemoved + " stones.");
						JOptionPane.showMessageDialog(null, "You lose...RIP");
						break;
					}
					else
					{ 
						JOptionPane.showMessageDialog(null, "Your opponent removes " + computerRemoved + " stones.");
						JOptionPane.showMessageDialog(null, "Stones left: " + stones);
					}
				}while(stones > 0);
				
				playAgain = JOptionPane.showOptionDialog(null, 
						"Would you like to play again?", 
							"Continue?", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
							new String[] {"  Begin  ", "   Quit   "}, 0);
				stones = 21;
				
			}while(playAgain == 0);
			
		}
		
		//program ends if player quits
		if(playGame == 1)
		{
			return;
		}
	}
	
	//computer algorithm used for stone removal
	public static int computerAI(int stonesLeft)
	{
		int compAmount = 0;
		
		if(stonesLeft % 4 == 0)
			compAmount = (int)(Math.random() * 3 + 1);
		else if(stonesLeft % 4 == 1)
			compAmount = 1;
		else if(stonesLeft % 4 == 2)
			compAmount = 2;
		else if(stonesLeft % 4 == 3)
			compAmount = 3;
		else if(stonesLeft == 0)
			compAmount = 0;


		return compAmount; 
	}
	
	//user input determines stone removal
	public static int userGame(int stones)
	{
		int playerAmount = 0;
		
		if(stones >= 3)
		{
			playerAmount = JOptionPane.showOptionDialog(null, 
					"How many stones will you remove?", 
					"Your turn", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
					new String[] {"  1  ", "   2   ", "   3   "}, 0);
		}
		else if(stones == 2)
		{
			playerAmount = JOptionPane.showOptionDialog(null, 
					"How many stones will you remove?", 
					"Your turn", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
					new String[] {"  1  ", "   2   "}, 0);
		}
		else if(stones == 1)
		{
			playerAmount = JOptionPane.showOptionDialog(null, 
					"How many stones will you remove?", 
					"Your turn", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
					new String[] {"  1  "}, 0);
		}
		
		playerAmount += 1;
		
		return playerAmount;
	}
}

















