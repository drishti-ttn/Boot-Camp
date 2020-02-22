
class Demo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ques2b {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Demo());
        Thread t2 = new Thread(new Demo());
        t1.start();
        t2.start();
    }
}

