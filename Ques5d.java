import java.util.function.Function;

public class Ques5d {
    static String print(String message) {
        return "Hello " + message;
    }

    public static void main(String[] args) {
        Function<String, String> function = Ques5d::print;
        System.out.println(function.apply("Drishti"));
    }
}
