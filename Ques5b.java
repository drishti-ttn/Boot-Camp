import java.util.function.Supplier;

public class Ques5b {
    public static void main(String[] args) {
        Supplier<Employee> supplier = () -> new Employee("Drishti", 23, "New Delhi");
        Employee e = supplier.get();
        System.out.println("Employee Details: \n " + e.name + " , " + e.age + " , " + e.city);
    }
}
