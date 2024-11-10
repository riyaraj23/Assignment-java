import java.util.Scanner;

public class program2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < 10; i++) {
            int num = numbers[i];

        
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false; 
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false; 
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }

        scanner.close();
    }


}
