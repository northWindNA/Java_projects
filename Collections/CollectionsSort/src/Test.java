import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("fox");
        animals.add("zebra");
        animals.add("lion");
        animals.add("lynx");
        animals.add("ox");
        animals.add("oxen");

        Collections.sort(animals, Comparator.comparingInt(String::length));

//        Collections.sort(animals, (o1, o2) -> {
//            return Integer.compare(o1.length(), o2.length());
//        });

//        Collections.sort(animals, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) {
//                    return 1;
//                }
//                else if (o1.length() < o2.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        System.out.println(animals);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1513);
        numbers.add(1511353);
        numbers.add(567);
        numbers.add(8471096);
        numbers.add(987);
        numbers.add(777);

        Collections.sort(numbers, Comparator.reverseOrder());

//        Collections.sort(numbers, (o1, o2) -> {
//            return o2.compareTo(o1);
//        });

//        Collections.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 > o2) {
//                    return -1;
//                }
//                else if (o1 < o2) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Mike"));
        people.add(new Person(2, "Jack"));
        people.add(new Person(1, "Jon"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                }
                else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(people);
    }
}

/*
    o1 > o2 return 1;
    o1 < o2 return -1;
    o1 == o2 return 0;

    compare(2, 1) -> 1;
    compare(1, 2) -> -1;
    compare(1, 1) -> 0;
 */

//class StringLengthComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        if (o1.length() > o2.length()) {
//            return 1;
//        }
//        else if (o1.length() < o2.length()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//}

//class  BackwardsIntegerComparator implements Comparator<Integer> {
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if (o1 > o2) {
//            return -1;
//        }
//        else if (o1 < o2) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
