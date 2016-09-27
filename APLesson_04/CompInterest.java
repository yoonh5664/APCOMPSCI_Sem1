import java.util.Scanner;
public class CompInterest
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		CompInterest average = new CompInterest();
		System.out.println("Please enter your principal:");
		double p = keyboard.nextDouble();
		System.out.println("Please enter your interest rate:");
		double r = keyboard.nextDouble();
		System.out.println("Please enter the number of times the loan is compunded per year:");
		double n = keyboard.nextDouble();
		System.out.println("Please enter the life of the loan in years");
		double t = keyboard.nextDouble();
		double avg = average.payment(p,r,n,t);
		System.out.printf("Your total monthly payment is $%5.2f",  avg);
	}
	
	public double payment(double p, double r, double n, double t)
	{
		return (p*(Math.pow(1+r/n, n*t)))/(t*12);
	}
}