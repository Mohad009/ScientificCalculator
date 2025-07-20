import java.util.Scanner;

public class InputExample
{
    public static void main(String []args){

    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter your Name: ");
    String name=scanner.nextLine();
    System.out.print("Enter your Age: ");
    String age=scanner.nextLine();
    System.out.print("Enter your height in meters: ");
    Double height=scanner.nextDouble();

    System.out.println("Name :"+ name);
    System.out.println("Age :"+ age);
    System.out.println("height :"+ height);
    scanner.close();
}
}



