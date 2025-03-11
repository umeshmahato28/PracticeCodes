public class Admin {
      private long Id;
      private String name;
      private boolean isAdmin;
      private boolean isEnabled;

      public void setId(long Id) {
            this.Id = Id;
      }

      public long getId() {
            return Id;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getName() {
            return name;
      }

      public void setAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
      }

      public boolean isAdmin() {
            return isAdmin;
      }

      public void setIsEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
      }

      public boolean isEnabled() {
            return isEnabled;
      }

}

class Employee {

      private long Id;
      private String name;
      private double salary;
      private int age;
      private boolean isLoggedIn;
      private long pincode;

      public void setId(long Id) {
            this.Id = Id;
      }

      public long getId() {
            return Id;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getName() {
            return name;
      }

      public void setSalary(double salary) {
            this.salary = salary;
      }

      public double getSalary() {
            return salary;
      }

      public void setAge(int age) {
            this.age = age;
      }

      public int getAge() {
            return age;
      }

      public void setIsLoggedIn(boolean isLoggedIn) {
            this.isLoggedIn = isLoggedIn;
      }

      public boolean isLoggedIn() {
            return isLoggedIn;
      }

      public void setPincode(long pincode) {
            this.pincode = pincode;
      }

      public long getPincode() {
            return pincode;
      }

}
