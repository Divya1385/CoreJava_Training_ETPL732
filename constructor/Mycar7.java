package com.evergent.corejava.constructor;
//we can use reference in default constructor.we use parameters in default constructor
class car{
	String color;
	int speed;

//default constructor
car(){
	color="white";
	speed=120;
}
car(String color, int speed) {
	this.color=color;
	this.speed=speed;
}
void display() {
	System.out.println("color:"+color);
	System.out.println("speed:"+speed);
	
}
}
public class Mycar7 {
	public static void main(String[] args) {
		car c1=new car(); //Default constructor
		car c2=new car("Blue",180); // parameterized constructor
		c1.display();
		c2.display();
		

	}

}
