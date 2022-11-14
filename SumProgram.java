package com.bridgelabz.dayone;
import java.util.*;
public class SumProgram {
   
	public static void main(String args[]) {
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter four numbers: ");
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		int fourth = scan.nextInt();
		
		int sumNum = first + second + third + fourth;
		System.out.println("The sum of numbers is: " + sumNum);
	}
}
