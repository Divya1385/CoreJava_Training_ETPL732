package com.evergent.corejava.divya.application6;

import java.util.Scanner;

public class EmployeeController {
    public static void main(String[] args) {
        int Id = 0;
        String Name = "";
        Double Number = 00.0;
        int choice, continueChoice = 1;
        Scanner scanner = new Scanner(System.in);
        EmployeeService EmployeeService = new EmployeeService();

        System.out.println("------------------------WELCOME TO THE COMPANY---------------------");
        while (continueChoice != 0) {

        	System.out.println("1. Add New Employee");
            System.out.println("2. Checkout Employee");
            System.out.println("3. Return Employee");
            System.out.println("4. View Available Employee");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee ID:");
                    Id = scanner.nextInt();
                    System.out.println("Enter Employee Name:");
                    Name = scanner.next();
                    System.out.println("Enter Employee Number:");
                    Number = scanner.nextDouble();
                    int result = EmployeeService.addBook(Id, Name, Number);
                    System.out.println(result + " Employee added successfully.");
                    break;
                case 2:
                    System.out.println("Enter Employee ID to checkout:");
                    Id = scanner.nextInt();
                    String checkoutMessage = EmployeeService.checkoutEmployee(Id);
                    System.out.println(checkoutMessage);
                    break;
                case 3:
                    System.out.println("Enter Employee ID to return:");
                    Id = scanner.nextInt();
                    String returnMessage = EmployeeService.returnEmployee(Id);
                    System.out.println(returnMessage);
                    break;
                case 4:
                    System.out.println("Available Employee:");
                    String availableEmployee = EmployeeService.viewAvailableEmployee();
                    System.out.println(availableEmployee);
                    break;
                default:
                    System.out.println("Enter a valid choice.");
                    break;
            }
            System.out.println("\nEnter 1 to perform more operations and 0 to exit:");
            continueChoice = scanner.nextInt();
        }
        scanner.close();
    }
}
