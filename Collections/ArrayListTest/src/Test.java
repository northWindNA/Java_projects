import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);
        System.out.println();
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(19));
        System.out.println(arrayList.size());
        System.out.println();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();
        for (Integer i : arrayList) {
            System.out.println(i);
        }
        System.out.println();
        arrayList.remove(5); // [1,2,3,4,5] -> [1,2,,<-4,<-5] -> [1,2,4,5]
        System.out.println(arrayList);
        // don't use arraylist when you need to remove some element from middle of array
        // it's not optimal
    }
}
