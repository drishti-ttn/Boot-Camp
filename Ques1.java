class Demo1 extends Thread {
    public static volatile int count = 0;

    public void run() {

        try {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Updating Count ");
            count++;
            System.out.println(count);
            sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class Ques1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo1 d2 = new Demo1();
        d1.start();
        d2.start();

    }
}