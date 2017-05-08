import java.util.Scanner;


public class DanglingElse 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter age: ");
		age = sc.nextInt();
		if(age >= 18)
			System.out.println("Enjoy voting!");
		
		if(age >=65)
			System.out.println("Enjoy senior discount!");
		else
			System.out.println("Play, play, play!!!");

	}
}
/*
What will happen if I enter...
5?	 	intended:"Play, play, play!!!"			            actual:"Play, play, play!!!"
25?		intended:"Enjoy Voting!"			                actual:"Enjoy voting!" "Play, play, play!!!"
67?		intended:"Enjoy voting!""Enjoy senior discount"		actual:"Enjoy voting!" "Enjoy senior discount"

What do you think was intended?
*/
