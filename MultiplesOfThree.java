package com.loopsPractice;

import java.util.Scanner;

public class MultiplesOfThree {

	public static void main(String[] args) {
//		  int i = 1;
//		  while(i<=5) {
//			  System.out.println(3 * i);
//			  i++;
//		  }
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please provide the number whose table you want");
		int number = scan.nextInt();
		
		System.out.println("Printing your table");
		int i =1;
		while(i<=5) {
			System.out.println(number +  " X " + i + " = " + (number*i++));
		}
	}

}
