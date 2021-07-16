import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);
        Person person5 = new Person(5);
        Person person6 = new Person(6);
        Person person7 = new Person(7);

        Queue<Person> people = new ArrayBlockingQueue<Person>(5);
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person5));
        System.out.println(people.offer(person7));
        System.out.println(people.offer(person1));
        System.out.println(people.offer(person6));

        System.out.println(people.remove() + " - removed");
        System.out.println();
        System.out.println(people.peek() + " - peeked");
        System.out.println();
//         p3 <- p2 <-p4 <-p5 <-p7 <-p1 <-p6
//         queue holds the order of elements
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

class Person {
    int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
