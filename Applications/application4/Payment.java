package com.evergent.corejava.divya.application4;
import java.util.Scanner;
class Payment extends Subscriptionplan {
public Payment(int amount, int additionalFeaturesCost) {    
	  	    super();
	        this.amount = amount;
	        this.additionalFeaturesCost = additionalFeaturesCost;
	    }

	    public void display() {
	        System.out.println("Payment ");
	        System.out.println("----------------------------------");
	        System.out.println("T-to display total amount to be paid");
	        System.out.println("P-to make payment");
	        System.out.println("M-Main Menu");
	    }

	    public void execute() {
	        Scanner sub = new Scanner(System.in);
	        String module;

	        System.out.println("Enter your Module code (T,P,M):");
	        module = sub.nextLine();

	        switch (module) {
	            case "T":
	                totalAmount = amount + additionalFeaturesCost;
	                System.out.println("Total Amount to be Paid Rs: " + totalAmount);
	                break;

	            case "P":
	                System.out.println("To Make Payment: Rs" + totalAmount);
	                break;

	            case "M":
	                return;
	        }
	    }
	}


