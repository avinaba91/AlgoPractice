package com.algo;

import java.util.ArrayList;
import java.util.List;

public class HighestProduct {
	
	
	/** Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

	{6, -3, -10, 0, 2}
	[6, -3, -10] which gives product as 180.


	{6}
	{6, -3}
	{6, -3, -10}
	{6, -3, -10, 0}
	**/

	public int product (int[] arr) {
		int highestSum = -999999999;
	  List<Integer> finallist = new ArrayList<>();
	  for (int i = 0; i < arr.length; i++) {
	  	int product = 1;
	    List<Integer> newlist = new ArrayList<>();
	  	for (int j = 0; j <=i ; j++) {
	    	product = product * a[j];
	      newlist.add(a[j]);
	    }
	    if (product > highestSum) {
	    	finallist = newlist;
	      highestSum = product;
	    }
	  }
	  int finalProduct = 1;
	  for (int x: finallist) {
	  	finalProduct = finalProduct * x;
	  }
	  return finalProduct;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
