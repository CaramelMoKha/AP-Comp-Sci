import javax.swing.JOptionPane;

public class GUI 
{
	public static void main(String[] args)
	{
		String name, input;
		int age;
		
		JOptionPane.showMessageDialog(null, "Hello World!", "Welcome", JOptionPane.WARNING_MESSAGE);
		
		name = JOptionPane.showInputDialog(null, "Please enter your name", "Name", JOptionPane.QUESTION_MESSAGE);
		
		input = JOptionPane.showInputDialog(null,"Please enter your age", "Age", JOptionPane.QUESTION_MESSAGE);
		
		age = Integer.parseInt(input);
		
		JOptionPane.showMessageDialog(null, name + ", you are " + (100-age) + " years from being a centrion", "Centurion", JOptionPane.ERROR_MESSAGE);
	}
}
