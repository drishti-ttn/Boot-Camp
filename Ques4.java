//WAP to create singleton class.
class Ques4 {
    public static Ques4 q = new Ques4();

    public String str;

    private Ques4() {
        str = "This is a string";
    }

    public static Ques4 getObj() {
        return q;
    }
}

class Test {
    public static void main(String[] args) {
        Ques4 q1 = Ques4.getObj();
        Ques4 q2 = Ques4.getObj();

        q1.str = (q1.str).toUpperCase();
        System.out.println("Object q1 " + q1.str);

        q2.str = (q2.str).toUpperCase();
        System.out.println("\n Object q2 " + q2.str);

    }
}
