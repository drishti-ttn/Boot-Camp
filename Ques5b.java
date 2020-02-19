public class Ques5b {
    int eid;
    String name;

    Ques5b(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    Ques5b(Ques5b q) {
        eid = q.eid;
        name = q.name;
    }

    public static void main(String[] args) {
        Ques5b e1 = new Ques5b(101, "Drishti");
        Ques5b e2 = new Ques5b(e1);
        System.out.println("Emp1: " + e1.eid + " " + e1.name);
        System.out.println("Emp2: " + e2.eid + " " + e2.name);
    }
}

