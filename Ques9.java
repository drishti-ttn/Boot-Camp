//Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
package CoreJava;

enum House {
    BHK1(20), BHK2(30), BHK3(50);
    private int price;

    House(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }

    public static void main(String args[]) {
        System.out.println("All house prices:");
        for (House h : House.values())
            System.out.println("costs of " + h + " is: " + h.getPrice() + " thousand.");
    }
}
