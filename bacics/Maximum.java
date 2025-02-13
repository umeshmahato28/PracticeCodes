import java.util.*;

class Shoe {
    int batchnum;
    String type;
    int size;
    double price;
    
    Shoe(int batchnum, String type, int size, double price){
        this.batchnum = batchnum;
        this.type = type;
        this.size = size;
        this.price = price;
    }
    
}

public class Maximum {
    
//     public static Shoe GetShoeBytype(Shoe[] sh, String type){
//         // Shoe ans = null;
        
//         for (Shoe shoe : sh) {
//             if (shoe.type.equals(type)){
//                 return shoe;
//             }
//         }
        
//         return null;
//     }
    
      public static double avgPrice(Shoe[] arr) {
            double sum =0;
            double c =0;
            for (Shoe shoe : arr) {
                  sum += shoe.price;
                  c++;
            }

            double avg = sum/c;
            return avg;
      }
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        Shoe [] sh = new Shoe[n];
        
        for (int i = 0; i < n; i++){
            int batchnum = sc.nextInt(); sc.nextLine();
            String type = sc.next();
            int size = sc.nextInt(); sc.nextLine();
            double price = sc.nextDouble(); sc.nextLine();
            
            sh[i] = new Shoe(batchnum, type, size, price);
            
        }

        double avg = avgPrice(sh);
        System.out.println("Average price: " + avg);

      //   String type = sc.next();
        
      //   Shoe found = GetShoeBytype(sh, type);
        
      //   if (found != null) {
      //       System.out.println(found.batchnum);
      //       System.out.println(found.type);
      //       System.out.println(found.size);
      //       System.out.println(found.price);
      //   }else{
      //       System.out.println("No Shoe present");
      //   }
        sc.close();
    }
}