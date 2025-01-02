package programmes;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class storing_data_in_text {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		  HashMap<String,String> map=new HashMap<String,String>();
		  map.put("laxman","navayuga");
		  map.put("kuldip","navayuga");
		  map.put("mani","navayuga");
		  map.put("hemanth","cts");
		  map.put("virat","indico");
		  
		  Scanner sc=new Scanner(System.in);
		  DateTimeFormatter dt=DateTimeFormatter.ofPattern("uuuu-MMM-dd");
		  LocalDate date = LocalDate.now();
		  
		  System.out.println("Enter Employee name");
		  String name=sc.next();
		  
		  
		  PrintWriter pr=new PrintWriter("D:\\storing data.txt");
		  pr.println("Date"+""+"Time");
		  pr.println("............................");
		  pr.println(name+" "+""+date);
		  pr.close();
			if(map.containsKey(name))
			{
			String a=map.get(name);
			if(a=="navayuga")
			{
				System.out.println("Yes");
			}
			else 
				System.out.print("No");
			}	     
	       sc.close();

	}

}
