import java.util.*;
 
public class Calculater{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose options : 1-ADD 2-SUB 3-MUL 4-DIVIDE");
            int opt = sc.nextInt();
            System.out.println("Enter first number : ");
            int a = sc.nextInt();
            System.out.println("Enter second number : ");
            int b = sc.nextInt();
            int result;
            switch (opt) {
                  case 1:
                        result = a+b;
                        System.out.println("Result = "+ result);
                        break;
                  case 2:
                        result = a-b;
                        System.out.println("Result = "+ result);
                        break;
                  case 3:
                        result = a*b;
                        System.out.println("Result = "+ result);
                        break;
                  case 4:
                        result = a/b;
                        System.out.println("Result = "+ result);
                        break;
            
                  default:
                        System.out.println("Invalid input..");
                        break;
            }
            sc.close();
      }
}
