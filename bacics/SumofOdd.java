import java.util.*;

public class SumofOdd {

      public static int calculateOddSum(int n){
            int sum = 0;
            for (int i = 1; i<=n; i++) {
                  if(i%2!=0){
                        sum = sum + i;
                  }
            } 
            return sum;
            
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();

            System.out.println("Sum of Odd Numbers: " + calculateOddSum(n));

      }
}
