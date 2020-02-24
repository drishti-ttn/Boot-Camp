//Using (instance) Method reference create and apply add and subtract method and using (Static)
// Method reference create and apply multiplication method for the functional interface created.
@FunctionalInterface
interface Calc {
    int method(int a, int b);
}

public class Ques3 {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calc c = new Ques3()::add;
        System.out.println("Adding 2 numbers: " + c.method(20, 3));
        Calc c1 = new Ques3()::subtract;
        System.out.println("Subtracting 2 numbers: " + c1.method(20, 3));
        Calc c3 = Ques3::product;
        System.out.println("Product of 2 numbers: " + c3.method(20, 3));
    }
}
