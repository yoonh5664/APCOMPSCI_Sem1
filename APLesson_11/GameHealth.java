import java.util.Scanner;
public class GameHealth
{
	static String[] health; 
	static int HEALTHLOAD = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int ammount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
	
		while(turn.equals("Q") && healthCount > 0)
		System.out.println("Your turn! Hit Enter when ready: ");
		String turn = kb.next();
		int damage = (int)(Math.random() * 2) + 1;
		int ammount = (int)(Math.random() * 6) + 1;
		println(takeDamage());
		printClip();
		println("You died!!!");
	}
	
	public static void takeDamage()
	{
		if(dmg = 1)
		{
			healthCount -= ammount;
			return "Taking " + ammount + "damage!";
		}
		else
		{
			if(healthCount + ammount < HEALTHLOAD)
			{
				healthCount += ammount;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
			return "Power up" + ammount + " !";
		}
	}
	
	public static void printClip()
	{
		String output = "Health:" + "\t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
				output += health[i];
				
			}
		}
		System.out.println(output);
	}
}