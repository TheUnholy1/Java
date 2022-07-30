import java.util.Scanner;
public class Workshop2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("----------Workshop 2----------");
        System.out.print("Enter your full name: ");
        String Name = s.nextLine();


        System.out.print("Enter your course: ");
        String Course = s.nextLine();

        System.out.print("Enter your Gender: ");
        String Gender = s.nextLine();

        System.out.print("Enter your Civil Status: ");
        String Status = s.nextLine();

        System.out.print("Enter your Citizenship: ");
        String Citizen = s.nextLine();

        System.out.print("Enter your Weight: ");
        int Weight = s.nextInt();


        System.out.print("Enter your Height: ");
        int Height = s.nextInt();


        System.out.print("Enter your Contact Number: ");
        long Number = s.nextLong();

        System.out.print("\n");
        System.out.println("Name: " + Name);
        System.out.println("Course: " + Course);
        System.out.println("Gender: " + Gender);
        System.out.println("Civil Status: " + Status);
        System.out.println("Citizenship: " + Citizen);
        System.out.println("Weight: " + Weight + "kg");
        System.out.println("Height: " + Height + "cm");
        System.out.println("Contact Number: " + Number);
        
    }
}
