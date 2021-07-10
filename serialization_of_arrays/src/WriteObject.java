import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {

        Person[] people = {new Person(1, 15, "Nariman"),
        new Person(2, 18, "Pasha"), new Person(3, 20, "Misha")};

        FileOutputStream fos = new FileOutputStream("men.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(people);

//        oos.writeInt(people.length); // kind of realization
//        for (Person person : people) {
//            oos.writeObject(person);
//        }

        oos.close();
    }
}
