//2. Create a functional interface whose method takes 2 integers and return one integer.
@FunctionalInterface
interface Demo {
    int method(int a, int b);
}

public class Ques2 {
    public static void main(String[] args) {
        Demo d = ((a, b) -> {
            System.out.println("a is:" + a + ", b is:" + b);
            return a + b;
        });
        System.out.println("Returning one integer: " + d.method(3, 4));
    }
}
