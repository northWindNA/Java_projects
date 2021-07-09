import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions2 {
    public static void main(String[] args) {
        //Checked exceptions - compile-time exceptions - all except runtime
        //Unchecked exceptions - runtime exceptions - runtime
        try {
            run();
        } catch (Exceptions e) {
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
