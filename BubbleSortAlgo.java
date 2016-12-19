
public class BubbleSortAlgo {
	public static void sort(int array[])
	{
		int length =  array.length;
		for (int i = 0; i< length; i++)
		{
			for(int j = 0; j<length-1; j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(int k = 0; k<length; k++)
		{
			System.out.print(array[k]+" ");
		}
	}
	
	public static void main(String args[])
	{
		int[] input =  {10, 56, 45, 33, 22, 11, 1, 0};
		sort(input);
	}
}
