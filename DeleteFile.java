package programmes;
import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
      //  File myFile = new File("./src/test/resources/newFile.txt");
        File myFile = new File("./Users/laxmanaraom/Downloads/AIMS/RCS");
       
        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file."+ myFile.getName());
        }
    }
}
