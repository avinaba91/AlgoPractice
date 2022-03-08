package com.algo;

public class ThoughtWorksTest {
	
	static int[] solve(int N, String S){
	       // Write your code here
	        int[] result = new int[N];
	        int length = S.length();
	        for (int i = 1; i <= length; i++) {
	            String first = S.substring(0, i);
	            System.out.println(first);
	            String second = S.substring(length-i,length);
	            System.out.println(first);
	            result[i-1] = xorSetBits(first, second, i);
	        }
	        return result;
	    
	    }

	    static int xorSetBits (String first, String second, int length) {
	        int setBitCount = 0;
	        for (int i = 0; i < length; i++) {
	            char f_char = first.charAt(i);
	            char s_char = second.charAt(i);
	            if (f_char == '0' && s_char == '1') {
	                setBitCount ++;
	            }
	            if (f_char == '1' && s_char == '0') {
	                setBitCount ++;
	            }
	        }
	        if ( setBitCount % 2 == 0) {
	            return 0;
	        } else {
	            return 1;
	        }
	    }
	
	public static void main(String[] args) {
		System.out.println(solve(3, "100"));

	}

}
