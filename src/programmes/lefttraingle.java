package programmes;

public class lefttraingle {

	public static void main (String [] args)
	{
		int n=5;
	
		 for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");  // Two spaces for alignment
	            }
	            // Print stars
	            for (int j = 1; j <= i; j++) {
	               // System.out.print("* ");
	                System.out.print(j+" ");

	            }
	            System.out.println();  // Move to the next line after each row
    
 
	}
	}
}
