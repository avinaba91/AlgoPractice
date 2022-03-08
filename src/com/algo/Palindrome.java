package com.algo;

public class Palindrome {
	
	public static boolean isPalindrome(String word) {
		word = word.toLowerCase();
		boolean isPalindrome = true;
		char[] wordArr = word.toCharArray();
		int len = wordArr.length;
		for (int i = 0 ; i <= len/2; i++) {
			if (wordArr[i] != wordArr[len-1-i]) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("Deleveled"));
	}
	

}
