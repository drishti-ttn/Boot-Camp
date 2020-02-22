class MyThread extends Thread {
    public void run() {
        int value = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1 running...");
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ques6{
public static void main(String[] args) throws InterruptedException {
    MyThread m=new MyThread();
    m.start();
    m.join();
    System.out.println("Waiting for Thread 1 to complete");
    for(int i=0;i<5;i++){
        System.out.println("Thread 2 running...");
    }
}
}