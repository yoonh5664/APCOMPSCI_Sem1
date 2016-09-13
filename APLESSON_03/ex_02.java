import java.util.Scanner; //import Statement

public class ex_02
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your height? ");
		
		int height = keyboard.nextInt();
		System.out.println( height + " Okay. What is your weight? ");
		
		int weight = keyboard.nextInt();
		System.out.println( weight + " Okay. Let me calculate your BMI. ");
		
		int BMI = 703 * (weight / height);
		System.out.println( "Your BMI is " + BMI );
		
	}
}