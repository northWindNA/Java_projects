import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text");

        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String[] input = scan.nextLine().split(" ");
            for (String i : input) {
                System.out.println(i);
            }
            System.out.println(Arrays.toString(input));
        }
        scan.close();
    }
}

