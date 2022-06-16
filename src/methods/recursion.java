package methods;

public class recursion {
    public static void main(String[] args) {
        int f = factorial(5);
        System.out.println(f);

        int g = factorial_iterative(6);
        System.out.println(g);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        int product = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = n; i > 0; i--) {
                product *= i;
            }
        }
        return product;
    }
}

// input 5
/*
 * => 5 * factorial(4)
 * => 5 * 4 * factorial(3)
 * => 5 * 4 * 3 * factorial(2)
 * => 5 * 4 * 3 * 2 * factorial(1)
 */
