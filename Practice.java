import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        System.out.println("You entered" +number);
        s.close();
    }
}
