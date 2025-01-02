package programmes;

public class regulartriangle {
	public static void main (String [] args)
	{
	int n = 5;  // Number of rows for the triangle

    for (int i = 1; i <= n; i++) {
        // Print leading spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");  // Print spaces for alignment
        }
        // Print stars
        for (int j = 1; j <= (2 * i - 1); j++) {
     	           // for (int j = 1; j <= i; j++) {

        System.out.print("* ");  // Print stars
        }
        // Move to the next line after each row
        System.out.println();
    }
	}
}
