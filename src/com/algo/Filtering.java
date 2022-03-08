package com.algo;
import java.util.List;

public class Filtering {

	@FunctionalInterface
	interface ReadInput {
		List<List<Integer>> readInput();
	}

	@FunctionalInterface
	interface FilterData {
		List<List<Integer>> filterData(List<List<Integer>> li);
	}

	class MyOperations {

		static ReadInput readInput() {
			 return () -> {
				 
			 });

		}

		static FilterData filterData() {

		}

	}

	public static void main(String[] args) throws Exception {
		ReadInput readInput;
		readInput = MyOperations.readInput();
		List<List<Integer>> li = readInput.readInput();
		FilterData filterData;
		filterData = MyOperations.filterData();
		li = filterData.filterData(li);
		for (List<Integer> l : li)
			for (Integer i : l)
				System.out.println(i);
	}
}