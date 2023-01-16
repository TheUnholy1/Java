import java.util.Scanner;

public class Basic_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter another number: ");
        double num2 = sc.nextDouble();

        Addition add = new Addition(num1, num2);
        Subtraction sub = new Subtraction(num1, num2);
        Multiplication mul = new Multiplication(num1, num2);
        Division div = new Division(num1, num2);

        System.out.println("The sum is: " + add.computeResult());
        System.out.println("The difference is: " + sub.computeResult());
        System.out.println("The product is: " + mul.computeResult());
        System.out.println("The quotient is: " + div.computeResult());
    }
}

class Addition {
    private double num1;
    private double num2;

    public Addition(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double computeResult() {
        return num1 + num2;
    }
}

class Subtraction {
    private double num1;
    private double num2;

    public Subtraction(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double computeResult() {
        return num1 - num2;
    }
}

class Multiplication {
    private double num1;
    private double num2;

    public Multiplication(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double computeResult() {
        return num1 * num2;
    }
}

class Division {
    private double num1;
    private double num2;

    public Division(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double computeResult() {
        return num1 / num2;
    }
}