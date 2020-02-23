import java.util.HashMap;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        System.out.println("Enter Input: ");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        s.toLowerCase();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int count = hm.get(s.charAt(i));
                hm.put(s.charAt(i), ++count);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        System.out.println("The occurances of each character is: " + hm);
    }
}