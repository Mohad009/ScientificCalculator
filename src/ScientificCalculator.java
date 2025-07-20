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
                    performAddition(userInput);
                    break;
                case 2:
                    performSubtraction(userInput);
                    break;
                case 3:
                    performMultiplication(userInput);
                    break;
                case 4:
                    performDivision(userInput);
                    break;
                case 5:
                    performSquareRoot(userInput);
                    break;
                case 6:  // Power
                    performPower(userInput);
                    break;

                case 7:  // Sine
                    performSine(userInput);
                    break;

                case 8:  // Cosine
                    performCosine(userInput);
                    break;

                case 9:  // Tangent
                    performTangent(userInput);
                    break;

                case 10: // Natural Logarithm
                    break;

                case 11: // Logarithm Base 10
                    break;

                case 12: // Absolute Value
                    break;

                case 13: // Round Number
                    break;

                case 14: // Ceiling Number
                    break;

                case 15: // Floor Number
                    break;

                case 16: // Find Minimum
                    break;

                case 17: // Find Maximum
                    break;
                case 18:
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
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Natural Logarithm");
        System.out.println("11. Logarithm Base 10");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round Number");
        System.out.println("14. Ceiling Number");
        System.out.println("15. Floor Number");
        System.out.println("16. Find Minimum");
        System.out.println("17. Find Maximum");
        System.out.println("18. Exit");
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
    public static double floorNumber(double num) {return Math.floor(num);}
    //min
    public static double findMin(double num1, double num2) {return Math.min(num1, num2);}
    //max
    public static double findMax(double num1, double num2) {return Math.max(num1, num2);}

    //operating methods
    private static void performAddition(Scanner scanner) {
        try{
            System.out.print("Enter first number: ");
            double n1=scanner.nextDouble();
            System.out.print("Enter second number: ");
            double n2=scanner.nextDouble();
            System.out.println(n1 +" + "+ n2 + "= "+add(n1,n2));
        }catch (InputMismatchException e) {
            System.out.println("Error: Only number are allowed!");
        }
    }

    private static void performSubtraction(Scanner scanner) {
        try{
            System.out.print("Enter first number: ");
            double n1=scanner.nextDouble();
            System.out.print("Enter second number: ");
            double n2=scanner.nextDouble();
            System.out.println(n1 +" - "+ n2 + "= "+subtract(n1,n2));
        }catch (InputMismatchException e) {
            System.out.println("Error: Only number are allowed!");
        }
    }

    private static void performMultiplication(Scanner scanner) {
        try{
            System.out.print("Enter first number: ");
            double n1=scanner.nextDouble();
            System.out.print("Enter second number: ");
            double n2=scanner.nextDouble();
            System.out.println(n1 +" x "+ n2 + "= "+multiply(n1,n2));
        }catch (InputMismatchException e) {
            System.out.println("Error: Only number are allowed!");
        }
    }

    private static void performDivision(Scanner scanner) {
        try{
            System.out.print("Enter first number: ");
            double n1=scanner.nextDouble();
            System.out.print("Enter second number: ");
            double n2=scanner.nextDouble();
            System.out.println(n1 +" / "+ n2 + "= "+divide(n1,n2));
        }catch (InputMismatchException e) {
            System.out.println("Error: Only number are allowed!");
        }
    }
    private static void performSquareRoot(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("√" + num + " = " + calculateSquareRoot(num));
        } catch (InputMismatchException e) {
            System.out.println("Error: Only numbers are allowed!");
        }
    }


    private static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter base number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter exponent: ");
            double num2 = scanner.nextDouble();
            System.out.println(num1 + "^" + num2 + " = " + calculatePower(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Error: Only numbers are allowed!");
        }
    }

    private static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            System.out.println("sin(" + degrees + "°) = " + calculateSine(degrees));
        } catch (InputMismatchException e) {
            System.out.println("Error: Only numbers are allowed!");
        }
    }

    private static void performCosine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            System.out.println("cos(" + degrees + "°) = " + calculateCosine(degrees));
        } catch (InputMismatchException e) {
            System.out.println("Error: Only numbers are allowed!");
        }
    }

    private static void performTangent(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            System.out.println("tan(" + degrees + "°) = " + calculateTangent(degrees));
        } catch (InputMismatchException e) {
            System.out.println("Error: Only numbers are allowed!");
        }
    }
}



