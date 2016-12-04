public class BiggestNumber
{
	static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.println("Please enter starting number: ");
		int start = kb.nextInt();
		System.out.println("Please enter sequence size: ");
		int size = kb.nextInt();
		
		int[]seq = new int[size];
		
		for(int i = 0; i < seq.length; i++)
		{
			if(i == 0 || i == 1)
			{
				seq[i] = start;
			}
			else 
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			System.out.println(seq[i] + " ");
			not done 
}