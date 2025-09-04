package com.loopsPractice;
import java.util.Scanner;

public class CorrectPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	String pass="Mohsin2601";
	String input = "";
	
	while(!input.equals(pass)) {
		System.out.println("Enter Password:");
		input = sc.next();
		
		if(!input.equals(pass)) {
			System.out.println("Wrong Password,Try Again");
		}
	}
	System.out.println("Correct");

	}

}
