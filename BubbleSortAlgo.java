
public class BubbleSortAlgo {
	public static void sort(int array[])
	{
		int length =  array.length;
		for (int i = 0; i< length; i++)
		{
			for(int j = 0; j<length; j++)
			{
				if(array[i]<array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
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
