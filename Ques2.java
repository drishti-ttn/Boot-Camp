//Write a program to find the number of occurrences of the duplicate words in a string and print them

package CoreJava;

public class Ques2 {
    public static void main(String[] args) {
        int count;
        String str = "I am doing the program to calculate duplicate words.There are duplicate duplicate words in the statement";
        System.out.println("String: " + str);
        str = str.toLowerCase();
        String tmp[] = str.split(" ");
        System.out.println("Duplicate words are:");
        for (int i = 0; i < tmp.length; i++) {
            count = 1;
            for (int j = i + 1; j < tmp.length; j++) {
                if (tmp[i].equals(tmp[j])) {
                    count++;
                    tmp[j] = "0";
                }
            }
            if (count > 1 && tmp[i] != "0") {
                System.out.println("Count of " + tmp[i] + " is: " + count);
                System.out.println(tmp[i]);
            }
        }
    }
}
