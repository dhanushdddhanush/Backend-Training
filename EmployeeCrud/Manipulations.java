package MapsCollections;

import java.util.*;

public class Manipulations {
	Map<String, List<Employee>> departments = new HashMap<>();

	/**
	 * Adds an employee to their department and sorts the list by name.
	 * 
	 * @param employee The employee to add.
	 * @throws InvalidDataException If the employee already exists in the department.
	 */
	public void addEmployee(Employee employee) throws InvalidDataException {
		List<Employee> employeeList = departments.get(employee.getDepartment().getDeptName());
		if (employeeList == null) {
			employeeList = new ArrayList<>();
		}

		if (!employeeList.contains(employee)) {
			employeeList.add(employee);
			Collections.sort(employeeList, Comparator.comparing(Employee::getEmpName));
			departments.put(employee.getDepartment().getDeptName(), employeeList);
			printEmployeeList(employee.getDepartment().getDeptName());
		} else {
			throw new InvalidDataException("Employee already exists");
		}
	}

	/**
	 * Removes an employee from a department.
	 * 
	 * @param empId   
	 * @param deptName 
	 * @throws InvalidDataException 
	 */
	public void deleteEmployee(int empId, String deptName) throws InvalidDataException {
		List<Employee> employeeList = departments.get(deptName);
		if (employeeList != null) {
			Employee empToDelete = null;
			for (Employee emp : employeeList) {
				if (emp.getEmpId() == empId) {
					empToDelete = emp;
					break;
				}
			}
			if (empToDelete != null) {
				employeeList.remove(empToDelete);
				Collections.sort(employeeList, Comparator.comparing(Employee::getEmpName));
				printEmployeeList(deptName);
			} else {
				throw new InvalidDataException("Employee not found");
			}
		} else {
			throw new InvalidDataException("Department not found");
		}
	}

	/**
	 * Updates employee details.
	 * 
	 * @param empId    
	 * @param deptName 
	 * @param name    
	 * @param salary  
	 * @param joinDate 
	 * @throws InvalidDataException
	 */
	public void updateEmployee(int empId, String deptName, String name, int salary, String joinDate)
			throws InvalidDataException {
		List<Employee> employeeList = departments.get(deptName);
		if (employeeList != null) {
			boolean found = false;
			for (Employee emp : employeeList) {
				if (emp.getEmpId() == empId) {
					emp.updateEmployee(name, salary, joinDate);
					found = true;
					break;
				}
			}
			if (found) {
				Collections.sort(employeeList, Comparator.comparing(Employee::getEmpName));
				printEmployeeList(deptName);
			} else {
				throw new InvalidDataException("Employee not found");
			}
		} else {
			throw new InvalidDataException("Department not found");
		}
	}

	/**
	 * Displays all employees in a department, sorted by joining date (latest first).
	 * 
	 * @param deptName 
	 * @throws InvalidDataException 
	 */
	public void getEmployee(String deptName) throws InvalidDataException {
		List<Employee> employeeList = departments.get(deptName);
		if (employeeList != null) {
			employeeList.sort(Comparator.comparing(Employee::getEmpJoinDate).reversed());
			printEmployeeList(deptName);
		} else {
			throw new InvalidDataException("Department not found");
		}
	}

	/**
	 * Prints the employees in a department.
	 * 
	 * @param deptName The department name.
	 */
	private void printEmployeeList(String deptName) {
		List<Employee> employeeList = departments.get(deptName);
		if (employeeList != null) {
			System.out.println("Employees in department: " + deptName);
			for (Employee emp : employeeList) {
				System.out.println(emp);
			}
		}
	}
}
