public class AlbumSales
{
	public static void main(String[]args)
	{
		String name = "James Brown";
		int units = 1500000;
		String category = "";
		
		if (units >= 1000000)
			category = "Top Seller";
		if (units >= 500000)
			category = "Good Seller";
		if (units >= 100000)
			category = "Average Seller";
		if(units < 100000)
			category = "Needs Review";
		
		System.out.println(name + " = " + category);
		
	}
}