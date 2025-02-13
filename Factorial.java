import java.util.*;

public class Factorial {
      public static int displayFactorial(int n){
            int fact =1;
            for (int i = n; i>=1; i--) {
                  fact = fact*i;
            }

            return fact;
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter a number: ");
            int n = sc.nextInt();

            System.out.println("Factorial: " + displayFactorial(n));
            sc.close();
      }
}
