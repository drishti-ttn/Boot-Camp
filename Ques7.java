//Override the default method of the interface.
interface myInterface {
    public void inc(int a);

    default void display() {
        System.out.println("In default method..");
    }
}

public class Ques7 implements myInterface {
    public void inc(int a) {
        int result = ++a;
        System.out.println("After Increment: " + result);
    }

    public static void main(String[] args) {
        Ques7 q = new Ques7();
        q.inc(4);
        q.display();
    }
}
