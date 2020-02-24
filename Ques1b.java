//2. Increment the number by 1 and return incremented value Parameter (int) Return int
interface Inc {
    int increment(int a);
}

public class Ques1b {
    public static void main(String[] args) {
        Inc i = (a) -> {
            System.out.println("Number is: " + a);
            a++;
            return a;
        };
        System.out.println("Incrementing the number by 1: " + i.increment(4));

    }

}
