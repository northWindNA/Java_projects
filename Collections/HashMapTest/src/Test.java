import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map);

        map.put(3, "Five");

        System.out.println(map); //hashmap changes the value of the key which exist
        System.out.println(map.get(2)); //there is such key and value
        System.out.println(map.get(7)); //there is no such key and value

        //hashMap doesn't guarantee the order of elements
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
