import java.util.Scanner;
public class Rectangle
{
	static double length;
	static double width;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a length");
		length = kb.nextInt();
		System.out.println("Please enter a width");
		width = kb.nextInt();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = 2* (length + width );
		
	}
	public static void print()
	{
		System.out.printf("Your rectangle is   %10.5fft around.", perimeter);
		
	}
}