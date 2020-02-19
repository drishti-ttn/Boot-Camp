//WAP showing try, multi-catch and finally blocks.

public class Ques6 {
    public static void main(String[] args) {
        try {
/*
            int a = 20, b = 0;
            float result = a / b;
*/

            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[5]);
        } catch (ArithmeticException ae) {
            System.out.println("Arithmentic Exception");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array Index Out of Bound");
        } finally {
            System.out.println("This is finally block");
        }
    }
}
