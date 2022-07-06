package methods;

// VarArgs in place of method overloading

public class varags {
    public static void main(String[] args) {
        // sum(); // This also works surprisingly but can be solved if put a condition
        // to must pass one arg!
        sum(1);
        sum(1, 2);
        sum(1, 2, 3);
        sum(1, 2, 3, 4);
        sum(1, 2, 3, 4, 5);
        sum(1, 2, 3, 4, 5, 6);
        sum(1, 2, 3, 4, 5, 6, 7);
    }

    static void sum(int x, int... arr) {
        // arr is available as int[] arr
        int sum = x;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
