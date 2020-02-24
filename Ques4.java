//Create an Employee Class with instance variables
// (String) name, (Integer)age, (String)city and get
// the instance of the Class using constructor reference
@FunctionalInterface
interface constructorReference {
    Employee getEmp(String name, Integer age, String city);
}

class Employee {
    String name;
    Integer age;
    String city;

    Employee(String n, Integer a, String c) {
        name = n;
        age = a;
        city = c;
    }

    public void display() {
        System.out.println("Name: " + name + ",Age: " + age + ",City: " + city);
    }
}

public class Ques4 {
    public static void main(String[] args) {
        constructorReference conref = Employee::new;
        Employee e = conref.getEmp("Drishti", 23, "New Delhi");
        e.display();
    }
}

