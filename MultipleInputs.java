import java.util.Scanner;
public class MultipleInputs {
    public static void main(String[] args) {
        

        Scanner s =new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.print("Enter your age: ");
        int age = s.nextInt();

        s.nextLine();

        System.out.print("Enter your gender: ");
        String gender = s.nextLine();

        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your gender is "+gender);

        s.close();

    }
}
