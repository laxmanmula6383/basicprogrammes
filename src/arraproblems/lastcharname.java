package arraproblems;

public class lastcharname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="laxman";
		String newname=name.substring(name.length()-2);
        String reversed = "" + newname.charAt(1) + newname.charAt(0); 

        System.out.println("Last 2 characters reversed: " + reversed);

		System.out.println(newname);
	}

}
