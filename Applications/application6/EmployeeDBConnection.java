package com.evergent.corejava.divya.application6;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeDBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection  conn = DriverManager.getConnection(
				  "jdbc:mysql://localhost:3306/evergentdb",
				  "root",
				  "admin");
        return conn;
       /* return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/librarydb",
                "root",
                "admin");
        */
    }
}
