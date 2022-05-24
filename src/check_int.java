import java.util.Scanner;

public class check_int {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a no: ");

        boolean n = input.hasNextInt();

        System.out.println(n);
        
        // System.out.println(input.hasNextInt()); this if you are taking only 1 output from obfect that is "input" here

        input.close();
    
    }
    
}
