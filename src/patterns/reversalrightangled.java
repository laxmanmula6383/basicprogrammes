package patterns;

public class reversalrightangled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		/*
		for(int i=n;i>=1;i--)
		{
		
			for(int space = 1; space <= n - i; space++)  
			{
				System.out.print(" ");

			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("i");
			}
			System.out.println();

			
		}*/
		
		
		for(int i=n;i>=1;i--)
		{
			for(int space=1;space<=n-i;space++)
			{
			 System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("i");
			}
			System.out.println();
		}
		
	}

}
