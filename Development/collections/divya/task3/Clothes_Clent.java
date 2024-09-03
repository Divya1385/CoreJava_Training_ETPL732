package com.evergent.corejava.collections.divya.task3;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Clothes_Clent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ClothesInterface s=new ClothesImp();
		for(;;){
			System.out.println("1. Add Clothes 2.Search Id 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the Id");
				   String id=sc.next();
				   System.out.println("Enter the clothes type");
				   String name=sc.next();
				   System.out.println("Enter the price");
				   int price=sc.nextInt();
				   Clothes t=new Clothes();
				   t.setId(id);
				   t.setClothesName(name);
				   t.setPrice(price);
				   String message=s.addclothes(t);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the Id");
			String id1=sc.next();
			s.searchID(id1);
			break;
			case 3:s.getAllClothes();
			break;
			case 4:System.exit(0);
			}
		}
	}
}