package com.evergent.corejava.divya.application4;
import java.util.Scanner;
class Bill extends Subscriptionplan {
public Bill() {
	        super();
	    }

	    public void display() {
	        System.out.println("Bill");
	        System.out.println("==============================================");
	        System.out.println("D-download ");
	        System.out.println("S-share");
	        System.out.println("M-Return to Main Menu");
	    }

	    public void execute() {
	        Scanner sub = new Scanner(System.in);
	        String module;

	        System.out.println("Enter your Module code (D,S,M): ");
	        module = sub.nextLine();

	        switch (module) {
	            case "D":
	                System.out.println("Download payment receipt");
	                break;

	            case "S":
	                System.out.println("Share payment receipt to email, WhatsApp, etc.");
	                break;

	            case "M":
	                return;
	        }
	    }
	}



