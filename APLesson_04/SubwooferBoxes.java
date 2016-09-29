import java.util.Scanner;
public class SubwooferBoxes
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		SubwooferBoxes area = new SubwooferBoxes();
		
		System.out.println("Please enter the height");
		double h = keyboard.nextDouble();
		System.out.println("Please enter the length");
		double l = keyboard.nextDouble();
		System.out.println("Please enter the width");
		double w = keyboard.nextDouble();
		double box = area.calcVol(h,l,w);
		System.out.printf("The volume is %5.2f",  box);
	}
	
	public double calcVol(double h, double l, double w)
	{
		return (h*l*w)/1728;
	}
}