import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//12. Find the first even number in the integer list which is greater than 3
public class Ques12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("First even number in the integer list which is greater than 3: ");
        System.out.println(
                list
                        .stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .findFirst()
                        .orElse(-1)
        );
    }
}
