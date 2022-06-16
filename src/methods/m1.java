package methods;

public class m1 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = i;
        }
        change(n);

        // Array change? :: arrays are passed as reference when using java
        // array is always an object and since all objects are passed by reference
        // therefore array is passed by reference

        // method 1:
        // for (int i : arr) {
        // change(arr[i]);
        // }

        // method 2:
        change(arr);
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }

        // Strings
        String str = "Hello";
        change(str);
        System.out.println(str);
        // String is not passed by reference in Java!!
    }

    // In method overloading, return type of all methods which are being overloaded
    // must be same. i.e. static void change() and static int change() will give
    // error!

    static void change(int n) {
        System.out.println("\n" + n);
        n++;
        System.out.println("After changing: " + n);
    }

    static void change(int[] arr) {
        // System.out.println("\n" + n);
        // n++;
        int x = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("\n" + arr[i]);
            arr[i] = ++x;
            System.out.println("After changing: " + arr[i]);
        }
    }

    static void change(String str) {
        str = "Great";
    }

}
