import java.util.Scanner;
public class Average2
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number 1");
		int num1 = kb.nextInt();
		System.out.println("Please enter a number 2");
		int num2 = kb.nextInt();
		System.out.println("Please enter a number 3");
		int num3 = kb.nextInt();
		print(calcAvg(num1,num2,num3));
	}
	
	public static int calcAvg(int num1, int num2, int num3)
	{
		return (num1 + num2 + num3)/3;
		
	}
	public static void print(String text, double average)
	{
		System.out.printf("The average of %10.5f , %10.5f , and %10.5f is %10.5f." , num1, num2, num3, avg);
		
	}
}