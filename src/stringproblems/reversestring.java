package stringproblems;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "hello";
	        String reversed = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed = reversed+str.charAt(i);
	        }

	        System.out.println("Reversed string: " + reversed);
	}

}
