import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileInput {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);

        System.out.println(System.in);
        pw.println("Test line 1");
        pw.println("Test line 2");
        pw.println("Test line 3");

        pw.close();
    }
}
