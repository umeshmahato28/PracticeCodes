import java.util.Scanner;

public class Multiply {

      public static int calculateMultiply (int a, int b){
           return  a * b;
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter values: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = calculateMultiply(a, b);
            System.out.println("Result: "+ result);

            sc.close();
      }
}
