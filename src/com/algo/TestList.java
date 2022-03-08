package com.algo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int count = 0;
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int x = itr.next();
			if (x == 20) {
				itr.remove();
			}
			
		}
		list.forEach(System.out :: println);
	}

}
