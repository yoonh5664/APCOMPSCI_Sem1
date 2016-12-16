public class BiggestNumber
{
	static int [] numbers = new int[10];
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("");
		System.out.println("The biggest number is " + getBiggest());
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++ )
		{
			numbers[i]= (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray()
	{
		for(int number : numbers)
		{
			System.out.print(number + "\t");
		}
	}
	
	public static int getBiggest()
	{
		int max = 0;
		for(int number : numbers)
		{
			if(number > max)
				max = number;
		}
		return max;
	}
}