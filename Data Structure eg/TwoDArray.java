import java.util.*;
 
public class TwoDArray {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows: & columns");
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] arr = new int[rows][cols];

            System.out.println("Enter the matrix elements: ");
            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        arr[i][j] = sc.nextInt();
                  }
            }

            // Output
            System.out.println("The 2D array is: ");

            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        System.out.print(arr[i][j] + " ");
                  }
                  System.out.println("");
            }

            // Search Element
            System.out.println("Enter the element to search: ");
            int x = sc.nextInt();

            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        if(arr[i][j] == x){
                              System.out.println("Element found at: " + i + ", " + j);
                        }
                        else{
                              System.out.println("Element not found");
                        }
                  }
            }
            sc.close();
      }
}
