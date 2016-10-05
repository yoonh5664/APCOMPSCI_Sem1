import java.util.Random;
public class Dice
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int num1 = rand.nextInt(6)+1;
		System.out.println("You rolled a " + num1);
		
		int num2 = rand.nextInt(6)+1;
		System.out.println("Computer rolled a " + num2);
		System.out.println("The winner is );
		if (num1 > num2)
		{
			System.out.println(" The winner is you );
		}
		if (num2 > num1)
		{
			System.out.println(" The winner is the computer );
		}
	}
}