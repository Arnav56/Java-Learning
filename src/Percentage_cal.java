import java.util.Scanner;

public class Percentage_cal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Total marks of each subject eg(40,50,80,100 etc.) : ");

        Float t1 = input.nextFloat();

        System.out.print("Enter marks of first subject: ");

        Float mark1 = input.nextFloat();

        System.out.print("Enter marks of second subject: ");

        Float mark2 = input.nextFloat();

        System.out.print("Enter marks of third subject: ");

        Float mark3 = input.nextFloat();

        System.out.print("Enter marks of fourth subject: ");

        Float mark4 = input.nextFloat();

        System.out.print("Enter marks of fifth subject: ");

        Float mark5 = input.nextFloat();

        Float t2 = mark1 + mark2 + mark3 + mark4 + mark5; 

        System.out.printf("Your %s marks are %.2f out of %.2f", "Total", t2, t1*5);
        
        Float percentage = (t2/(t1*5))*100;

        System.out.println("Your final percentage is: " + percentage + "%");

        System.out.println("Now fuck of, Bitchh...");

        input.close();

    }
}