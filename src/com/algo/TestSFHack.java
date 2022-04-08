package com.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSFHack {

	//5:10,1:2
	static String compactAndSort(String rangestring) {
		List<Integer> list = new ArrayList<>();
		StringBuilder compactSortedStr = new StringBuilder();
		if (rangestring != null) {
			String[] inputs = rangestring.split(",");
			for (int i = 0; i < inputs.length; i++) {
				String[] ranges = inputs[i].trim().split(":");
				int initialNo = Integer.parseInt(ranges[0].trim());
				int endNo = Integer.parseInt(ranges[1].trim());
				for (int j = initialNo; j<=endNo; j++) {
					if (!list.contains(j)) {
						list.add(j);
					}
				}
			}
			Collections.sort(list);
			int prevNo = list.get(0);
			compactSortedStr.append(prevNo);
			for (int i = 1; i < list.size(); i++) {
				int currNo = list.get(i);
				if ((currNo - prevNo) > 1) {
					compactSortedStr.append(":");
					compactSortedStr.append(prevNo);
					compactSortedStr.append(",").append(currNo);
				}
				prevNo = currNo;
			}
			compactSortedStr.append(":").append(prevNo);
		}
		return compactSortedStr.toString();
	}

	public static void main(String[] args) {
		//System.out.println(compactAndSort("1325376000000: 1330560000000, 1328054400000: 1338508800000, 1343779200000: 1354320000000, 1354320000000: 1417392000000"));
		System.out.println(compactAndSort("3:5,4:6,5:7,1:20"));
	}
}
