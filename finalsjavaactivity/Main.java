import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose Computation:\n1.Area of Circle\n2.Area of Square\n3.Basic Operator\nEnter Your Choice: ");
        int choose = sc.nextInt();

        switch (choose){

            case 1:
            System.out.println("Area of Circle");
            System.out.print("Enter the Radius: ");
            double r1 = sc.nextDouble();
            
            double pi = 3.14;

            MathOperations circle = new MathOperations();

            System.out.println("The result is: "+circle.area_circle(r1, pi) );
            break;

            case 2:
            System.out.println("Area of Square");
            System.out.print("Enter the Side of Square: ");
            double s1 = sc.nextDouble();

            MathOperations square = new MathOperations();
            System.out.println("The result is: "+square.area_square(s1));

            break;

            case 3:
            System.out.println("Basic Operator");
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter an operation: ");
            int operation = sc.nextInt();

            MathOperations ops = new MathOperations();

            switch (operation) {
                case 1:
                    System.out.println("The result is: " + ops.add(num1, num2));
                    break;
                case 2:
                    System.out.println("The result is: " + ops.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("The result is: " + ops.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("The result is: " + ops.divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
            break;

            default:
            System.out.println("Invalid!!");
            break;
            

        }

        
    }
}
