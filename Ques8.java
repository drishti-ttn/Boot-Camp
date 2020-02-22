import java.util.concurrent.Semaphore;

public class Ques8 {
    int count = 0;
    Semaphore s = new Semaphore(3);

    public static void main(String[] args) {
        Ques8 q1 = new Ques8();
        Thread t1 = new Thread() {
            public void run() {
                try {
                    q1.func();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            public void run() {
                try {
                    q1.func();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t2.start();
    }

    private void func() throws InterruptedException {
        try {
            s.acquire();
            System.out.println(Thread.currentThread().getName() + "Lock Aquired");
            count++;
            System.out.println("Count is: " + count);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s.release();
            System.out.println(Thread.currentThread().getName() + "Lock Released");
        }


    }
}
