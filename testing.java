import java.util.Scanner;
public class testing {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner s= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Your name is "+name);
    }
}
