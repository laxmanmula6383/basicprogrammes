package programmes;
import java.util.Scanner;

public class currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println(" 1.Thailand --> THB");
		 System.out.println(" 2.Austria --> EUR ");
	     System.out.println(" 3.America -->  USD ");
	     System.out.println(" 5.Nigeria --> NGN ");
	     System.out.println( " 4.China --> CNY ");
	     System.out.println( " 6.Bangladesh --> BDT ");
	     System.out.println(" 7.Japan --> JPY ");
	     System.out.println(" 8.Russia --> RUB ");
	     System.out.println(" 9.India --> INR ");
	     System.out.println(" 10.North Korea --> KPW ");
		 
		 
		 System.out.println("             ");
		 System.out.println("Enter Country code:- ");
		 String cn=sc.next();
		 System.out.println("Enter Currency amount:- ");
		 int ca=sc.nextInt();
		// int ca=sc.nextInt();
		 if(cn.equals("USD"))
		 {
		 System.out.println(ca+"$");
		
		 }
		  else if(cn.equals("BDT"))
		  {
		 System.out.println(ca+"৳");
		  }
		 else if(cn.equals("CNY"))
		 {
		 System.out.println(ca+"¥");
		 }
		 else if(cn.equals("INR"))
		 {
		 System.out.println(ca+"₹");
		 }
		 else if(cn.equals("JPY"))
		 {
		 System.out.println(ca+"¥");
		}
		 else if(cn.equals("KPW"))
		 {
		 System.out.println(ca+"₩");
		 }
		 else if(cn.equals("RUB"))
		 {
		 System.out.println(ca+"₽");
		 }
		 else if(cn.equals("THB"))
		 {
		 System.out.println(ca+"฿");
		 }
		 else if(cn.equals("NGN"))
		 {
		 System.out.println(ca+"₦");
		 }
		 else if(cn.equals("EUR"))
	    {
	    System.out.println(ca+"€");
	    }
	    else
	    {
		System.out.println("Wrong input Given ");
		}
		 sc.close();


	}

}
