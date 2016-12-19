
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
		int[] input =  {4, 2, 9, 6, 23,12,34, 0, 1};
		sort(input);
	}
}
