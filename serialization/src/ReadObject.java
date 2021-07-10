import java.io.*;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("men.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person man1 = (Person) ois.readObject();
        Person man2 = (Person) ois.readObject();
        Person man3 = (Person) ois.readObject();

        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(man3.toString());

        ois.close();
    }
}
