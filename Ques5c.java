import java.util.function.Predicate;

public class Ques5c {
    public static void main(String[] args) {
        Predicate<Integer> predicate = a -> (a > 20);
        System.out.println(predicate.test(30));
    }
}
