//(1) Consumer
import java.util.function.Consumer;

public class Ques5a {
    static void printName(String name) {
        System.out.println("Hello " + name);
    }

    static void printValue(int val) {
        System.out.println(val);
    }

    public static void main(String[] args) {
        Consumer<String> consumer1 = Ques5a::printName;
        consumer1.accept("Drishti");
        Consumer<Integer> consumer2 = Ques5a::printValue;
        consumer2.accept(10);
    }
}
