package com.loopsPractice;

import java.util.Scanner;

public class AskUser {

	public static void main(String[] args) {
		// Ask the user to enter a number.keep asking util they enter a +ve Number.
		Scanner number = new Scanner(System.in);
		int num = 0;
		
		while(num<=0) {
			System.out.println("Enter a Number:");
			num = number.nextInt();
		}
		System.out.println("You entered: " +num);
		number.close();
		
		

	}

}
