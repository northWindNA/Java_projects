import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        map.put(person1, "123");
        map.put(person2, "123");
        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
        System.out.println(person1.equals(person2));
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    // {object} -> {int}
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /*
    Contract hashCode()-equals():
    1) call hashCode()-method for two objects
    2)if hashes are different then objects are exactly different
    3) if hashes are equal then we call equals()-method
    4) at that stage equals()-method guarantees equality or difference
     */
}
