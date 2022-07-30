import java.util.Scanner;
public class InputOutput {
    //Enter 2 numbers then swap the values
    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum=s.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNum=s.nextInt();

        int temp = firstNum;
        firstNum=secondNum;
        secondNum=temp;
        
        System.out.print('\n');
        System.out.println("Value of First Number: "+firstNum);
        System.out.println("Value of Second Number: "+secondNum);

        s.close();
    }
}
