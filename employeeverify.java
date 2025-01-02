package programmes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class employeeverify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name;
         
		  HashMap<String,String> map=new HashMap<String,String>();
         map.put("laxman","navayuga");   
         map.put("virat","navayuga");
         map.put("yuvi","navayuga");
         map.put("kuldip","navayuga");
         map.put("shankar", "navayuga");
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a employee name");
         
         name=sc.next();
          String cmp="navayuga";
          if(map.get(name)==cmp)
          {
        	  System.out.println(name+" "+"belongs to this "+cmp);
          }
          else
          {
        	  System.out.println("entered details are wrong");
          }
	}
}
