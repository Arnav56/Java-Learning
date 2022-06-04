import java.util.Scanner;

import pkg.pkg1.pkg2.Integer;

public class Array_PracticeSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Qusetion 1:-
        // int[] array = { 101, 102, 103, 104, 105 };
        // int k = 0;
        // for (int i : array) {
        // k = k + i;
        // }
        // System.out.println(k);

        // Question 2 :-
        // int[] array = { 101, 102, 103, 104, 105 };
        // System.out.print("Enter a integer: ");
        // int userInput = input.nextInt();
        // boolean element_found = false;
        // for (int i : array) {
        // if (userInput == i) {
        // System.out.println("Entered Number is in the list!!");
        // element_found = true;
        // break;
        // } else {
        // continue;
        // }
        // }
        // if (element_found != true) {
        // System.out.println("Entered Number is not in the list!!");
        // }

        // Question 3:-
        // System.out.print("Enter the number of subjects: ");
        // short subjects = input.nextShort();
        // float[] marks = new float[subjects];
        // float total_marks = 0;
        // for (int i = 0; i < subjects; i++) {
        // System.out.printf("\nEnter the marks of Subject %d: ", i + 1);
        // marks[i] = input.nextFloat();
        // total_marks += marks[i];
        // }
        // float average = total_marks / subjects;
        // System.out.printf("\nAverage Marks = %.2f", average);

        // Question 4:-
        // int[][] matrix1 = { { 56, 78, 89 },
        // { 95, 57, 35 } };
        // int[][] matrix2 = { { 87, 45, 12 },
        // { 62, 42, 19 } };

        // int[][] sum = { { 0, 0, 0 },
        // { 0, 0, 0 } };

        // for (int i = 0; i < matrix1.length; i++) {
        // for (int j = 0; j < matrix1[0].length; j++) {
        // sum[i][j] = matrix1[i][j] + matrix2[i][j];
        // System.out.print(sum[i][j] + " ");
        // }
        // System.out.println("");
        // }

        // Question 5:-
        // 1st method:
        // int[] arr = { 1, 2, 3, 1, 2, 3 };
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.println(arr[i]);
        // }

        // Other method
        // int[] num_array = { 23, 45, 63, 32, 98, 24, 69 };
        // int n = (int) (Math.floor(Double.valueOf(l / 2)));
        // int l = num_array.length;
        // int n = Math.floorDiv(l, 2);

        // int temp;
        // for (int i = 0; i < n; i++) {
        // temp = num_array[i];
        // num_array[i] = num_array[l - i - 1];
        // num_array[l - i - 1] = temp;
        // }
        // for (int j : num_array) {
        // System.out.print(j + " ");
        // }

        // Question 6,7:

        // min, max in array:

        // int n, max = 0;
        // System.out.print("Enter the number of elements: ");
        // n = input.nextInt();
        // if (n == 0) {
        // System.out.println("\n\nTHERE CAN'T BE 0 ELEMENTS IN ARRAY!! Exiting the
        // program... \n");
        // System.exit(0);
        // }

        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // System.out.print("\nEnter element " + (i + 1) + ": ");
        // arr[i] = input.nextInt();
        // }
        // max = arr[0];
        // for (int i = 1; i < n; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }

        // System.out.println("The maximum number in the array is: " + max);

        // Question 8

        int n, max, min;
        boolean ascending = true, descending = true;
        System.out.print("Enter the number of elements: ");
        n = input.nextInt();
        if (n == 0) {
            System.out.println("\n\nTHERE CAN'T BE 0 ELEMENTS IN ARRAY!! Exiting the program... \n");
            System.exit(0);
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                descending = false;
                break;
            }
        }
        if (descending == false) {
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    ascending = false;
                    break;
                }
            }
        }

        if (descending == true || ascending == true) {
            System.out.println("\n\n\nArray is Sorted!");
        } else {
            System.out.println("\n\n\nArray is NOT Sorted!!");
        }

        input.close();
    }

    // static int Compare(int n1, int n2) {
    // if (n1 > n2) {
    // return n1;
    // } else if (n2 > n1) {
    // return n2;
    // } else {
    // return n1;
    // }
    // }

    static int[] delete(int[] arr, int index) {
        int[] new_array = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            new_array[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            new_array[i - 1] = arr[i];
        }
        return new_array;
    }
}
