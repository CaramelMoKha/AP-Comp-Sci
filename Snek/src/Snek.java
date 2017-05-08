import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snek extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private long score;
	private Color[][] well;
	private int snek;
	
	// Creates a border around the screen
	private void screen() 
	{
		well = new Color[40][40];
		for (int i = 0; i < 40; i++) 
		{
			for (int j = 0; j < 39; j++) 
			{
				if (i == 0 || i == 39 || j == 38) 
					well[i][j] = Color.GRAY;
				else 
					well[i][j] = Color.BLACK;
			}
		}
	}

	public void paintComponent(Graphics g)
	{
		// Paint the well
		g.fillRect(0, 0, 26*40, 26*39);
		for (int i = 0; i < 40; i++) 
		{
			for (int j = 0; j < 39; j++) 
			{
				g.setColor(well[i][j]);
				g.fillRect(26*i, 26*j, 25, 25);
			}
		}
		
		// Display the score
		g.setColor(Color.WHITE);
		g.drawString("" + score, 30, 25);
	}
	
	public void extendSnek()
	{
		snek ++;
	}

	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Snek");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(40*26+10, 26*39+25);
		f.setVisible(true);
		
		final Snek game = new Snek();
		game.screen();
		f.add(game);

	}
}