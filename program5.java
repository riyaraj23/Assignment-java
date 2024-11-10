import java.util.*;
public class program5 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an integer:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Invalid number");
        }
       int firstTerm = 0; 
       int secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
        
    }
}
}