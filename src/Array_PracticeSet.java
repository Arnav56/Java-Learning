import java.util.Scanner;

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
        int[] arr = { 1, 2, 3, 1, 2, 3 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        // int[] arr = { 5, 7, 2, 8, 4 };

        // for (int i = 0; i < (arr.length - 1) / 2; i++) {
        // // System.out.println(arr[i]);
        // Compare(arr[i], arr[i + 1]);
        // }

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
}
