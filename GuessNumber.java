package com.loopsPractice;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int guessNumber =6;
		int guess=0;
		
		while(guess !=guessNumber) {
			System.out.println("Guess the number:");
			guess = sc.nextInt();
			
			if(guess != guessNumber) {
				System.out.println("Wrong Number, Try Again");
				
			}
		}
		System.out.println("you gussedd Correct number ");
		sc.close();

	}

}
