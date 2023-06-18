import java.util.InputMismatchException;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // initialize scanner
        Scanner sc = new Scanner(System.in);
        // try-catch block is needen if the input is a string
        try {
            // beginning; i would like to skip this part
            System.out.println("Enter any number to start");
            int num = sc.nextInt();
            do {
                // main loop
                System.out.println("Enter a number or '0' to quit");
                num = sc.nextInt();
                System.out.println(num * num);
                // quit if 0
            } while (num != 0);
            System.out.println("See you again");
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
    }
}
