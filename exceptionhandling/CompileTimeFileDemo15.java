package com.evergent.corejava.exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CompileTimeFileDemo15 {
	public static void main(String[] args) {
		try {
			
			File file =new File("C:/prog/java1.txt");
			Scanner Scanner=new Scanner(file);
			while(Scanner.hasNextLine()) {
				System.out.println(Scanner.nextLine());
			}
			Scanner.close();
		}
		catch(FileNotFoundException e) {
			//handle the FNFE
			//System.out.println("FileNotFound:"+e.getMessage());
			//System.err.println("FileNotFound:"+e.getMessage());
			e.printStackTrace();
		}

	}

}
