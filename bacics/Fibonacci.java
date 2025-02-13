import java.util.Scanner;

public class Fibonacci {
      public static int findFibonacci(int n){
            int a = 0;
            int b = 1;
            int s=0;
            System.out.print(a + " ");
            System.out.print(b+ " ");
            for (int i = 0; i <= n; i++) {
                  s = a+b;
                  a=b;
                  b=s;
                  System.out.print(s+ " ");
            }
            return 0;
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the nth Term: ");
            int n = sc.nextInt();
            findFibonacci(n);
            sc.close();   
      }
}
