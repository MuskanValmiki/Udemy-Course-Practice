import java.util.Scanner;

public class Quiz5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            // Ask user for two numbers
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            // Ask user for the operation
            System.out.print("Choose operation (+, -, *, /): ");
            String operation = input.next();

            // Perform operation
            if (operation.equals("+")) {
                System.out.println("Result: " + (num1 + num2));
            } else if (operation.equals("-")) {
                System.out.println("Result: " + (num1 - num2));
            } else if (operation.equals("*")) {
                System.out.println("Result: " + (num1 * num2));
            } else if (operation.equals("/")) {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            } else {
                System.out.println("Invalid operation.");
            }

            // Ask if user wants to calculate again
            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.next();
        }

        // Exit message
        System.out.println("Thank you for using the calculator.");
        input.close();
    }
}
