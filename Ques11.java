/*
Create 3 sub class of bank SBI,BOI,ICICI all
 4 should have method called getDetails which provide there specific details like
 rateofinterest etc,print details of every banks
*/
package CoreJava;

class Bank {
    float rateOfInterest;
    String bankName;
    String accountType;

    public Bank(String bn, float roi, String acc) {
        rateOfInterest = roi;
        bankName = bn;
        accountType = acc;
    }

    void display() {
        System.out.println("Bank Name is: " + bankName);
        System.out.println("Rate of Interest is: " + rateOfInterest);
        System.out.println("Account Type is: " + accountType);
        System.out.println("");
    }
}

class SBI extends Bank {
    public SBI(String bn, float roi, String acc) {
        super(bn, roi, acc);
    }
}

class ICICI extends Bank {
    public ICICI(String bn, float roi, String acc) {
        super(bn, roi, acc);
    }
}

class HDFC extends Bank {
    public HDFC(String bn, float roi, String acc) {
        super(bn, roi, acc);
    }
}

public class Ques11 {
    public static void main(String[] args) {
        SBI sbi = new SBI("SBI", 2.1f, "Savings");
        ICICI icici = new ICICI("ICICI", 3.1f, "Current");
        HDFC hdfc = new HDFC("HDFC", 4.2f, "Salary");
        sbi.display();
        icici.display();
        hdfc.display();
    }
}




