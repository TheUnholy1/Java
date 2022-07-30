import java.util.Scanner;
public class Workshop7 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("----------Workshop 7----------");

    System.out.println("********Area of Square********"); //8stars
    System.out.print("\n");
    System.out.print("Please Enter the Side of Square: ");
    double square = s.nextDouble();
    double area_Square = square * square;
    System.out.println("The Area of Square is: " + area_Square);

    System.out.print("\n");
    System.out.println("********Area of Triangle********");
    System.out.print("\n");
    System.out.print("Please Enter the Width of the Triangle: ");
    double width_T = s.nextDouble();
    System.out.print("Please Enter the Height of the Triangle: ");
    double height_t = s.nextDouble();
    double triangle = (width_T * height_t) / 2;
    System.out.println("The Area of Triangle is: " + triangle);

    System.out.print("\n");
    System.out.println("********Area of Rectangle********");
    System.out.print("\n");
    System.out.print("Please Enter the length of Rectangle: ");
    double length_rec = s.nextDouble();
    System.out.print("Please Enter the width of Rectangle: ");
    double width_rec = s.nextDouble();
    double area_rec = width_rec * length_rec;
    System.out.println("Area of Rectangle is: " + area_rec);

    
    }
}
