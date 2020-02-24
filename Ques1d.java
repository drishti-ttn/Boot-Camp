//4. Convert a string to uppercase and return .Parameter (String) Return (String)
interface changeCase {
    String upperCase(String s);
}

public class Ques1d {
    public static void main(String[] args) {
        changeCase cc = (s -> {
            System.out.println("String is: " + s);
            return s.toUpperCase();
        });
        System.out.println("String in uppercase ");
        System.out.println(cc.upperCase("hello"));
    }
}
