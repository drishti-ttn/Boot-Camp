import java.util.Queue;

class Customer {
    public int tokenNumber;
    public String order;
    private int payment;

    public void payCash() {
    }

    public void placeOrder() {
    }

    public int getTokenNumber() {
        return 0;
    }

    public void getNotification() {
    }
}

class Cashier {
    private int orderid;

    private String getOrder() {
        return null;
    }

    public void receiveCash() {
    }

    public void notifyCustomer(Customer c1) {
    }

    public int issueToken(){
        return orderid;
    }
}

class Barista {

    public void prepareCoffee() {
    }

    public void placeCoffee() {
    }

    public void notifyCustomer(Customer c1) {
    }
}

public class Ques10 {
    public static void main(String[] args) {

    }
}