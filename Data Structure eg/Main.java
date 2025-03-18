import java.util.*;
import java.util.stream.Collectors;

// Admin Class
class Admin {
    private long id;
    private String name;
    private boolean isAdmin;
    private boolean isEnabled;

    public Admin(long id, String name, boolean isAdmin, boolean isEnabled) {
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
        this.isEnabled = isEnabled;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}

// Employee Class
class Employee {
    private final long id;
    private final String name;
    private final double salary;
    private final int age;
    private final boolean isLoggedIn;
    private final long pincode;

    public Employee(long id, String name, double salary, int age, boolean isLoggedIn, long pincode) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.isLoggedIn = isLoggedIn;
        this.pincode = pincode;
    }

    public double getSalary() {
        return salary;
    }

    public long getPincode() {
        return pincode;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}

public class Main {
    private static final List<Employee> employeeList = List.of(
            new Employee(1, "John", 50000, 30, true, 110001),
            new Employee(2, "Jane", 60000, 25, false, 110002),
            new Employee(3, "Alex", 55000, 28, true, 110003),
            new Employee(4, "Alice", 62000, 26, true, 110004),
            new Employee(5, "Bob", 48000, 35, false, 110005),
            new Employee(6, "Charlie", 75000, 40, true, 110006),
            new Employee(7, "David", 82000, 45, false, 110007),
            new Employee(8, "Eve", 90000, 50, true, 110008),
            new Employee(9, "Frank", 65000, 33, true, 110009)
    );

    public static List<Employee> getTop3Salaries() {
        return employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Long> findNearestPincodes(long targetPincode) {
        return employeeList.stream()
                .map(Employee::getPincode)
                .sorted(Comparator.comparingLong(p -> Math.abs(p - targetPincode)))
                .distinct()
                .skip(1) // Skipping the nearest one to get the second nearest
                .limit(2) // Fetching the next two closest pincodes
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Display top 3 salary employees
        System.out.println("Top 3 Salaries:");
        for (Employee e : getTop3Salaries()) {
            System.out.println(e.getName() + " - " + e.getSalary());
        }

        // Find nearest and second nearest pincode
        long referencePincode = 110000;
        List<Long> nearestPincodes = findNearestPincodes(referencePincode);
        System.out.println("second nearest pincodes to " + nearestPincodes);
    }
}
