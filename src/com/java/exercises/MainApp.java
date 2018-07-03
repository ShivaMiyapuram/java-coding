package com.java.exercises;

import java.util.Scanner;

public class MainApp {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag;
		
		switch(int i) {
		
			case 1: System.out.println("1. Enter a String to check for Palindrome: ");
					String input = sc.nextLine();
					int len = input.length();
					flag = isPalindrome(input, len);
					if(flag)
						System.out.println("Yes, it's a palindrome");
					else
						System.out.println("Not a Palindrome");
					break;
			case 2: 		
				
				
					
		
		
		
		
		}
		
		
		
		removeChar(input, );

	}

	/**
	 * PALINDROME
	 * 
	 * @param input
	 * @param len
	 */
	private static boolean isPalindrome(String input, int len) {
		for (int i = 0; i < len / 2; i++) {
			if (input.charAt(i) != input.charAt(len - i - 1))
				return false;
		}
		return true;
	}

}
