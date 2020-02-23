import java.util.ArrayList;
import java.util.Iterator;
public class Ques1 {
    public static void main(String[] args) {
        float sum = 0;
        ArrayList<Float> arr = new ArrayList<Float>();
        arr.add(1.2f);
        arr.add(1.3f);
        arr.add(1.4f);
        arr.add(1.5f);
        arr.add(1.6f);
        System.out.println("Elements are: ");
        Iterator<Float> it = arr.iterator();
        while (it.hasNext()) {
            float num = it.next();
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("Sum is: " + sum);
    }
}