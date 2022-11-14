package com.bridgelabz.dayone;

import java.util.Scanner;

public class LeapYear {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter year you want to check:");
		int year = scan.nextInt();
		if(year%400 == 0) {
			System.out.print("The year " + year +" is a leap year.");
		}
		else if(year%100 == 0) {
			System.out.print("The year " + year +" is not a leap year.");
		}
		else if(year%4 == 0) {
			System.out.print("The year " + year +" is a leap year.");
		}
		else {
			System.out.print("The year " + year +" is not a leap year.");
		}
	}
}
