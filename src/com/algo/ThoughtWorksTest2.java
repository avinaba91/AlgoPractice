package com.algo;

public class ThoughtWorksTest2 {
	
	static long solve(int N, int[] A, int[] B){
	        long result = -1;
	        if (isSolvable(N, A, B)) {
	        	result = N - 1;
	        }
	        return result;
	    
	    }
	
	static boolean isSolvable(int N, int[] A, int[] B) {
		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i < N; i++) {
			sumA = sumA + A[i];
			sumB = sumB + B[i];
		}
		if (sumA == sumB) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] A = {3,3};
		int[] B = {9, 8};
		int N = 2;
		System.out.println(solve(N, A, B));

	}

}
