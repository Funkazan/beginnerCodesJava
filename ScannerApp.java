package order;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		
		int stock = 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1 to start and 0 to quit!");
		String input = sc.nextLine();
		
		try {
			while(!input.equals("0")) {
				System.out.println("Please enter the quantity of your order oder enter 0 two times to quit.");
				int order = sc.nextInt();
				System.out.println("Has the payment been received? true = YES / false = NO");
				boolean payment = sc.nextBoolean();
				
				//not enough in stock but paid
				if(order > 0 && order > stock && payment) {
					System.out.println("We will send your order immerdiately after refilling our stocks!");
				//not enough in stock and not paid
				} else if(order > 0 && order > stock && !payment) {
					System.out.println("We will send your order immerdiately after refilling our stocks and confirming your payment!");
				//enough in stock but not paid
				} else if(order > 0 && order < stock && !payment) {
					System.out.println("Your order will be sent immediately after confirmation of your payment!");
				// enough in stock and paid
				} else {
					System.out.println("Your order will be sent immediately!");
					
				}
			}
		} catch(InputMismatchException e) {
			System.out.println("invalid input!");
		}
		System.out.println("Thank you for your visit. Please come again.");
		sc.close();
	}
}
