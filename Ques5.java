class User {
    int amt = 1000;

    synchronized void withdraw(int amt) {
        System.out.println("Withdrawing the amount");

        if (this.amt < amt) {
            System.out.println("Your Balance is low");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.amt = this.amt - amt;
            System.out.println("Amount Withdrawn");
        }
    }

    synchronized void deposit(int amt) {
        System.out.println("Depositing the amount");
        this.amt = this.amt + amt;
        System.out.println("Amount Deposited");
        notify();
    }

}


public class Ques5 {
    public static void main(String[] args) {
        User u = new User();
        Thread t1 = new Thread() {
            public void run() {
                u.withdraw(1500000);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                u.deposit(10000);
            }
        };
        t1.start();
        t2.start();
    }
}
