package programmes;
import java.io.BufferedReader;
import java.io.FileReader;

public class textfileread {

	public static void main(String[] args)
	{
BufferedReader reader=null;
		
		int linec=0;
		int wordc=0;
		int charc=0;
		try {
			reader = new BufferedReader(new FileReader("D:\\reading file.txt"));
			String line=reader.readLine();
			
			while(line!=null)
			{
				linec++;
				String[] words=line.split(" ");
				wordc=wordc+words.length;
				
				for(String word:words)
				{
					charc=charc+word.length();
				}
			 line=reader.readLine();
			}
			System.out.println("No of Lines:"+linec);
			System.out.println("No of Words:"+wordc);
			System.out.println("No of Charcters:"+charc);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
