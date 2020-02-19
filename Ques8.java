//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
package CoreJava;

public class Ques8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Drishti Talwar");
        System.out.println("Original String: " + sb);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
        System.out.println("\nRemoving characters from index 4 to 9");
        sb.delete(4, 9);
        System.out.println("After removing: " + sb);
    }
}
