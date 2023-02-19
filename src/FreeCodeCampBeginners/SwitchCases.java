package FreeCodeCampBeginners;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number");
        double number2 = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("What operation do you want to perform?");
        String operation = scanner.nextLine();

        switch(operation){
            case "sum":
                System.out.printf("%f + %f = %f ",number1,number2,number1+number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f ",number1,number2,number1-number2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f ",number1,number2,number1*number2);
                break;
            case "div":
                if(number2==0){
                    System.out.println("Cannot perform division");
                }else {
                    System.out.printf("%f / %f = %f ", number1, number2, number1 / number2);
                }
                break;
            default :
                System.out.printf("%s is not a supported operation",operation);
        }
    }
}
