public class GetOdds
{
	static int [] Array;
	public static void main(String[]args)
	{
		Array = new int[10];
		fillArray();
		System.out.println("For the following numbers... ");
		printArray(Array);
		System.out.println("");
		System.out.println("The " + getOdds(Array) + " are odd numbers");
	}
	
	public static void fillArray(int [] Array)
	{
		for(int number:Array)
		{
			System.out.print(number + "\t");
		}
	}
	
	public static void printArray(int [] Array)
	{
		for(int number:Array)
		{
			System.out.print(number + "\t");
		}
	}
	
	public static String getOdds(int [] numbers)
	{
		String odds = "";
		for(int number:Array)
		{
			if(number % 2 == 1)
				odds += number + " ";
		}
		return odds;
	}
	not done
}