package com.evergent.corejava.divya.application4;
import java.util.Scanner;
class Subscription extends Subscriptionplan {

public Subscription() {
	        super();  // Calling the constructor of the Subscriptionplan class
	    }

	    
	    public void display() {
	        System.out.println("Subscription ");
	        System.out.println("----------------------------");
	        System.out.println("N-To subscribe to a new plan");
	        System.out.println("U-Upgrade Your Plan");
	        System.out.println("M-Main Menu");
	    }
	  

	   
	    public void execute() {
	        Scanner sub = new Scanner(System.in);
	        String module;

	        System.out.println("Enter Your Module Code(N,U,M):");
	        module = sub.nextLine();

	        switch (module) {
	            case "N":
	                System.out.println("Plan \t Description  \t Monthly Charge ");
	                System.out.println("-----------------------------------------");
	                System.out.println("B \t Basic Plan \t\t Rs50.00");
	                System.out.println("S \t Standard Plan \t\t Rs100.00");
	                System.out.println("P \t Premium Plan \t\t Rs150.00");
	                System.out.println("-----------------------------------------");
	                System.out.println("Enter your Plan code (B,S,P) : ");
	                module = sub.nextLine();
	                switch (module) {
	                    case "B":
	                        planCost = BASIC_plan;
	                        break;
	                    case "S":
	                        planCost = STANDARD_plan;
	                        break;
	                    case "P":
	                        planCost = PREMIUM_plan;
	                        break;
	                }
	                System.out.println("Enter the number of months for subscription: ");
	                subscriptionMonths = Integer.parseInt(sub.nextLine());
	                System.out.println("You selected " + subscriptionMonths + " months");
	                amount = planCost * subscriptionMonths;
	                System.out.println("Amount for selected plan before discount is Rs " + amount);

	                if (subscriptionMonths >= 1 && subscriptionMonths <= 4)
	                    discount = 0;
	                else if (subscriptionMonths >= 5 && subscriptionMonths <= 8)
	                    discount = (int) (amount * 0.05);
	                else if (subscriptionMonths >= 9 && subscriptionMonths <= 13)
	                    discount = (int) (amount * 0.1);
	                else if (subscriptionMonths > 15)
	                    discount = (int) (amount * 0.12);

	                amount -= discount;
	                System.out.println("Amount for selected plan After discount is Rs " + amount);
	                break;

	            case "U":
	                System.out.println("Enter the additional features cost: ");
	                additionalFeaturesCost = Integer.parseInt(sub.nextLine());
	                System.out.println("Your Additional Features Cost Rs: " + additionalFeaturesCost);
	                break;

	            case "M":
	                return;
	        }
	    }
	}


