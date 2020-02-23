//Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    Double age;
    Double salary;
    String name;

    public Employee(Double a, Double s, String n) {
        age = a;
        salary = s;
        name = n;
    }

    public Double getSalary() {
        return salary;
    }


    public String toString() {
        return "Employee [ age = " + age + ", salary = " + salary + ", name = " + name + "]";
    }

}

public class Ques5 {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(24.0, 24060.0, "Drishti"));
        emp.add(new Employee(25.0, 24050.0, "Nisha"));
        emp.add(new Employee(26.0, 24040.0, "Akshita"));
        emp.add(new Employee(27.0, 24030.0, "Shreya"));
        emp.add(new Employee(28.0, 24020.0, "Neha"));

        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() > o2.getSalary())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(emp, com);

        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}
