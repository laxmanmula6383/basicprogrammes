package patterns;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int space=1;space<=n-i;space++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i*2)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
