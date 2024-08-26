package com.evergent.corejava.divya.application2;

import java.io.IOException;
import java.util.Scanner;

public class AhaSubscription {
	
	enum letters {
		S, P, B, Q
	}
	enum subletter1 {
		N, U, M
	}
	enum subletter2 {
		T, P, M
	}
	enum subletter3 {
		D, S, M
	}
	enum plancode {
		B, S, P
	}
	
	static int plancost;
	static int amount;
	static int discount;
	static int additionalfeaturescost;
	static int totalamount;
	static int subscriptionmonths;

	
	public static void main(String[] args) throws IOException {
		String module = null;
		Scanner sub = new Scanner(System.in);
		
		System.out.println("\n\t\t\t\t Welcome To AhaSubscription Plans");
		
		while (true) {
			
			System.out.println("===================================");
			System.out.println("Main Menu");
			System.out.println("====================================");
			System.out.println("S-Subscription ");
			System.out.println("P-Payment ");
			System.out.println("B-Bill ");
			System.out.println("Q-Quit ");
			System.out.println("=================");
			System.out.println("Enter your Module Code(S,P,B,Q): ");
			module = sub.nextLine();
			
			switch (letters.valueOf(module)) {
			
			case S:
				
				System.out.println("Subscription ");
				System.out.println("----------------------------");
				System.out.println("N-To subscribe to a new plan");
				System.out.println("U-Upgrade Your Plan");
				System.out.println("M-Main Menu");
				System.out.println("----------------------------");
				System.out.println("Enter Your Module Code(N,U,M):");
				module = sub.nextLine();
				
				switch (subletter1.valueOf(module)) {
				
				case N:
					
					System.out.println("Plan \t Description  \t Monthly Charge ");
					System.out.println("-----------------------------------------");
					System.out.println("B \t Basic Plan \t\t Rs50.00");
					System.out.println("S \t Standard Plan \t\t Rs100.00");
					System.out.println("P \t Premium Plan \t\t Rs150.00");
					System.out.println("-----------------------------------------");
					System.out.println("Enter your Plan code (B,S,P) : ");
					module = sub.nextLine();
					switch (plancode.valueOf(module)) {
					
					case B:
						plancost = 50;
						break;
					case S:
						plancost = 100;
						break;
					case P:
						plancost = 150;
						break;
					}
					System.out.println("Enter the number of months for subscription: ");
					subscriptionmonths = Integer.parseInt(sub.nextLine());
					System.out.println("You selected " + subscriptionmonths + " months");
					amount = plancost * subscriptionmonths;
					System.out.println("Amount for selected plan before discount is Rs " + amount);

					if (subscriptionmonths >= 1 && subscriptionmonths <= 4)
						discount = 0;
					else 
						if (subscriptionmonths >= 5 && subscriptionmonths <= 8)
						discount = (int) (amount * 0.05);
					else 
						if (subscriptionmonths >= 9 && subscriptionmonths <= 13)
						discount = (int) (amount * 0.1);
					else 
						if (subscriptionmonths > 15)
						discount = (int) (amount * 0.12);
					amount -= discount;
					System.out.println("Amount for selected plan After discount is Rs " + amount);
					break;
					
				case U:
					System.out.println("Enter the additional features cost: ");
					additionalfeaturescost = Integer.parseInt(sub.nextLine());
					System.out.println("Your Additional Features Cost Rs: " + additionalfeaturescost);
					break;
				}
				break;
				
			case P:
				System.out.println(" Payment ");
				System.out.println("----------------------------------");
				System.out.println("T-to display total amount to be paid");
				System.out.println("P-to make payment");
				System.out.println("M-Main Menu");
				System.out.println("-----------------------------------");
				System.out.println("Enter your Module code (T,P,M):");
				module = sub.nextLine();
				
				switch (subletter2.valueOf(module)) {
				
				case T:
					totalamount = amount + additionalfeaturescost;
					System.out.println("Total Amount to be Paid Rs: " + totalamount);
					break;
				case P:
					System.out.println("To Make Payment: Rs" + totalamount);
					break;
				}
				break;
				
			case B:
				System.out.println(" Bill  ");
				System.out.println("==============================================");
				System.out.println("D-download ");
				System.out.println("S-share");
				System.out.println("M-Return to Main Menu");
				System.out.println("===============================================");
				System.out.println("Enter your Module code (D,S,M): ");

				module = sub.nextLine();
				switch (subletter3.valueOf(module)) {
				
				case D:
					System.out.println("Download payment receipt");
					break;
					
				case S:
					System.out.println("Share payment receipt to email,whatsup,etc ");
					break;
				}
				break;
				
			case Q:
				System.out.println("Thanks For Taking Subscription ");
				System.exit(0);
				break;

			}

		}
	}
}
