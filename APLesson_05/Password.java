import java.util.Scanner;
public class PasswordProgram
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("What is your username?");
		String username = kb.next();
		System.out.println("What is your passsword?");
		String 
		if(choice.equals("Y") || choice.equals("N"))
		{
			if(choice.equals("Y"))
				System.out.println("Yay! let's do some recursion!");
			else
				System.out.println("Spoiled the fun!");
		}
		else
		{	
			System.out.println("Please enter Y or N");
			recursion();
		}
	}
}