package programmes;

import java.util.Arrays;

public class bubblesort {

	 static void bubbleSorting(int array[]) {
		    int size = array.length;
		    
		  
		    for (int i = 0; i < size - 1; i++)
		    
		      for (int j = 0; j < size - i - 1; j++)

		        if (array[j] > array[j + 1]) {

		          int temp = array[j];
		          array[j] = array[j + 1];
		          array[j + 1] = temp;
		        }
		  }
	        public static void main(String args[]) {
		      
		    int[] data = { -90, 3, 30, -2, 4 };
		    bubblesort.bubbleSorting(data);
		    System.out.println("bubble sorting  Order:");
		    System.out.println(Arrays.toString(data));
		  }
}
