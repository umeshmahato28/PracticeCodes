import java.util.*;

public class Java8demo {
      public static void main(String[] args) {
            MathOperation addition = (int a, int b) -> a + b;
            int result = addition.operate(10, 5);
            System.out.println(result);
      }
}

interface MathOperation {
      int operate(int a, int b);
}