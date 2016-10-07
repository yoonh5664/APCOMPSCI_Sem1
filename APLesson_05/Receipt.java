import java.util.Scanner;
public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1");
		String item1 = kb.next();
		System.out.println("Please enter the price");
		int price1 = kb.nextInt();
		System.out.println("Please enter item 2");
		String item2 = kb.next();
		System.out.println("Please enter the price");
		int price2 = kb.nextInt();
		System.out.println("Please enter item 3");
		String item3 = kb.next();
		System.out.println("Please enter the price");
		int price3 = kb.nextInt();
		System.out.println("Please enter item 4");
		String item4 = kb.next();
		System.out.println("Please enter the price");
		int price4 = kb.nextInt();
		double subtotal = (price1 + price2 + price3 + price4);
		System.out.println("Subtotal =" + subtotal );
		
		
	}
}

