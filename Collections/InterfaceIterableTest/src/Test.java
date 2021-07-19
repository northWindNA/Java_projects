import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //Before Java 5
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        //Java 5
        for (int i : list) {
            System.out.println(i);
        }
    }
}
