package arraproblems;

import java.util.Arrays;
import java.util.Collections;
public class sortingdescendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[] = {9,4,2,5,8,0};
        Arrays.sort(arr, Collections.reverseOrder());

		System.out.println("descending order "+Arrays.toString(arr));
		
	}

}
