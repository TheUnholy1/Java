import java.util.Scanner;
public class Workshop8 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("----------Workshop 8----------");
    
    System.out.print("Enter the Number of Minutes: ");
    int minutes = s.nextInt();
    int year = minutes / 525600;
    int remainingMinutes = minutes % 525600;
    int day = remainingMinutes / 1440;
    System.out.println(minutes + " minutes is approximately " + year + " years & " + day + " days.");
    System.out.print("\n");
    
    
    }
}
