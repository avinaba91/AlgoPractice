package com.algo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
	
	static int maxEvenFactors(long n) { 
        int maxEvenFactor = 2; 
        if (n % 2 != 0) { 
            return -1; 
        } 
        for (int i = 2; i <= (n/2); i += 2) { 
            if (n % i == 0) { 
                maxEvenFactor = i; 
            } 
        } 
        return maxEvenFactor; 
    } 

	static int solve(int N, int M) {
		int cost = 0;
		while (N < M) {
			int D = maxEvenFactors(N);
			if (D == -1) {
				return -1;
			}
			cost += (N/D);
			N = N + D;
			if (N == M) {
				return cost;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(solve(9, 17));
	}
}
