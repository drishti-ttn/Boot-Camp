import java.util.*;

import static java.util.Map.*;

//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency
// then print the one which came first.
public class Ques7 {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array elements with their frequencies are: ");
        for (int j = 0; j < arr.length; j++) {
            if (!m.containsKey(arr[j])) {
                m.put(arr[j], 1);
            } else {
                m.put(arr[j], m.get(arr[j]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        List<Entry<Integer, Integer>> decfreq = new ArrayList<>(m.entrySet());
        Collections.sort(decfreq, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("Elements with decreasing frequencies..");
        for (Entry<Integer, Integer> entry : decfreq) {
            int frequency = entry.getValue();
            while (frequency >= 1) {
                System.out.print(entry.getKey() + " ");
                frequency--;
            }
        }
    }

}
