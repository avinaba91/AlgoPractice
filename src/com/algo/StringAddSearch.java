package com.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAddSearch {

	private StringAddSearch() {

	}

	private static Map<String, List<String>> db = null;

	public static void addToDB(String x) {
		if (db == null) {
			synchronized (StringAddSearch.class) {
				if (db == null) {
					db = new HashMap<>();
				}
			}
		}
		add(x);
	}

	private static void add(String x) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < x.length(); i++) {
			sb.append(String.valueOf(x.charAt(i)));
			synchronized (StringAddSearch.class) {
				List<String> list = db.get(sb.toString().toLowerCase());
				if (list == null) {
					list = new ArrayList<>();
				}
				list.add(x);
				db.put(sb.toString().toLowerCase(), list);
			}
		}
	}

	public static List<String> searchStrings(String x) {
		return db.get(x.toLowerCase());
	}

	public static void main(String[] args) {
		//XX, XXY, XXX, YYX
		addToDB("XX");
		addToDB("XXY");
		addToDB("XXX");
		addToDB("YYX");
		System.out.println(db);
		System.out.println("Searched String: " + searchStrings("X"));


	}

}
