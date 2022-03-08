package com.algo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaximumOccurringCharacter {
	
	public static char maximumOccurringCharacter(String text) {
		char maxOccourringChar = '\0';
		Map<Character, Long> occourringCountMap = new HashMap<>();
		Map<Character, Integer> firstOccourringIndexMap = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {
			char curr = text.charAt(i);
			if ( occourringCountMap.containsKey(curr) ) {
				long count = occourringCountMap.get(curr);
				occourringCountMap.put(curr, ++count);
			} else {
				occourringCountMap.put(curr, 1l);
				firstOccourringIndexMap.put(curr, i);
			}
		}
		Map<Character, Long> sorted = occourringCountMap
		        .entrySet()
		        .stream()
		        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		        .collect(
		            Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
		                LinkedHashMap::new));
		long maxVal = 0l;
		List<Character> list = new ArrayList<>();
		for (Character c : sorted.keySet()) {
			long val = sorted.get(c);
			if (val > maxVal || val == maxVal) {
				maxVal = val;
				list.add(c);
			}
			if (val < maxVal) {
				break;
			}
		}
		int minindex = 0;
		boolean first = true;
		for (char c : list) {
			int index = firstOccourringIndexMap.get(c);
			if (first) {
				minindex = index;
				maxOccourringChar = c;
				first = false;
			}
			if (index < minindex) {
				minindex = index;
				maxOccourringChar = c;
			}
		}
		return maxOccourringChar;
	}

	public static void main(String[] args) {
		System.out.println(maximumOccurringCharacter("helloworld"));
	}
}
