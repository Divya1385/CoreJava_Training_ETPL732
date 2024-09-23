package com.evergent.corejava.divya.application6;

public class EmployeeService {
    EmployeeDAO EmployeeDAO = new EmployeeDAO();

    public int addBook(int Id, String Name, double Number) {
        EmployeeBean EmployeeBean = new EmployeeBean();
        EmployeeBean.setId(Id);
        EmployeeBean.setName(Name);
        EmployeeBean.setNumber(Number);
        EmployeeBean.setAvailable(true);
        return EmployeeDAO.addEmployee(EmployeeBean);
    }

    public String checkoutEmployee(int Id) {
        if (EmployeeDAO.checkout(Id)) {
            return "Employee checked out successfully.";
        } else {
            return "Employee is not available.";
        }
    }

    public String returnEmployee(int Id) {
    	
        if (EmployeeDAO.returnEmployee(Id)) {
            return "Employee Id returned successfully.";
        } else {
            return "Error returning Employee Id.";
        }
    }

   
    public String viewAvailableEmployee() {
        return EmployeeDAO.getAvailableEmployee();
    }
}
