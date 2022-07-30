import java.util.Scanner;
public class InputOutput2 {
 public static void main(String[] args) {
     // input 2 numbers then swap the values while not creating third variable
    Scanner s =new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int first = s.nextInt();

    System.out.print("Enter Second Number: ");
    int second = s.nextInt();

    first = first - second;
    second = second + first;
    first = second - first;

    System.out.println("The first number is "+first);
    System.out.println("The second number is "+second);
    
    s.close();
 }    
}
