package com.evergent.corejava.exceptionhandling;
class InvalidScoreException extends RuntimeException {
	public InvalidScoreException(String Message) {
		super(Message);
	}
}
public class UserDefinedUncheckedExceptionDemo12 {
	public static void validscore(int score)  {
		if (score<0||score>100) {
			throw new InvalidScoreException("Score is invalid");
		}
		else {
			System.out.println("Score is valid");
		}
	}
	public static void main(String[] args) {
		try {
			validscore(110);
		}
			catch(Exception e) {
				System.out.println("caught the exception:"+e.getMessage());
				System.out.println(e);
			}
		System.out.println("program continues after handling the exception");
		}
		
		
	}

