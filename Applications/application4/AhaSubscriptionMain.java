package com.evergent.corejava.divya.application4;
import java.io.IOException;
import java.util.Scanner;

public class AhaSubscriptionMain {
	public static void main(String[] args) throws IOException {
		Scanner sub = new Scanner(System.in);
		String module;
		Subscriptionplan subscription= null;
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
		

	   switch (module) {
       case "S":
	   subscription = new Subscription();
	   subscription.display();
	   subscription.execute();
	break;

	case "P":
		subscription = new Payment(subscription.amount, subscription.additionalFeaturesCost);
		subscription.display();
		subscription.execute();
	break;

	case "B":
		subscription = new Bill();
		subscription.display();
		subscription.execute();
	break;

	case "Q":
		System.out.println("Thanks For Taking Subscription ");
	 System.exit(0);
    break;
    default:
    	System.out.println("please select again.");
    	continue;
    
		        }
		    }
		}
}


