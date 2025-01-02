package programmes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstFortnightChecker {
	 public static void main(String[] args) {


		 String inputDateStr = "01-08-2023";
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-mmm-yyyy");
	        try {

	            Date inputDate = sdf.parse(inputDateStr);

	            int dayOfMonth = inputDate.getDate();

	 

	            if (dayOfMonth >= 1 && dayOfMonth <= 15) {

	                System.out.println("The given date is in the first fortnight.");

	            } 
	            else {
	                System.out.println("The given date is second fortnight.");
	            }
	            
	        } catch (ParseException e) {

	            System.out.println("Invalid date format. Please use yyyy-MM-dd.");

	        }

	    }
}
