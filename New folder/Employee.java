import java.util.Scanner;

class Employee {
    private String name;
    private int employeeID;
    private String designation;
    private String department;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return String.format("%06d", employeeID);
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter Name: ");
        e.setName(sc.nextLine());

        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();

        if (id.isEmpty()) {
            e.setEmployeeID(0);      // Prints 000000
        } else {
            e.setEmployeeID(Integer.parseInt(id));
        }

        System.out.print("Enter Designation: ");
        e.setDesignation(sc.nextLine());

        System.out.print("Enter Department: ");
        e.setDepartment(sc.nextLine());

        System.out.println("\nEmployee Details");
        System.out.println("Name: " + e.getName());
        System.out.println("Employee ID: " + e.getEmployeeID());
        System.out.println("Designation: " + e.getDesignation());
        System.out.println("Department: " + e.getDepartment());

        sc.close();
    }
}