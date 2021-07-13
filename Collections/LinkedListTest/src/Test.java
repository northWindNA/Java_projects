import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureArrayFillTime(linkedList);
        measureArrayFillTime(arrayList);
        System.out.println();
        measureGetValuesTime(linkedList);
        measureGetValuesTime(arrayList);
    }

    //there is a giant speed-difference between linked-list and arraylist

    private static void measureArrayFillTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);          //better for arraylist
//            list.add(0, i);   //better for linked-list
        }
        long end = System.currentTimeMillis();

        System.out.println("FillTime = " + (end - start));
    }

    private static void measureGetValuesTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            list.get(i);
            //linked-list is slower than arraylist when you get all element of array
        }
        long end = System.currentTimeMillis();

        System.out.println("GetValuesTime = " + (end - start));
    }
}
