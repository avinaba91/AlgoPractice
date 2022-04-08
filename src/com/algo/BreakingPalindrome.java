package com.algo;

public class BreakingPalindrome {
	
	public static String breakPalindrome(String palindrome) {
		String output = "IMPOSSIBLE";
        if (palindrome.length() == 1) return output;
        for (int i = 0; i < palindrome.length() / 2; ++ i) {
            if (palindrome.charAt(i) != 'a') {
                return palindrome.substring(0, i) + 'a' +
                    palindrome.substring(i + 1);
            }
        }
        return output;
    }

	public static void main(String[] args) {
		System.out.println(breakPalindrome("aaa"));
		
		char b = 'a';
		int a = (int) b;
		System.out.println(a);

	}

}
