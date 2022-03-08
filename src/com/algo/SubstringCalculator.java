package com.algo;
import java.util.ArrayList;
import java.util.List;

public class SubstringCalculator {

	public static long substringCalculator(String s) {
		long calc = 0l;
		List<String> list = new ArrayList<>();
		StringBuilder sb = null;
		if (s != null) {
			int length = s.length();
			if (length > 0) {
				for (int size = 1; size <= length; size++) {
					for (int i = 0; i <= length - size; i++) {
						int j = i + size - 1;
						sb = new StringBuilder();
						for (int k = i; k <= j; k++) {
							sb.append(s.charAt(k));
						}
						if (!list.contains(sb.toString())) {
							calc ++;
							list.add(sb.toString());
						}
					}
				}
			}
		}
		return calc;

	}

	public static void main(String[] args) {
		System.out.println(substringCalculator("kincenvizh"));
	}

}
