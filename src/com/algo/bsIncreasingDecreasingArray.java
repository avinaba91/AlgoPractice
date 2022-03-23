package com.algo;

public class bsIncreasingDecreasingArray {
	
	
	public static int getIndexVal (int num, int[] arr) {
		int index = -1;
		int increasingIndexPoint = 0;
		int prev = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > prev) {
				prev = arr[i];
				increasingIndexPoint = i;
			} else {
				break;
			}
		}
		System.out.println(increasingIndexPoint);
		index = getIndex(num, arr, 0, increasingIndexPoint);
		if (index > 0 ) {
			return index;
		} else {
			index = getIndex(num, arr, increasingIndexPoint + 1, arr.length - 1);
		}
		return index;
	}
	
	public static int getIndex(int num, int[] arr, int startIndex, int endIndex) {
		int index = -1;
		while (endIndex > startIndex) {
			int mid = (startIndex + (endIndex-1)) / 2;
			if (arr[mid] == num) {
				return mid;
			} else if (num > arr [mid]) {
				startIndex = mid;
			} else {
				endIndex = mid;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int num = 11;
		int[] arr = {21,35,56,13,8,2};
		System.out.println(getIndexVal(num, arr));
		
		//21,35,56,13,8,2

	}

}
