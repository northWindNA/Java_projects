import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        testSet(hashSet);
        System.out.println("==================================================");
        testSet(linkedHashSet);
        System.out.println("==================================================");
        testSet(treeSet);
        System.out.println("==================================================");
        containSetTest(hashSet);
        System.out.println("==================================================");
        containSetTest(linkedHashSet);
        System.out.println("==================================================");
        containSetTest(treeSet);
    }

    public static void testSet(Set<String> set) {
        set.add("Bob");
        set.add("Jack");
        set.add("Jon");
        set.add("Iona");
        set.add("George");
        set.add("Donald");

        for (String name : set) {
            System.out.println(name);
        }
    }

    public static void containSetTest(Set<String> set) {
        System.out.println("checkBob-> " +  set.contains("Bob"));
        System.out.println("checkJon-> " +  set.contains("Jon"));
        System.out.println("checkDonald-> " +  set.contains("Donald"));
        System.out.println("checkTom-> " +  set.contains("Tom"));
        System.out.println("checkSebastian-> " +  set.contains("Sebastian"));
    }
}
