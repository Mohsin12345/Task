package com.loopsPractice;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int largestNumber=0;
		
		System.out.println("Ennter number");
		
		while(num>=0) {
			num= sc.nextInt();
			
			if(num>=0 && num > largestNumber) {
				largestNumber = num;
			}
		}
		System.out.println("Largest Number = " + largestNumber);
		sc.close();

	}

}
