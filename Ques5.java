//Find common elements between two arrays.
package CoreJava;

public class Ques5 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 7, 8, 9};
        System.out.println("Array1");
        for (int a1 = 0; a1 < arr1.length; a1++)
            System.out.print(arr1[a1] + " ");
        System.out.println("\nArray2");
        for (int a2 = 0; a2 < arr2.length; a2++)
            System.out.print(arr2[a2] + " ");
        System.out.println("\nThe common elements between the arrays are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }

            }
        }
    }
}
