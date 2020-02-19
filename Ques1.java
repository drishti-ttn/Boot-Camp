/*
Create Java classes having suitable attributes for Library management system.
 Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
*/
interface permission {
    public void add();

    public void edit();

    public void delete();
}

abstract class operation implements permission {
    public abstract void display();

    public abstract void search();
}

class Librarian extends operation {
    public void add() {
    }

    public void edit() {
    }

    public void delete() {
    }

    public void display() {
        System.out.println("Displaying customer details");
    }

    public void search() {
        System.out.println("Searching customer");
    }
}

class Book extends operation {
    public void add() {
    }

    public void edit() {
    }

    public void delete() {
    }

    public void display() {
        System.out.println("Displaying book details");
    }

    public void search() {
        System.out.println("Searching book");
    }
}

public class Ques1 {
    public static void main(String[] args) {

    }
}
