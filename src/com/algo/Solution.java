package com.algo;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
	private static final Scanner scan = new Scanner(System.in);

	public static void readFile(String file) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringBuilder sb = new StringBuilder();
		String st;
		while ((st = br.readLine()) != null) {
			sb.append(st).append("\n");
		}
		findTimeStamp(sb.toString(), file);
		br.close();
	}

	public static void findTimeStamp(String record, String file) throws Exception {
		// Creating a regular expression for the records
		final String regex = "^(\\S+) (\\S+) (\\S+) " + "\\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(\\S+)"
				+ " (\\S+)\\s*(\\S+)?\\s*\" (\\d{3}) (\\S+)";

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(record);
		Map<String, Integer> countTime = new HashMap<String, Integer>();
		while (matcher.find()) {
			String time = matcher.group(4);
			if (countTime.containsKey(time)) {
				countTime.put(time, countTime.get(time) + 1);
			} else {
				countTime.put(time, 1);
			}
		}
		String outFile = new StringBuilder("req_").append(file).toString();
		StringBuilder outStr = new StringBuilder();
		countTime.forEach((timestamp, count) -> {
			if (count > 1) {
				String[] time = timestamp.split(" ");
				outStr.append(time[0]).append("\n");
			}
		});
		// writeFile(outFile, outStr.toString());
	}

	public static void writeFile(int file, int str) throws IOException {

	}

	public static void main(String args[]) throws Exception {
		short s = 10;
		if (s = 12) {

		}
		writeFile(s, 12);
	}
}