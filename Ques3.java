public class Ques3 {
    public static void main(String[] args) {
        try {
            Class.forName("Ques3");
            System.out.println("Class found successfully");
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception caught");
            ex.printStackTrace();
        }

    }
}

