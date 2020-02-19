//There is an array with every element repeated twice except one. Find that element.
package CoreJava;

public class Ques6 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,1,2,3};
        //int count = 1;
        System.out.println("Array elements are:");
        for (int arr = 0; arr < arr1.length; arr++) {
            System.out.print(arr1[arr] + " ");
        }
        int result=arr1[0];
        for (int i=1;i<arr1.length;i++){
            result=result^arr1[i];
        }
        System.out.println("\nUnique element is:"+result);
     }
}
