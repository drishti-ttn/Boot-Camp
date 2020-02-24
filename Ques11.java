import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//11. Find average of the number inside integer list after doubling it.
public class Ques11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Average of the numbers after doubling them is: ");
        System.out.println(
                list
                        .stream()
                        .map(e -> e * 2)
                        .mapToInt(e -> e).average()
                        .orElse(-1)
        );
    }
}
