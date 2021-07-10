import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("men.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person[] people = (Person[]) ois.readObject();

        System.out.println(Arrays.toString(people));

//        int personCount = ois.readInt(); // kind of realization

//        Person[] people = new Person[personCount];
//
//        for (int i = 0; i < personCount; i++) {
//            people[i] = (Person) ois.readObject();
//            System.out.println(people[i]);
//        }

        ois.close();
    }
}
