// Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String

package CoreJava;

public class Ques4 {
    public static void main(String[] args) {
        String str = "Hello World @ ttn123";
        char[] ch = str.toCharArray();
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int other = 0;

        System.out.println("Number of LowerCase,UpperCase, Digits and other special characters: ");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(ch[i])) {
                lower++;
            } else if (Character.isUpperCase(ch[i])) {
                upper++;
            } else if (Character.isDigit(ch[i])) {
                digit++;
            } else {
                other++;
            }
        }
        System.out.println("lower: " + lower);
        System.out.println("upper: " + upper);
        System.out.println("digit: " + digit);
        System.out.println("other: " + other);

        System.out.println("Percentage is: ");
        System.out.println("% of lowerCase is:" + (lower * 100) / str.length());
        System.out.println("% of upperCase is:" + (upper * 100) / str.length());
        System.out.println("% of digits is:" + (digit * 100) / str.length());
        System.out.println("% of others is:" + (other * 100) / str.length());

    }
}
