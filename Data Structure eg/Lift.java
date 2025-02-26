import java.util.*;

class Lift {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int groundFloor = 0;
            int topFloor = 9;
            int currentFloor = 0;

            while (true) {

                  System.out.print("Enter Floor : ");
                  int toFloor = sc.nextInt();

                  if (toFloor >= groundFloor && toFloor <= topFloor) {
                        if (currentFloor < toFloor) {
                              for (int i = currentFloor; i <= toFloor; i++) {
                                    System.out.println(i + " ");
                              }
                              currentFloor = toFloor;
                        } else {
                              for (int i = currentFloor; i >= toFloor; i--) {
                                    System.out.println(i + " ");
                              }
                              currentFloor = toFloor;
                        }
                        System.out.println();
                  } else {
                        System.out.println("Floor Not Available, Try Again.");
                        System.out.println();
                  }
                  // sc.close();
            }

      }
}