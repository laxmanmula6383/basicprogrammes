package programmes;

public class rightangletriangle {
	
	public static void main(String [] args)
	{
		
		 int n = 5;  // Number of rows

        for (int i = 1; i <= n; i++) // It starts from i = 1 and runs until i is less than or equal to n (which is 5 in this case).
	        {
	            for (int j = 1; j <= i; j++) //It starts from j = 1 and runs up to j <= i, which means the number of stars in each row corresponds to the current row number (i).
	            {
	                System.out.print("* "); // Print stars on the same line
	            }
	            System.out.println();  // Move to the next line after each row
	        }
	}

}
