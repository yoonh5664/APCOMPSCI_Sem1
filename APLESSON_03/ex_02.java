import java.util.Scanner; 

public class ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height? ");
		
		double height = keyboard.nextInt();
		System.out.println( height + " Okay. What is your weight? ");
		
		double weight = keyboard.nextInt();
		System.out.println( weight + " Okay. Let me calculate your BMI. ");
		
		double BMI =  (703 *weight) / (height * height);
		System.out.println( "Your BMI is " + BMI );
		
	}
}