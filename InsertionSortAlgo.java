
public class InsertionSortAlgo {
	public static void sort(int[] array)
	{
		for(int i = 0; i<array.length-1; i++)
		{
			for(int j = i; j >= 0; j--)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int k : array)
		{
			System.out.print(k+" ");
		}
	}
	
	public static void main(String args[])
	{
		int[] input = {60, 50,40, 20, 30, 90, 80};
		sort(input);
	}
  
}
