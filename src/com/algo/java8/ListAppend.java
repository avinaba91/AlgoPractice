package com.algo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListAppend {
	
	public static void main(String[] args) {
		List<Integer> newList = new ArrayList<Integer>();
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(4,5,6,7,8);
		List<Integer> list3 = Arrays.asList(9,10);
		List<Integer> list4 = Arrays.asList(100,4,5,102,99,56,0,32,1);
		
		//list4.stream().sorted().forEach(x -> System.out.println(x));
		
		//Comparator<Integer> c = (a,b) -> (a-b);
		//Collections.sort(list4, c);
		
		//list4.forEach(x -> System.out.println(x));
		
		System.out.println(list4.stream().max((a,b)->a-b).get());
		list4.stream().sorted((a,b)->a-b).forEach(x-> System.out.println(x));
		
		/*List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		finalList.add(list1);
		finalList.add(list2);
		finalList.add(list3);
		
		finalList.stream().forEach(list -> {
			list.stream().forEach(x -> newList.add(x));
		});
		
		newList.forEach(x -> System.out.println(x));
		
		List<Integer> flList = newList.stream().map(x->x*5).collect(Collectors.toList());
		flList.forEach(x -> System.out.println(x));
		*/

	}

}
