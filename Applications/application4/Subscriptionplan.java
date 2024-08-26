package com.evergent.corejava.divya.application4;

abstract public class Subscriptionplan implements SubscriptionInterface {
	
	   static final int BASIC_plan = 50;
	   static final int STANDARD_plan = 100;
	   static final int PREMIUM_plan= 150;

	     int planCost;
	     int subscriptionMonths;
	     int amount;
	     int discount;
	     int additionalFeaturesCost;
	     int totalAmount;

	   Subscriptionplan() {
	        this.planCost = 0;
	        this.subscriptionMonths = 0;
	        this.amount = 0;
	        this.discount = 0;
	        this.additionalFeaturesCost = 0;
	        this.totalAmount = 0;
	    }

	    public void display() {
	        System.out.println("Display Subscription Details");
	    }

	    public abstract void execute();
	}


