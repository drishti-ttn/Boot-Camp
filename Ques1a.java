//(1) First number is greater than second number or not Parameter (int ,int ) Return boolean
@FunctionalInterface
interface Check {
    boolean greaterOrNot(int a, int b);
}

public class Ques1a {
    public static void main(String[] args) {
        Check c = (a, b) -> {
            if (a > b)
                return true;
            else
                return false;
        };
        System.out.println(c.greaterOrNot(20, 10));
    }
}