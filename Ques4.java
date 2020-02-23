import java.util.*;
import java.lang.*;

public class Ques4 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "Drishti");
        m.put(2, "Akshita");
        m.put(3, "Nisha");
        m.put(4, "Shreya");
        m.put(5, "Neha");

        List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(m.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
            System.out.println("Sorting by Value..");
        for (Map.Entry<Integer, String> items : list) {
            System.out.println("Key = " + items.getKey() +
                    ", Value = " + items.getValue());
        }
    }
}
