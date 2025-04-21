package arraproblems;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sdshgfs dfhdug dfigggf ghgf";
		
		//String newname=name.trim();
		int letters=0;
		
		for(char lrs: name.toCharArray())
		{
			letters++;
		}
		
		System.out.println(letters);
		
		
		String words[] =name.split(" ");
		
		int wordscount=0;
		for(int i=0;i<words.length;i++)
		{
			wordscount++;
		}
		
		System.out.println(wordscount);
		if(wordscount>=2)
		{
			System.out.println(words[wordscount-2]+","+words[wordscount-1]);
			System.out.println(words[0]+","+words[1]);

		}
	}

}
