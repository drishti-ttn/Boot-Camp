import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Write a method that takes a string and returns the number of unique characters in the string.
public class Ques2 {
    public int countChars(String word) {
        Set<Character> w = new HashSet<>();
        for (Character c : word.toCharArray()) {
            w.add(c);

        }
        System.out.println("The Unique Characters are: " + w);
        return w.size();
    }

    public static void main(String[] args) {
        System.out.println("Enter Input: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        word.toLowerCase();
        Ques2 q = new Ques2();
        System.out.println("The number of unique characters are: " + q.countChars(word));
    }
}
