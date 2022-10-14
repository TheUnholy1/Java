import java.util.Scanner;
public class Trueeeeee {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) (System.currentTimeMillis() /7 % 10);

        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer));
    }
}
