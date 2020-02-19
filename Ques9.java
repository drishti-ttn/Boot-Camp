//Design classes having attributes for furniture where
// there are wooden chairs and tables,
// metal chairs and tables.
// There are stress and fire tests for each products.
interface Furniture {
    void stressTest();

    void fireTest();
}

abstract class Chair implements Furniture {
    public abstract String chairType();
}

abstract class Table implements Furniture {
    public abstract String tableType();
}

class metalChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("passed in stress test");
    }

    @Override
    public void fireTest() {
        System.out.println("passed in fire test");
    }

    @Override
    public String chairType() {
        String s1 = "Metal Chair";
        return s1;
    }
}

class metalTable extends Table {
    @Override
    public void stressTest() {
        System.out.println("passed in stress test");
    }

    @Override
    public void fireTest() {
        System.out.println("passed in fire test");
    }

    @Override
    public String tableType() {
        String s2 = "Metal Table";
        return s2;
    }
}

class woodenChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("failed in stress test");
    }

    @Override
    public void fireTest() {
        System.out.println("failed in fire test ");
    }

    @Override
    public String chairType() {
        String s3 = "Wooden Chair";
        return s3;
    }
}

class woodenTable extends Table {
    @Override
    public void stressTest() {
        System.out.println("passed in stress test ");
    }

    @Override
    public void fireTest() {
        System.out.println("failed in fire test");
    }

    @Override
    public String tableType() {
        String s4 = "Wooden Table";
        return s4;
    }
}

public class Ques9 {
    public static void main(String[] args) {
        //metal chair
        metalChair m1 = new metalChair();
        System.out.println(m1.chairType());
        m1.fireTest();
        m1.stressTest();
        // metal table
        metalTable m2 = new metalTable();
        System.out.println(m2.tableType());
        m2.fireTest();
        m2.stressTest();
        //wooden chair
        woodenChair w1 = new woodenChair();
        System.out.println(w1.chairType());
        w1.fireTest();
        w1.stressTest();
        //wooden table
        woodenTable w2 = new woodenTable();
        System.out.println(w2.tableType());
        w2.fireTest();
        w2.stressTest();
    }
}
