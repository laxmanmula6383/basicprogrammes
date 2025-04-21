package patterns;

public class right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			//spaces
			
			for(int spaces=1;spaces<=n-i;spaces++)
			{
				System.out.print(" ");
			}
			
			for(int star=1;star<=i;star++)
			{
				System.out.print("*");
			}
			
			System.out.println();

			
		}
	}

}
