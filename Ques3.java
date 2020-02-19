//Write a program to find the number of occurrences of a character in a string without using loop
package CoreJava;

public class Ques3 {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str);
        int count = str.length() - str.replace("l", "").length();
        System.out.println("Number of occurances of 'l' in " + str + " is  \n= " + count);
    }
}
