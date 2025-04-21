package arraproblems;

public class lasttwowords {

	public static void main(String[] args) {
        String name = "abbb gfg hdjsdsk fdfdreertr";
     
        int charcters=0;
        for(char a:name.toCharArray())
        {
        	charcters++;
        }
        System.out.println("letters of the sentence."+charcters);
        
        String[] words = name.split(" ");
        int wordslength = 0;
        for (int i = 0; i < words.length; i++) {
            wordslength++;
        }
        System.out.println("count of the sentence."+wordslength);
        if (wordslength >= 2) {
            System.out.println("Last two words:");
            System.out.print(words[wordslength - 2]+":"+words[wordslength - 1]);
        } else {
            System.out.println("Not enough words in the sentence.");
        }
	}

}
