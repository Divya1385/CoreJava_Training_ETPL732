package com.evergent.corejava.divya.casestudy;
import java.util.HashMap;
import java.util.Map;

public class EmployeeManagementSystem {
    private Map<Integer, Employee> map = new HashMap<>();

    // Add a new employee
    public void addEmployee(int id, String name, String department) {
        Employee employee = new Employee(id, name, department);
        map.put(id, employee);
    }

    // Retrieve employee details by ID
    public Employee getEmployee(int id) {
        return map.get(id);
    }

    // Update employee details
    public void updateEmployee(int id, String name, String department) {
        Employee employee = map.get(id);
        if (employee != null) {
            employee.setName(name);
            employee.setDepartment(department);
            System.out.println("Employee updated: " + employee);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Remove an employee by ID
    public void removeEmployee(int id) {
        Employee removedEmployee = map.remove(id);
        if (removedEmployee != null) {
            System.out.println("Removed employee: " + removedEmployee);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // List all employees
    public void listEmployees() {
        if (map.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Main method to demonstrate the system
    public static void main(String[] args) {
        EmployeeManagementSystem emp = new EmployeeManagementSystem();

        // Add employees
        emp.addEmployee(1, "Divya", "Engineering");
        emp.addEmployee(2, "Vani", "Software");
        emp.addEmployee(3, "ravi", "Engineering");
        emp.addEmployee(4, "ramu", "Software");

        // Retrieve and print employee
        System.out.println("\nRetrieving employee with ID 1:");
        System.out.println(emp.getEmployee(1));

        // Update employee details
        System.out.println("\nUpdating employee with ID 2:");
        emp.updateEmployee(2, "vamshi", "HR");

        // Try updating an employee with an invalid ID
        System.out.println("\nTrying to update employee with ID 3:");
        emp.updateEmployee(3, "Rani", "HR");

        // Remove employee
        System.out.println("\nRemoving employee with ID 2:");
        emp.removeEmployee(2);

        // List all employees
        System.out.println("\nListing all employees:");
        emp.listEmployees();
    }
}
		
	
