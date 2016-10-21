import java.util.Scanner;
public class BMIpart2
{
	static double BMI;
	static String condition;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.print("Please enter your height");
		double height = kb.nextDouble();
		System.out.print("Please enter your weight");
		double weight = kb.nextDouble();
		BMI =  (703 *weight) / (height * height);
		condition = "";
		calcCondish();
	}
	public static void calcCondish()
	{
		if (BMI < 18.5)
			condition = "Underweight" ;
		else if (BMI <= 24.9)
			condition = "Normal";
		if (BMI < 29.9)
			condition = "Overweight" ;
		else if (BMI < 34.9)
			condition = "Obese" ;
		if (BMI <= 39.9)
			condition = "Very Obese" ;
		else if(BMI > 39.9)
			condition = "Morbidly Obese" ;
		
		System.out.println( "Your BMI is: " + BMI );
		System.out.println("You are " + condition);
	}
}