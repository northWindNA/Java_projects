import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements (Collection collection){
        collection.add(new Person(3, "Tom"));
        collection.add(new Person(1, "Jacky"));
        collection.add(new Person(4, "Sebastian"));
        collection.add(new Person(2, "Jony"));
    }
}
