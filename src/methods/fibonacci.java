package methods;

public class fibonacci {
    public static void main(String[] args) {
        int[] fibo_series = fibo(15);
        for (int i = 0; i < fibo_series.length; i++) {
            System.out.print(fibo_series[i] + " ");
        }
    }

    static int[] fibo(int n) {
        int[] series = new int[n];

        // Iteration
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                series[i] = i;
            } else {
                series[i] = series[i - 1] + series[i - 2];
            }
        }

        return series;
    }

    // static int[] fibo_recursion(int n) {
    // Recursion
    // for (int i = 0; i < n; i++) {
    // if (i <= 1) {
    // series[i] = i;
    // } else {
    // series[i] = series[i - 1] + series[i - 2];
    // }
    // }

    // return fibo_recursion(series[i - 1] + series[i - 2]);
    // }
}
