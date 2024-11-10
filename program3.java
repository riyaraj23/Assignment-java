import java.util.Scanner;

public class program3 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                // Display the menu to the user
                System.out.println("Menu:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                
                int choice = scanner.nextInt(); // Read user's choice
    
                if (choice == 5) {
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }
    
                // Declare variables to store the operands
                double num1, num2, result;
    
                // Ask for input based on the selected operation
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
    
                // Perform the chosen operation using if-else statements
                if (choice == 1) {
                    result = num1 + num2;
                    System.out.println("The result of addition is: " + result);
                } 
                else if (choice == 2) {
                    result = num1 - num2;
                    System.out.println("The result of subtraction is: " + result);
                } 
                else if (choice == 3) {
                    result = num1 * num2;
                    System.out.println("The result of multiplication is: " + result);
                } 
                else if (choice == 4) {
                    // Check for division by zero
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        System.out.println("The result of division is: " + result);
                    }
                } 
                else {
                    System.out.println("Invalid choice. Please select a valid option.");
                }
            }
    
            // Close the scanner resource
            scanner.close();
        }
    
    
}
