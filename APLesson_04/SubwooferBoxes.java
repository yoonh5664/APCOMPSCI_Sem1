import java.util.Scanner;
public class SubwooferBoxes
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		SubwooferBoxes calcVol = new SubwooferBoxes();
		
		System.out.println("Please enter the height");
		double h = keyboard.nextDouble();
		System.out.println("Please enter the length");
		double l = keyboard.nextDouble();
		System.out.println("Please enter the width");
		double w = keyboard.nextDouble();
		double box = area.calcVol(h,l,w)/1728;
		System.out.printf("Your total monthly payment is $%5.2f",  avg);
	}
}