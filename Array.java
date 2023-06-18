import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // initialize array and scanner
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me 5 numbers:");
        // array input as integer
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Double of each number:");
        // array output *2
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * 2);
        }
    }
}
