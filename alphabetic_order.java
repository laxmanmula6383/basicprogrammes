package programmes;

import java.util.Arrays;

public class alphabetic_order {

	public static void main(String[] args) {
	
		String str="Apple";
		char a[]=str.toCharArray();
	     int i,j;
		for( i=0;i<str.length();i++)
		{
			for(j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
			}
			
			if(j==i)
			{
				Arrays.sort(a);
				System.out.println(a[i]);
			}
		}
	}
}
