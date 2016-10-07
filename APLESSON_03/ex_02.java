import java.util.Scanner; 

public class ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height? ");
		
		int height = keyboard.nextInt();
		System.out.println( height + " Okay. What is your weight? ");
		
		int weight = keyboard.nextInt();
		System.out.println( weight + " Okay. Let me calculate your BMI. ");
		
		int BMI = 703 * (weight / height * height);
		System.out.println( "Your BMI is " + BMI );
		
	}
}