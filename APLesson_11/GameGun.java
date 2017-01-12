import java.util.Scanner;
public class GameGun
{
	public static void main(String[]args)
	{
		String [][] clip = new String[4][4];
		int bulletCount = 96
		int shotCount = 0
		for(int i = 0; i < xAnd0.length; i++)
		
		while(bulletCount > 0 || shotCount > 0)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Action: ");
			if(action = "R")
			{
				reload()
			}
			if(action = "S")
			{
				shoot()
			}
		}		
		System.out.println("Out of Bullets!!!");
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{

		}
	}
	
	public static void shoot()
	{
		if(shotCount > 0)
		{
			shotCount -= 1
			return "Boom!!!"
			
		}
		return "Reload!!!"
		
	}
	
	public static void reload()
	{
		if(bulletCount >= clipsize)
		{		
			bulletCount - clipsize
			shotCount = clipsize 
		}
		else
		{
			shotCount = bulletCount
			bulletCount = 0 
		}	
		resetClip()
	}
	
	public static void printClip()
	{
		
	}
}