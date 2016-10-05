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
		print(num1, num2, num3, calcAvg(num1,num2,num3));
	}
	
	public static int calcAvg(int num1, int num2, int num3)
	{
		return (num1 + num2 + num3)/3;
		
	}
	public static void print(double one, double two, double three, double avg)
	{
		System.out.printf("The average of " + one + ", " + two + ", and " + three + " is %10.5f." , avg);
		
	}
}