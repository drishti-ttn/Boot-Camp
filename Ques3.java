//synchronization block
class A1 {
    void test1(int n) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());
            for (int i = 1; i <= 5; i++) {
                System.out.println(n + i);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }
    }
}

class T1 extends Thread {
    A1 t;

    T1(A1 t) {
        this.t = t;
    }

    public void run() {
        t.test1(5);
    }

}

class T2 extends Thread {
    A1 t;

    T2(A1 t) {
        this.t = t;
    }

    public void run() {
        t.test1(2);
    }

}

public class Ques3 {
    public static void main(String[] args) {
        A1 obj = new A1();
        T1 t1 = new T1(obj);
        T2 t2 = new T2(obj);
        t1.start();
        t2.start();
    }
}

