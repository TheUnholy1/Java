import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose Computation:\n1.Area of Circle\n2.Area of Square\n3.Basic Operator\nEnter Your Choice: ");
        int choose = scanner.nextInt();

        switch (choose){
        

            case 1: 

            System.out.println("Area of Circle");
            System.out.print("Enter the Radius: ");
            mathOperations.setNum3(scanner.nextDouble());
            mathOperations.c_area();
            System.out.println("The Area of Circle is: "+ mathOperations.getResults());
            break;

            case 2: System.out.println("Area of Square");
            System.out.print("Enter the Side: ");
            mathOperations.setNum4(scanner.nextDouble());
            mathOperations.s_area();
            System.out.println("The Area of Square is: "+ mathOperations.getResults());
            break;

            case 3:
            System.out.println("Basic Operator");
            System.out.print("Enter first number: ");
            mathOperations.setNum1(scanner.nextInt());

            System.out.print("Enter second number: ");
            mathOperations.setNum2(scanner.nextInt());

            System.out.println("What do you want to do with these numbers?");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                mathOperations.add();
                System.out.println("The result is: " + mathOperations.getResult());
            } else if (choice == 2) {
                mathOperations.subtract();
                System.out.println("The result is: " + mathOperations.getResult());
            } else if (choice == 3) {
                mathOperations.multiply();
                System.out.println("The result is: " + mathOperations.getResult());
            } else if (choice == 4) {
                mathOperations.divide();
                System.out.println("The result is: " + mathOperations.getResult());
            } else {
                System.out.println("Invalid choice.");
            }
            break;

            default:System.out.println("Invalid!");
            break;
        }

        
    }
}
