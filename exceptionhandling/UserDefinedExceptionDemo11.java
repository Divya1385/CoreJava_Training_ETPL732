package com.evergent.corejava.exceptionhandling;
class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String Message) {
		super(Message);
	}
}
public class UserDefinedExceptionDemo11 {
	public static void withdraw(double amount) throws Exception {
		double balance=500.00;
		if (amount>balance) {
			throw new InsufficientFundsException("Insufficent funds for Withdrawal");
		}
		else {
			System.out.println("Withdrawal successful");
		}
	}
	public static void main(String[] args) {
		try {
			withdraw(600.00);
		}
			catch(Exception e) {
				System.out.println("caught the exception:"+e.getMessage());
				System.out.println(e);
			}
		System.out.println("program continues after handling the exception");
		}
		
		
	}

