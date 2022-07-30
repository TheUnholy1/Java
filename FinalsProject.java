import java.util.Scanner;
public class FinalsProject {
    public static void main(String[] args) {
        String letter;
        
        do{
            Scanner s = new Scanner(System.in);
            System.out.print("Please Enter Your Name: ");
            String name = s.nextLine();
            System.out.println("Welcome " + name +"!");
            do{
            System.out.println("PRELIM ( Input P for Prelim)");
            System.out.println("MIDTERM ( Input M for Midterm)");
            System.out.println("FINALS (Input F for Finals)");
            System.out.print("Choose a Term that You Want to be Displayed:");
            char term = s.next().charAt(0);

            if (term == 'p' || term == 'P'){do{
            System.out.println("Workshop1\nWorkshop2\nWorkshop3\nWorkshop4");
            System.out.print("Choose Program to Display (1 -4):");
            int prelim = s.nextInt();
                if (prelim == 1){
                Workshop1.main(args);
                }
                else if (prelim == 2){
                Workshop2.main(args);
                }
                else if(prelim == 3){
                Workshop3.main(args);
                }
                else if(prelim == 4){
                Workshop4.main(args);
                }
                else{
                System.out.println("Please Enter 1 to 4 Only!");
                } 
                  
            System.out.print("Do you want to Perform the Prelim Operation Again? Yes or No: ");
            letter = s.next();
            
            }while (letter.equalsIgnoreCase("Yes"));
            
            }
            else if (term == 'm' || term == 'M')do{
            System.out.println("Workshop5\nWorkshop6\nWorkshop7\nWorkshop8");
            System.out.print("Choose a Program to Display (5-8):");
            int midterm = s.nextInt();
            if (midterm == 5){
                Workshop5.main(args);
            }
            else if (midterm == 6){
                Workshop6.main(args);
            }
            else if (midterm == 7){
                Workshop7.main(args);
            }
            else if (midterm == 8) {
                Workshop8.main(args);
            }
            else{
                System.out.println("Please Enter 5 to 8 Only!");
            }
            System.out.print("Do you want to Perform the Midterm Operation Again? Yes or No:");
            letter = s.next();
            
            }while(letter.equalsIgnoreCase("Yes"));
            
                                                   
            else if (term == 'f' || term == 'F'){
                do{
                    System.out.println("Workshop9\nWorkshop10");
                    System.out.print("Choose a Program to Display (9 or 10):");
                    int finals = s.nextInt();

                    if (finals == 9){
                        Workshop9.main(args);
                    }
                    else if (finals == 10){
                        Workshop10.main(args);
                    }
                    else{
                        System.out.println("Pls Enter 9 or 10 Only!");
                    }
                    System.out.print("Do you want to Perform the Finals Operation Again? Yes or No:");
                    letter = s.next();
                }while (letter.equalsIgnoreCase("Yes"));
            }
            else
            System.out.println("Invalid Input Please Enter P , M , or F Only!");
            System.out.print("1. Choose a term you want the activities to be displayed:\nPrelim(Input P)\nMidterm(Input M)\nFinal(Input F)\n");
            System.out.println("2. Press x to go back to main menu:");
            letter = s.next();
            }while(letter.equalsIgnoreCase("1"));
            
        }while(1<5);
    }
}
