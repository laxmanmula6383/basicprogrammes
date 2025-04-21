package arraproblems;

public class maxandminarray {

	public static void main(String[] args) {

		int arr[]= {1,54,76,34,98,35};
		int max=arr[0];
		int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
    System.out.println("Max: " + max + ", Min: " + min);
	}
}
