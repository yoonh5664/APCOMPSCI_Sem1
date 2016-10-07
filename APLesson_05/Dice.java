import java.util.Random;
public class Dice
{
	static int num1;
	static int num2;
	public static void main(String[]args)
	{
		Random rand = new Random();
		num1 = rand.nextInt(6)+1;
		System.out.println("You rolled a " + num1);
		num2 = rand.nextInt(6)+1;
		System.out.println("Computer rolled a " + num2);
		rollDice();
	}
	
	public static void rollDice()
	{	
		if (num1 > num2)
		{
			System.out.println(" The winner is you" );
		}
		if (num1 < num2 )
		{
			System.out.println(" The winner is the computer" );
		}
		if (num1 == num2 )
		{
			System.out.println("Tie" );
		}
	}
}