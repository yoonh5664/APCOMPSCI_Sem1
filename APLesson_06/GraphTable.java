import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a integer: ");
		int num = kb.nextInt();
		System.out.println("Please enter the number to multiply by: ");
		int size = kb.nextInt();
		

		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%3d | %6d\n ", i , i* size);
		}
	}
}