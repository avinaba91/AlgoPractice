package com.algo;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSubStrCount {
	
	
	static List<String> getCount (String input) {
		int sizeLimit = 2;
		int length = input.length();
		int count = 0;
		List<String> list = new ArrayList<String>();
		for ( int i = 0; i < length - sizeLimit; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = i; j < length; j++) {
				sb.append(String.valueOf(input.charAt(j)));
				if (sb.toString().length() >= 2) {
					if (!list.contains(sb.toString())) {
						if (isPalindrome(sb.toString())) {
							//count ++;
							list.add(sb.toString());
						}
					}
				}
			}
		}
		return list;
	}
	
	static boolean isPalindrome(String substr) {
		int length = substr.length();
		for (int i = 0; i < length/2; i++) {
			char begin = substr.charAt(i);
			char end = substr.charAt(length - 1 - i);
			if (begin == end) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(getCount("aabaabba"));
	}

}
