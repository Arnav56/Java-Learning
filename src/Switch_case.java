import java.util.Scanner;

public class Switch_case {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter week number and you will get name of the week!!: ");

        int day = input.nextInt();

        input.close();

        switch (day){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Try not to make fool, enter a correct no!");
        }

    }

}
