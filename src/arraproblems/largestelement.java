package arraproblems;

public class largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {43,65,23,76,2,98};
		
		int largest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		
		System.out.println("largest: "+largest);
	}

}
