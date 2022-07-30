import java.util.Scanner;
public class Workshop3 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("----------Workshop 3----------");
    System.out.print("Please Enter the First Number: ");
    int first_Num = s.nextInt();

    System.out.print("Please Enter the Second Number: ");
    int second_Num = s.nextInt();

    int temporary = first_Num;
    first_Num = second_Num;
    second_Num = temporary;
    System.out.print("\n");

    System.out.println("The Value of First Number is: " + first_Num);
    System.out.println("The Value of Second Number is: " + second_Num);
       
    }
}
