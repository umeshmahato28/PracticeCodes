public class Square {
    
      // Static method to calculate the square of a number
      public  int calculateSquare(int number) {
          return number * number;
      }
  
      public static void main(String[] args) {
          int num = 5;
          
          Square obj = new Square();
          int square = obj.calculateSquare(num);
          
          System.out.println("The square of " + num + " is: " + square);
      }
  }
  