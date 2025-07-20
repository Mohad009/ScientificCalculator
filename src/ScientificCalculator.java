import java.util.Scanner;
import java.util.InputMismatchException;
public class ScientificCalculator {
    public static void main (String [] args){
        Scanner userInput=new Scanner(System.in);
        boolean coniditon=true;
        while(coniditon){
    displayMenu();

            int ch=userInput.nextInt();
            switch (ch){
                case 1:
                    try{
                        System.out.print("Enter first number: ");
                        double n1=userInput.nextInt();
                        System.out.print("Enter second number: ");
                        double n2=userInput.nextInt();
                    System.out.println(n1 +" + "+ n2 + "= "+add(n1,n2));
                    }catch (InputMismatchException e) {
                        System.out.println("Error: Only number are allowed!");
                    }
                    break;
                case 2:
                    try{
                        System.out.print("Enter first number: ");
                        double n1=userInput.nextInt();
                        System.out.print("Enter second number: ");
                        double n2=userInput.nextInt();
                        System.out.println(n1 +" - "+ n2 + "= "+subtract(n1,n2));
                    }catch (InputMismatchException e) {
                        System.out.println("Error: Only number are allowed!");
                    }
                    break;
                case 3:
                    try{
                        System.out.print("Enter first number: ");
                        double n1=userInput.nextInt();
                        System.out.print("Enter second number: ");
                        double n2=userInput.nextInt();
                        System.out.println(n1 +" x "+ n2 + "= "+multiply(n1,n2));
                    }catch (InputMismatchException e) {
                        System.out.println("Error: Only number are allowed!");
                    }
                    break;
                case 4:
                    try{
                        System.out.print("Enter first number: ");
                        double n1=userInput.nextInt();
                        System.out.print("Enter second number: ");
                        double n2=userInput.nextInt();
                        System.out.println(n1 +" / "+ n2 + "= "+divide(n1,n2));
                    }catch (InputMismatchException e) {
                        System.out.println("Error: Only number are allowed!");
                    }
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
        System.out.println("===============================================");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Exit");
        System.out.println("===============================================\n");
        System.out.print("Please enter your choice: ");
    }
    //addition
    public static double add(double num1,double num2){ return num1+num2;}

    //subtraction
     public static double subtract(double num1,double num2) {return num1 -num2;}
    //muliplication
     public static double multiply(double num1,double num2) {return num1 * num2; }
    //division
     public static double divide(double num1,double num2) { return  num1/num2; }
    //square root
     public static double calculateSquareRoot(double number) { return Math.sqrt(number);}
    //power
     public static double calculatePower(double num1,double num2) {return Math.pow(num1,num2); }
    // sine
     public static double calculateSine(double degrees) { return Math.sin(degrees); }
    //cosine
    public static double calculateCosine(double degrees){return Math.cos(degrees);}
    //tangent
    public static double calculateTangent(double degrees){return Math.tan(degrees);}
    //log
    public static double calculateNaturalLogarithm(double num) {return Math.log(num);}
    // log10
    public static double calculateLogarithmBase10(double num) {return Math.log10(num);}
    //absolute
    public static double absoluteValue(double num) {return Math.abs(num);}
    // round
    public static long roundNumber(double num) {return Math.round(num);}
    // ceiling
    public static double ceilingNumber(double num) {return Math.ceil(num);}
    //floor
    public static double floorNumber(double num) {
        return Math.floor(num);
    }

    public static double findMin(double num1, double num2) {
        return Math.min(num1, num2);
    }

    public static double findMax(double num1, double num2) {
        return Math.max(num1, num2);
    }
}
