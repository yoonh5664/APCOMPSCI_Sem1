import java.util.Random;
public class Dice
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int num = rand.nextInt(6)+1;
		System.out.println("You rolled a " + num);
		int num2 = rand.nextInt(6)+1;
		System.out.println("Computer rolled a " + num2);
		
	}
}