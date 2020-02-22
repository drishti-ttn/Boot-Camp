
class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            try {
                sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class Ques2a {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        t1.start();
        t2.start();
    }
}
