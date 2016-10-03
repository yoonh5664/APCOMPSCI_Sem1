import java.util.Scanner;
public class Circle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter radius");
		int r = kb.nextInt();
		print(calcArea(r));
	}
	
	public static int calcArea(int r)
	{
		return  3.14 * (r *r);
	}
	
	public static void print(double area)
	{
		System.out.printf("The area of a circle with a radius of %10.5f is %10.5f.", r, area);
		
	}
}
