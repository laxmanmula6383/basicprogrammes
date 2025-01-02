package programmes;

public class position_of_given_string {
	 public static void main(String args[]) {
			String search="Quality";
			String sc="Excellence Through Quality";
			String[] words=sc.split(" ");
			for(int i=0;i<words.length;i++) {
			if(words[i].equals(search)) {
			System.out.println("Actual position of word is: " +(i+1));
		  }
		}
	  }
}
