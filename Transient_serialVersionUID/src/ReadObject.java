import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("men.bin"))) {
            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
