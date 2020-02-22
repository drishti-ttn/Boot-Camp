
public class Ques10 {
    public static void main(String[] args) {

        Object lock1 = new Object();
        Object lock2 = new Object();
        Thread t1 = new Thread() {
            public void run() {
                synchronized (lock1) {
                    System.out.println("Acquired Lock 1 on " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
                synchronized (lock2) {
                    System.out.println("Waiting for Lock 2 on " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (lock2) {
                    System.out.println("Acquired Lock 2 on " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
                synchronized (lock1) {
                    System.out.println("Waiting for Lock 1 on " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        };
        t1.start();
        t2.start();


    }
}
