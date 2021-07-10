import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person man1 = new Person(1, 42, "Mullinet");
        Person man2 = new Person(2, 33, "Kruise");
        Person man3 = new Person(3, 21, "Airat");

        FileOutputStream fos = new FileOutputStream("men.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(man1);
        oos.writeObject(man2);
        oos.writeObject(man3);

        oos.close();
    }
}
