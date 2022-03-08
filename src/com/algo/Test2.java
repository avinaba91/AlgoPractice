package com.algo;
public class Test2 {

	/*
	 * public static int solution(String S) { int length = S.length(); int maxInt =
	 * 0; for (int i = 0 ; i < length-1; i++) { char val = S.charAt(i); char nextVal
	 * = S.charAt(i+1); String numberStr = new
	 * StringBuilder().append(String.valueOf(val)).append(String.valueOf(nextVal)).
	 * toString(); int twoDigitNumber = Integer.parseInt(numberStr); if
	 * (twoDigitNumber > maxInt) { maxInt = twoDigitNumber; } }
	 * 
	 * return maxInt; }
	 */

	public int getSumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		return sum;
	}

	public int solution(int[] A) {
		int maxSum = -1;
		for (int i = 0; i < A.length; i++) {
			int initialNumber = A[i];
			int sumInitialNumberDigits = getSumOfDigits(initialNumber);
			for (int j = i+1; j < A.length; j++) {
				int pairedNumber = A[j];
				int sumPairdedNumberDigits = getSumOfDigits(pairedNumber);
				if (sumInitialNumberDigits == sumPairdedNumberDigits) {
					int pairedSum = initialNumber + pairedNumber;
					if (pairedSum > maxSum) {
						maxSum = pairedSum;
					}
				}
			}
			
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] A = { 51,32,43 };
		System.out.println(solution(A));
	}

}
