//Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    Double score;
    Double age;

    public Student(String n, Double s, Double a) {
        name = n;
        score = s;
        age = a;
    }

    public Double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name is: " + name + " score is: " + score + " age is: " + age;

    }

}

public class Ques6 {
    public static void main(String[] args) {

        List<Student> s = new ArrayList<>();
        s.add(new Student("Shreya", 96.0, 24.0));
        s.add(new Student("Drishti", 96.0, 25.0));
        s.add(new Student("Nisha", 97.0, 24.0));
        s.add(new Student("Akshita", 94.0, 22.0));
        s.add(new Student("Neha", 93.0, 21.0));


        Collections.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() > o2.getScore()) {
                    return 1;
                } else if (o1.getScore() < o2.getScore()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("Sorting on the basis of score...");
        for (Student student : s) {
            System.out.println(student);
        }
        Collections.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() > o2.getScore()) {
                    return 1;
                } else if (o1.getScore() < o2.getScore()) {
                    return -1;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("\nSorting on the basis of name when score is same... ");
        for (Student student : s) {
            System.out.println(student);
        }
    }
}