package com.loopsPractice;

import java.util.Scanner;

public class NameEnter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name= "";
		
		System.out.println("Enter name and type stop to finish");
		
		while(!name.equals("stop")) {
			name=sc.nextLine();
			
			if(!name.equals("stop")) {
				System.out.println(name);
			}
		}
		sc.close();

	}

}
