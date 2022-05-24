import java.util.Scanner;

public class else_if {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = input.nextInt();

        if (age>=18) {
            System.out.println("Great, You can Drive!!");
        } 
        
        else if(age == 17){
            System.out.println("You Can start learnig car for your test!!");
        }

        else{
            System.out.println("No you can't Drive!!");
        }

        input.close();
        
    }

}
