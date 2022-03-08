package com.algo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalcAmount {

	public static long calculateAmount(List<Integer> prices) {
		long totalAmount = 0;
		long minimumPriorPrice = 0;
		boolean firstTime = true;
		for (int price : prices) {
			long discountedAmount = price - minimumPriorPrice;
			if (discountedAmount < 0) {
				discountedAmount = 0;
			}
			totalAmount = totalAmount + discountedAmount;
			if (firstTime) {
				minimumPriorPrice = price;
				firstTime = false;
			} else {
				if (minimumPriorPrice > price) {
					minimumPriorPrice = price;
				}
			}
		}
		return totalAmount;
	}

	public static void main(String[] args) {
		List<Integer> prices = new ArrayList<Integer>(Arrays.asList(2,5,1,4));
		System.out.println(calculateAmount(prices));

	}

}
