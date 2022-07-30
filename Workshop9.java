import java.util.Scanner;
public class Workshop9 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("----------Workshop 9----------");

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

    
    }
}
