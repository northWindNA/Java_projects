import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        //no sort, no order
        Map<Integer, String> hashMap = new HashMap<>();

        //keep the order of elements the way they were put
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //pairs(Entry)[key, value] will be sorted by natural order of keys
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(52, "Jon");
        map.put(77, "Mike");
        map.put(999, "Neil");
        map.put(146147, "Leonard");
        map.put(11, "Conor");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
