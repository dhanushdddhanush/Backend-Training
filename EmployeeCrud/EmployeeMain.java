package MapsCollections;
import java.util.*;

public class EmployeeMain {

    public static void main(String[] args) {
        try {
            // Creating departments
            Department department1 = new Department(1, "CSE");
            Department department2 = new Department(2, "ECE");

            // Creating employee objects
            Employee employee1 = new Employee(001, "Dhanush", department1, 100, "2013-02-07");
            Employee employee2 = new Employee(002, "chandu", department1, 10000, "2008-07-04");
            Employee employee3 = new Employee(003, "Jagadeesh", department2, 2000, "2010-12-21");
            Employee employee4 = new Employee(004, "Aditya", department2, 20000, "2019-12-21");
            Employee employee5 = new Employee(005, "Ram", department1, 1000, "2017-12-27");

            // Creating manipulations instance
            Manipulations manipulations = new Manipulations();

            // Adding employees
            manipulations.addEmployee(employee1);
            manipulations.addEmployee(employee2);
            manipulations.addEmployee(employee3);
            manipulations.addEmployee(employee4);
            manipulations.addEmployee(employee5);
 
            // Updating employee details by manipulations
            System.out.println("\nUpdated Employee Details:");
            manipulations.updateEmployee(1, "CSE", "Dhanush", 100000, "2025-09-01");
            manipulations.updateEmployee(2, "CSE", "chandu", 20000, "2025-09-01");
            // Retrieving employees by manipulations
            System.out.println("\nRetriving Data Of Cse:");
            manipulations.getEmployee("CSE");
            System.out.println("\nRetriving Data Of Ece:");
            manipulations.getEmployee("ECE");

            // Deleting employee by manipulations
            System.out.println("\nDelete Employee:");
            manipulations.deleteEmployee(2, "CSE");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
