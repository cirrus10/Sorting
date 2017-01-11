
public class QuickSortAlgo {
	 static int[] array;
	
	
	public static void sort(int[] input, int l, int h)
	{
		array = input;
		if(l < h)
		{
			int pivot = array[h];
			int pIndex = l;
			for(int i = l; i<h; i++)
			{
				if(array[i]<= pivot)
				{
					swapElementsAt(pIndex,i);
					pIndex = pIndex++;
				}
			}
			swapElementsAt(pIndex, h);
					
			sort(array, l, pIndex-1);
			sort(array, pIndex+1, h);
		}
	}

	public static void swapElementsAt(int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void main(String args[])
	{
		int[] input = {20,22,24,26,28,18};
		sort(input, 0, input.length -1);
		for(int k: array)
		{
			System.out.print(k+" ");
		}
	}

}
