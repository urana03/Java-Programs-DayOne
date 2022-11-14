package com.bridgelabz.dayone;

public class DemonstrationProgram {
    //Static variables
	static String firstName = "Uttam";
	static String lastName = "Rana";
	static int num;
	//Method used 
	static void fav(String color) {
		      System.out.println("My name is "+ firstName +" "+ lastName+".");
		      System.out.println("My favourite number is "+ num+".");
		      System.out.println("My favourite color is "+ color+".");
	}
    //Block
	static {
		num = 03;
	}
	//Main Program
	 public static void main(String args[]) {
	     fav("Black");

	 }
}