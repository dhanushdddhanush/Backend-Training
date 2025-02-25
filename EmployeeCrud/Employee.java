package MapsCollections;

import java.util.*;

/**
 * Represents an employee with an ID, name, department, salary, and joining date.
 */
public class Employee {
    private int employeeId;
    private String employeeName;
    private Department department;
    private int salary;
    private String empJoinDate;

    /**
     * Constructor for an Employee*
     * @param empId      
     * @param empName   
     * @param department 
     * @param salary     
     * @param empJoinDate 
     */
    public Employee(int employeeId, String employeeName, Department department, int salary, String empJoinDate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.empJoinDate = empJoinDate;
    }

    /**
     *
     * @return Employee ID.
     */
    public int getEmpId() {
        return employeeId;
    }

    /**
     *
     * @return Employee name.
     */
    public String getEmpName() {
        return employeeName;
    }

    /**
     *From Department class
     * @return EmployeE department.
     */
    public Department getDepartment() {
        return department;
    }

    /**
     *
     * @return Employe salary.
     */
    public int getSalary() {
        return salary;
    }

    /**
     *
     * @return Employe joining date.
     */
    public String getEmpJoinDate() {
        return empJoinDate;
    }
    /**
     *
     * @param name     
     * @param salary 
     * @param joinDate 
     */
    public void updateEmployee(String name, int salary,String joinDate) {
        this.employeeName = name;
        this.salary = salary;
        this.empJoinDate = joinDate;
    }

    /**
     * Checks if two employees are equal based on their employee ID.
     *
     * @param obj 
     */

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return employeeId == employee.employeeId;
    }

   
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    /**
     *
     * @return A formatted string containing employee details.
     */

    public String toString() {
        return "EmpId: " + employeeId + ", Name: " + employeeName + ", Salary: " + salary + ", Joining Date: " + empJoinDate;
    }
}
