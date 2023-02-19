package FreeCodeCampBeginners;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ? ");
        String name = scanner.nextLine();
        System.out.println("Hii "+name);


        System.out.printf("How are you %s.",name);

        /*If we use another nextLine method after nextInt method then
        nextint takes only number as an input and leaves the new line character in the buffer so
        when the second nextLine comes it assumes user has already given the method so always put an extra
        scanner input method. */








    }

}
