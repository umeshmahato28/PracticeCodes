import java.util.*;

public class ArrayLists {
      public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();

            // Add elements to the list
            list.add(1);
            list.add(2);
            list.add(4);
            list.add(5);

            System.out.println(list);
            
            // Add element at specific index
            list.add(2, 3);
            System.out.println(list);
            
            // Get element at specific index
            System.out.println(list.get(2));

            // Set element at specific index
            list.set(2, 3);
            System.out.println(list);

            // Remove element at specific index

            list.remove(4);
            System.out.println(list);

            // display elements using for each loop
            
            for (Integer nums : list) {
                  System.out.println(nums);
            }
            // display elements using for loop
            
            for (int i = 0; i < list.size(); i++) {
                  System.out.println(list.get(i));
            }

            
      }
}
