package com.algo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lamda {

	public static List<List<Integer>> filterData(List<List<Integer>> lists) {
		int tailingNo = lists.size();
		lists.stream().map(list -> {
			list.stream().filter(i -> !i.toString().endsWith(String.valueOf(tailingNo))).map(i -> i * i)
					.collect(Collectors.toList());
		});
		System.out.println(lists);
		return lists;

	}

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int totalNo = Integer.parseInt(sc.nextLine());
		List<List<Integer>> li = new ArrayList<>(totalNo);
		int j = 0;
		while (j < totalNo) {
			String line = sc.nextLine();
			li.add(Arrays.asList(line.split(" ")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList()));
			j++;
		}
		li = filterData(li);
		for (List<Integer> l : li)
			for (Integer i : l)
				System.out.println(i);
				
	}

}
