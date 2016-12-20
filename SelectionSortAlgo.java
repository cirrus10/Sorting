
public class SelectionSortAlgo {

	public static void sort(int array[])
	{
		
		for(int i = 0; i<array.length; i++)
		{
			int min = i;
			for(int j = i+1;j<array.length; j++)
			{
				if(array[j] < array[min])
				{
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		for (int k : array)
		{
			System.out.print(k+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int input[] = {22,44,55,33,66,77,11};
      sort(input);
	}

}
