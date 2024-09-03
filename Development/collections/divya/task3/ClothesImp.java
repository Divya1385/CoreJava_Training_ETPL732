package com.evergent.corejava.collections.divya.task3;
import java.util.HashSet;
import java.util.Set;

public class ClothesImp implements ClothesInterface{
	Set<Clothes> cloth=new HashSet<Clothes>();
	public String addclothes(Clothes c) {
		cloth.add(c);
		return c.getId();
	}
	public void searchID(String Id) {
		boolean c=false;
		if(cloth.size()>0){
			for(Clothes Clothes:cloth){
				if(Clothes.getId().equals(Id)){
					System.out.println(Clothes.getId()+" "+Clothes.getClothesName()+" "+Clothes.getPrice());	
					c=true;
					break;	
				}
			}
		}
		if(!c)
			System.out.println("The Clothes are is not found");
	}
		
		public void  getAllClothes() {
			if(cloth.size()>0){
				for(Clothes Clothes:cloth){
					System.out.println(Clothes.getId()+" "+Clothes.getClothesName()+" "+Clothes.getPrice());
				}
					
			}
			else{
				System.out.println("No clothes are available");
			}
	}
		

}

			

