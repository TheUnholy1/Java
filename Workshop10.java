import java.util.Scanner;
public class Workshop10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String letter;
        System.out.println("----------Workshop 10----------");
        System.out.print("Please Choose the Program to Display ( 1 or 2) : ");
                int num = s.nextInt();
                if (num == 1) {
                    do {
                        System.out.print("\n");
                        System.out.print("Enter A Character: ");

                        char let = s.next().charAt(0);

                        String consonantOrvowel = (let == 'a' || let == 'e' ||
                                let == 'i' || let == 'o' || let == 'u' || let == 'A' ||
                                let == 'E' || let == 'I' || let == 'O' || let == 'U')
                                ? "Vowel" : "Consonant";

                        s.nextLine();
                        System.out.print("Enter A Number: ");

                        int input = s.nextInt();

                        String evenOrodd = (input % 2 == 0) ? "Even" : "Odd";
                        System.out.print("\n");
                        System.out.println("Character  is " + consonantOrvowel);
                        System.out.print("\n");
                        System.out.println("Number is " + evenOrodd);
                        System.out.print("\n");

                        System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                        letter = s.next();
                    }
                    while (letter.equalsIgnoreCase("Yes"));
                    System.out.println("----------Thank you----------");
                } else {
                    do {
                        System.out.print("\n");
                        System.out.print("Please Enter the First Number: ");
                        int num1 = s.nextInt();

                        System.out.print("\n");
                        System.out.print("Please Enter the Second Number: ");
                        int num2 = s.nextInt();

                        System.out.print("\n");
                        int total = num1 + num2;
                        System.out.println("The sum is " + total);
                        System.out.print("\n");

                        System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                        letter = s.next();
                    }
                    while (letter.equalsIgnoreCase("Yes"));
                    System.out.println("----------Thank you----------");

                    
    }
}
}
