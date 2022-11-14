package com.bridgelabz.dayone;
import java.util.*;
public class TwoStrings {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First String:");
		String firstString = scan.nextLine();
		System.out.print("Enter Second String:");
		String secondString = scan.nextLine();
		
	    System.out.println("Comparing "+ firstString + " and " + secondString + " : " +  firstString.equals(secondString));
	}
}
