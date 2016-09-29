import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a side");
		side = kb.nextInt();
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = 6 *(side *side);
		
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with %10.5f sides is %10.5f.", side , sa);
		
	}
}