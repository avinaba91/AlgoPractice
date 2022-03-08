package com.algo;

public class GoogleTest {
	
	public static int solution (int N, int[] A) {
		int closestNumber = 999999999;
		int orgValue = 9999999;
		for (int i = 0; i < N; i++) {
			int value = A[i];
			int absVal = Math.abs(value);
			if (absVal == closestNumber && value > 0) {
				orgValue = value;
			}
			if (absVal < closestNumber) {
				closestNumber = absVal;
				orgValue = value;
			}
		}
		return orgValue;
	}
	
	
	public static void main(String[] args) {
		int[] A = {100,
				-99, 99, -98, 98, -97, 97, -96, 96, -95, 95, -94, 94, -93, 93, -92, 92, -91, 91, -90, 90 };
		int N = 21;
		System.out.println(solution(N, A));
	}
}
