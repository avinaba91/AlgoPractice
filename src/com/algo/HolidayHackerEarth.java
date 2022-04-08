package com.algo;

public class HolidayHackerEarth {
	
	public static int solution (String str, int size) {
		int output = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 0; i <= (size - 4); i++) {
			a = i;
			char ax = str.charAt(i); 
			b = i+1;
			char bx = str.charAt(i+1);
			int j;
			for (j = i+2; j < size; j++) {
				if (ax == str.charAt(j)) {
					c = j;
					break;
				}
			}
			int k;
			for (k = j+1; k < size; k++) {
				if (bx == str.charAt(k)) {
					d = k;
					break;
				}
			}
			if (d > c && c > b && b > a) {
				output ++;
			}
			
		}
		return output;
	}

	public static void main(String[] args) {
		String s = "6";
		int x = Integer.parseInt(s);
		System.out.println(solution("hylobclddzflmzitrxwwsqhozvgexhxjmm", 34));

	}

}
