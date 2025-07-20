import java.util.Scanner;
public class ScientificCalculator {
    public static void main (String [] args){
        Scanner userInput=new Scanner(System.in);
        boolean coniditon=true;
        while(coniditon){
    displayMenu();
            int num=userInput.nextInt();
            switch (num){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 5:
                    coniditon=false;
                    userInput.close();
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Enter a valid number");

            }

        }

    }
    // --- Menu Display Method ---
    public static void displayMenu() {
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Mulitply");
        System.out.println("4.Divide");
        System.out.println("5.Exit");
    }
    //addition
    public static double add(double num1,double num2){ return num1+num2;}

}
