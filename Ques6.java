//Create and access default and static method of an interface.
interface Test {
    public void dec(int a);

    default void show() {
        System.out.println("In default method..");
    }

    static void display() {
        System.out.println("In static method..");
    }
}

public class Ques6 implements Test {

    @Override
    public void dec(int a) {
        System.out.println("Value of a: " + a);
        int result = --a;
        System.out.println("After decrement: " + result);
    }

    public static void main(String[] args) {
        Ques6 q = new Ques6();
        q.dec(5);
        q.show();
        Test.display();
    }
}
