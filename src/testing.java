import java.io.ObjectInputStream.GetField;

import pkg.pkg1.pkg2.Integer;;

public class testing {
    public static void main(String[] args) {
        // int n1, n2;
        // n1 = 5;
        // n2 = 5;
        // System.out.println(Math.max(n1, n2));
        // int[] arr = new int[7];
        // for (int i = 0; i < 7; i++) {
        // arr[i] = i;
        // System.out.println(arr[i]);
        // }
        // testing obj = new testing();
        // int[] new_arr = obj.delete(arr, 5);
        // for (int i = 0; i < new_arr.length; i++) {
        // System.out.println(new_arr[i]);
        // }

        Integer number = new Integer();
        number.initializeInteger(5);
        System.out.println(number); // address in memory
        // System.out.println(number.getClass()); // class
        System.out.println(number.getValue()); // value of number obj
    }

    // int[] delete(int[] arr, int index) {
    // int[] new_array = new int[arr.length - 1];
    // for (int i = 0; i < index; i++) {
    // new_array[i] = arr[i];
    // }
    // for (int i = index + 1; i < arr.length; i++) {
    // new_array[i - 1] = arr[i];
    // }
    // return new_array;
    // }
}
