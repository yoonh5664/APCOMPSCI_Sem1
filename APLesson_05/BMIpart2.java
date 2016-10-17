import java.util.Scanner;
public class BMIpart2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.print("Please enter your height");
		double height = kb.nextDouble();
		System.out.print("Please enter your weight");
		double weight = kb.nextDouble();
		
	}
	public static double calcCondish()
	{
		if (BMI <= 18.5)
			return Underweight
		if (18.5 <= BMI <= 24.9)
			return Normal
		if (25 <= BMI <= 29.9)
			return Overweight
		if (29.9 <= BMI <= 34.9)
			return Obese
		if (35 <= BMI <= 39.9)
			return Very Obese
		if (BMI >= 39.9)
			return Morbidly Obese
	

	}
}