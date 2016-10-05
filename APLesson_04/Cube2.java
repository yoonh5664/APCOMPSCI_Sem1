import java.util.Scanner;
public class Cube2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a side");
		int side = kb.nextInt();
		print( side, calcSurf(side));
	}
	public static double calcSurf(int side)
	{
		return  6 *(side *side);
		
	}
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube with %10.5f sides is %10.5f.", side , sa);
		
	}
}