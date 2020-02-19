class Ques5 implements Cloneable {
    int eid;
    String name;

    Ques5(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Ques5 e1 = new Ques5(101, "Drishti");
            Ques5 e2 = (Ques5) e1.clone();
            System.out.println("Emp1: " + e1.eid + " " + e1.name);
            System.out.println("Emp2: " + e2.eid + " " + e2.name);
        } catch (CloneNotSupportedException c) {
            System.out.println("Not Supported");
        }
    }
}

