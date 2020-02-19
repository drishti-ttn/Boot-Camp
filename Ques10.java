/*
Write a single program for following operation using overloading
	A) Adding 2 integer number
	B) Adding 2 double
	C) multiplying 2 float
	D) multiplying 2 int
	E) concate 2 string
	F) Concate 3 String
*/
package CoreJava;

public class Ques10 {

    public int addInt(int a, int b) {
        return a + b;
    }

    public int addInt(int a, int b, int c) {
        return a + b + c;
    }

    public double add_double(double a, double b, double c) {
        return a + b + c;
    }

    public float mul_float(float a, float b) {
        return a * b;
    }

    public int mul_int(int a, int b) {
        return a * b;
    }

    public String concat(String a, String b) {
        return (a + b);
    }

    public String concat(String a, String b, String c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        Ques10 q = new Ques10();
        System.out.println("Adding 2 integer number: ");
        System.out.println(q.addInt(10, 20));
        System.out.println("Adding 3 integer number: ");
        System.out.println(q.addInt(10, 20, 30));
        System.out.println("Adding 2 double: ");
        System.out.println(q.add_double(10.00, 20.00, 22.22));
        System.out.println("multiplying 2 float: ");
        System.out.println(q.mul_float(10.0f, 20.0f));
        System.out.println("multiplying 2 int: ");
        System.out.println(q.mul_int(10, 10));
        System.out.println("concate 2 string: ");
        System.out.println(q.concat("Hello ", "World"));
        System.out.println("Concate 3 String: ");
        System.out.println(q.concat("Hello ", "Drishti ", "Talwar"));
    }
}

