import java.util.Scanner;
public class program10 {
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        
        System.out.println("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);
        
        
        int count = 0;
        
    
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                count++;
            }
        }
        
        
        System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");
        
        scanner.close();
    }
}


