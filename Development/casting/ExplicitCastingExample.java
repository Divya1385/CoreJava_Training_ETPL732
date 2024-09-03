package com.evergent.corejava.casting;

/*
Explicit Type Casting
Explicit type casting, also known as narrowing conversion,
* 
*/

public class ExplicitCastingExample {
   public static void main(String[] args) {
       double dnum = 1007654;
       float num = (float) dnum; // Explicit casting from double to int

       System.out.println("double value: " + dnum);
       System.out.println("float value (after explicit casting): " + num);
   }
}