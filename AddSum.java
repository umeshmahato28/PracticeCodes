import java.util.*;

public class AddSum {

      public static int printSum(int a, int b){
            int sum = a+b;
            return sum;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();

            int sum= printSum(a, b);
            System.out.println("Sum of a and b = "+sum );
            sc.close();
      }
}
