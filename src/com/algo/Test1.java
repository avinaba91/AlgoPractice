package com.algo;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static long substringCalculator(String s) { 
		long count = 0l;
		int n = s.length();
		List<String> list = new ArrayList<>();
	       for (int i = 0; i < n; i++)  {
	           for (int j = i+1; j <= n; j++) { 
	                String substr = s.substring(i, j);
	                if (!list.contains(substr)) {
	                	count ++;
						list.add(substr);
					}
	                
	           }
	       }
	    return count;
	} 

	public static void main(String[] args) {
		System.out.println(substringCalculator("kincenvizh"));
	}
}
