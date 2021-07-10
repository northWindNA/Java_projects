import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -3380420160267765227L;
//    this id holds the version of class
//    this is necessary when class has been updated
//    and you need to get information from file with objects
    private transient final int id;
    private final int age;
    private final String name;



    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
