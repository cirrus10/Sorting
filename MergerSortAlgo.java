
public class MergerSortAlgo {
	public static int[] input = {20,22,24,26,28,18};
	private static int[] temp = new int[input.length];
	
	public static void sort(int lowerIndex, int higherIndex)
	{
		if(lowerIndex< higherIndex){
			int middleIndex = (lowerIndex+higherIndex)/2;
			sort(lowerIndex, middleIndex);
			sort(middleIndex+1, higherIndex);
			merge(lowerIndex, middleIndex, higherIndex);
		}
	}
	
	public static void merge(int l, int m, int h)
	{
		for(int i =0; i<input.length; i++)
		{
			temp[i] = input[i];
		}
		int i = l;
		int j = m+1;
		int k =  l;
		while(i<=m && j<= h)
		{
			if(temp[i]<= temp[j])
			{
				input[k] = temp[i];
				i++;
			}
			else{
				input[k] = temp[j];
				j++;
			}
		}
	
		while(i<=m)
		{
			input[k] = temp[i];
			k++;
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sort( 0, input.length -1);
		for(int k: input)
		{
			System.out.print(k+" ");
		}
	}

}
