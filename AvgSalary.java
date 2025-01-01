import java.util.*;
 
class test{
      String name;
      int id;
      double salary;
      String dept;

      
      public test(String name, int id, double salary, String dept){
            this.name= name;
            this.id=id;
            this.salary=salary;
            this.dept=dept;
      }
}
public class AvgSalary {
      public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();sc.nextLine();

            test[] arr = new test[n];

            for (int i = 0; i < n; i++) {
                  String name = sc.nextLine();
                  int id = sc.nextInt(); sc.nextLine();
                  double salary=sc.nextInt();sc.nextLine();
                  String dept = sc.nextLine();

                  arr[i] = new test (name, id, salary, dept);
            }


            double avg = avgSalary(arr);
            System.out.println("Average Salary: " + avg);
            sc.close();


      }
      

      public static double avgSalary(test[] arr){
            double sum=0;
            double count=0;
            double avg;
            for (test t : arr) {
                  sum += t.salary;
                  count++;
            }
            avg = sum/count;
            return avg;
            
      }
      
}
