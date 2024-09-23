package com.evergent.corejava.divya.application6;

import java.sql.*;

public class EmployeeDAO {
    Connection con = null;

    public int addEmployee(EmployeeBean Employee) {
        try {
            con = EmployeeDBConnection.getConnection();
            String sql = "INSERT INTO Employee (Id, Name, Number, isAvailable) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, Employee.getId());
            pstmt.setString(2, Employee.getName());
            pstmt.setDouble(3, Employee.getNumber());
            pstmt.setBoolean(4, Employee.isAvailable());
            int result = pstmt.executeUpdate();
            con.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean checkout(int Id) {
        try {
            con = EmployeeDBConnection.getConnection();
            String sql = "delete from Employee WHERE Id = "+Id;
            PreparedStatement pstmt = con.prepareStatement(sql);
            int rowsUpdated = pstmt.executeUpdate();
            con.close();
            return rowsUpdated >0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

   public boolean returnEmployee(int Id) {
        try {
            con = EmployeeDBConnection.getConnection();
            String sql = "UPDATE Employee SET isAvailable = ? WHERE Id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setBoolean(1, true);
            pstmt.setInt(2, Id);
           int rowsUpdated = pstmt.executeUpdate();
            con.close();
            return rowsUpdated > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
   /* public String returnEmployee(int Id) {
        StringBuilder employeeDetails = new StringBuilder();
        try {
            con = EmployeeDBConnection.getConnection();
            String sql = "SELECT * FROM Employee WHERE Id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, Id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                // Assuming the Employee class has appropriate fields
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
                int number = rs.getInt("Number");
                boolean isAvailable = rs.getBoolean("isAvailable");
                
                // Append employee detaiEmployee checked out successfully.ls to the StringBuilder
                employeeDetails.append("Employee checked out successfully.")
                                .append("Employee Details:\n")
                               .append("ID: ").append(id).append("\n")
                               .append("Name: ").append(name).append("\n")
                               .append("Number: ").append(number).append("\n")
                               .append("Available: ").append(isAvailable).append("\n");
            } else {
                employeeDetails.append("No employee found with ID: ").append(Id).append("\n");
            }
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            employeeDetails.append("An error occurred while fetching employee details.\n");
        }
        return employeeDetails.toString(); // Return the employee details as a string
    }
*/

    public String getAvailableEmployee() {
        StringBuilder availableEmployee = new StringBuilder();
        try {
            con = EmployeeDBConnection.getConnection();
            String sql = "SELECT * FROM Employee WHERE isAvailable = true";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                availableEmployee.append("ID: ").append(rs.getInt("Id"))
                        .append(", Name: ").append(rs.getString("Name"))
                        .append(", Number: ").append(rs.getString("Number"))
                        .append("\n");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return availableEmployee.toString();
    }
}
