import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of integers (n) from the user
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

    
        if (n < 2) {
            System.out.println("There must be at least 2 numbers to find the second largest.");
            return; 
        }

        
        int[] numbers = new int[n];

        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        for (int i = 0; i < n; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;  
                largest = numbers[i];     
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];  
            }
        }

    
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }

        
        scanner.close();
    }
}
