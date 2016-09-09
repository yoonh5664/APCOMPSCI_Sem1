import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println( name + "?!!! " + "Why would anyone name a baby that? " + "How old are you, " + name + "?" );
		
		int num = keyboard.nextInt();
		System.out.println("Oooooo!!! " + num + " is getting up there. What do you do for fun, " + name + "?");
		
		String something = keyboard.next();
		
		System.out.println("I thought only nerds like to " + something + "? What kind of music do you like? ");
		
		String music = keyboard.next();
		
		System.out.println("Boooo!!! I wouldn't wish the sound of " + music + " on my worst enemy. How many siblings do you have? ");
		
		int num2 = keyboard.nextInt();
		
		System.out.println( num2 + "? Wow, I hope the rest of your family is better looking. What do you want to be when you grow up? ");
		
		String job = keyboard.next();
		
		System.out.println("I think you'd have to be smarter to be a " + job + ". So " + name + ", you're " + num + "... Good luck becoming a " + job + ". I'm only kiddin' " + name + "." );
	}
	
}