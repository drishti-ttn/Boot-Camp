//Implement multiple inheritance with default method inside interface.
interface Rectangle {
    default void area(int length, int breadth) {
        System.out.println("Area of Rectangle is.. " + 2 * length * breadth);
    }
}

interface Square {
    default void area(int side) {
        System.out.println("Area of Square is.. " + side * side);
    }
}

public class Ques8 implements Rectangle, Square {
    public void show() {
        Rectangle.super.area(4, 3);
        Square.super.area(3);
    }

    public static void main(String[] args) {
        Ques8 q = new Ques8();
        q.show();
    }
}
