import java.io.*;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {new Person(1, 15, "Nariman"),
                new Person(2, 18, "Pasha"), new Person(3, 20, "Misha")};

        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("men.bin"))) {
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
