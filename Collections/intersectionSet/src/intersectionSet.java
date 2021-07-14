import java.util.HashSet;
import java.util.Set;

public class intersectionSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < 10; i++){
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 5; i < 15; i++){
            set2.add(i);
        }
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
    }
}
