package patterns;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int star=1;star<=(i*2)-1;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int star=1;star<=(i*2)-1;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
