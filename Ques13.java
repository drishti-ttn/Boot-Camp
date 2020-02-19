//Create a custom exception that do not have any stack trace.
class Person {
    float height;

    Person(float h) {
        height = h;
    }

    float getHeight() {
        return this.height;
    }
}

class Park {
    final float pheight = 1.2f;

    public void check(Person p) throws HeightNotSuitableException {
        float x = p.getHeight();
        if (x < pheight) {
            System.out.println("Not a suitable height");
            throw new HeightNotSuitableException(x);
        } else {
            System.out.println("Entry Allowed");
        }
    }
}

class HeightNotSuitableException extends Exception {
    float height;

    HeightNotSuitableException(float x) {
        height = x;
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }

}

public class Ques13 {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Park p = new Park();
        try {
            p.check(p1);
        } catch (HeightNotSuitableException e) {
            e.printStackTrace();
            System.out.println();
        }

    }
}

