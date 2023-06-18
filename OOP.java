import java.util.Scanner;

class Staff {
    private String name;
    private String surname;
    private double salary;

    public Staff(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Salary: " + salary + "\n";
    }
}

public class OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Assuming to store up to 10 staff members
        Staff[] staffList = new Staff[10];

        // Number of staff members entered
        int count = 0;

        while (true) {
            System.out.println("Enter your name (enter 0 to exit):");
            String name = sc.nextLine();

            if (name.equals("0")) {
                // Exit the loop if "0" is entered
                break;
            }

            System.out.println("Enter your surname:");
            String surname = sc.nextLine();

            System.out.println("Enter your salary:");
            // turn string to double
            double salary = Double.parseDouble(sc.nextLine());

            Staff staff = new Staff(name, surname, salary);
            staffList[count] = staff;
            count++;
        }

        // Print the staff members
        for (int i = 0; i < count; i++) {
            System.out.println(staffList[i].toString());
        }
    }
}
