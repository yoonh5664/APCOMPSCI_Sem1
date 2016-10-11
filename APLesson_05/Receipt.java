import java.util.Scanner;
public class Receipt
{
	static double price1;
	static double price2;
	static double price3;
	static double price4;
	static double price5;
	static double subtotal;
	static double tax;
	static double total; 
	static String item1; 
	static String item2;
	static String item3;
	static String item4;
	static double item5;
	static double item6;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1");
		item1 = kb.next();
		System.out.println("Please enter the price");
		price1 = kb.nextDouble();
		System.out.println("Please enter item 2");
		item2 = kb.next();
		System.out.println("Please enter the price");
		price2 = kb.nextDouble();
		System.out.println("Please enter item 3");
		item3 = kb.next();
		System.out.println("Please enter the price");
		price3 = kb.nextDouble();
		System.out.println("Please enter item 4");
		item4 = kb.next();
		System.out.println("Please enter the price");
		price4 = kb.nextDouble();
		price5 = (price1 + price2 + price3 + price4);
		System.out.println("Subtotal = " + price5 );
		discount();
		System.out.println("Discount = " + item5 );
		price5 = price5 - item5;
		item6 = (.075 * price5);
		System.out.println("tax = " + item6 );
		System.out.println("total = " + (price5 + tax));
		

	}
	
	public static void discount()
	{
		if(price5 > 2000)
			item5 = .15 * price5;
		if(price5 < 2000)
			item5 = 0;	
	}
	
	
}

