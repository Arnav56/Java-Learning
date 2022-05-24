import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Taking input from the user");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name here:");

        String name = input.nextLine();

        System.out.print("Enter first number:");

        Double N1 = input.nextDouble();

        System.out.print("Enter Second number:");

        Double N2 = input.nextDouble();

        Double sum = N1 + N2;

        System.out.println("The sum of entered two numbers is :" + sum);

        System.out.print(name);

        input.close();
        
        System.out.println(" Fuck off!!., Now");
        
    }
}
