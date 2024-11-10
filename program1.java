import java.util.*;
public class program1 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=sc.nextInt();
      int fact=1;
      for(int i=1;i<=n;i++){
        fact*=i;
      }
      System.out.println("The factorial of " + n + " is: " + fact);
      int sum = 0;
        while (fact > 0) {
            sum += fact % 10;  
            fact /= 10;        
        }
        System.out.println("The sum of the digits of " + fact + " is: " + sum);
    }

}
