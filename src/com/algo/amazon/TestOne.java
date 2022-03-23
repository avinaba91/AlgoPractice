package com.algo.amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestOne {
	
	static String[] dist_queries(int N, int[][] edges, int Q, int[] queries){
	       // Write your code here
	        String[] result = new String[Q];
	        Set<Integer> lengthSet = new HashSet<>();
	        lengthSet.add (1);
	        for (int i = 0; i < edges.length; i++) {
	        	List<Integer> travarsedIndexes = new ArrayList<>();
	        	travarsedIndexes.add(i);
	            lengthSet.add(pathUtil(edges[i][0], 1, edges, travarsedIndexes) + 1);
	            lengthSet.add(pathUtil(edges[i][1], 1, edges, travarsedIndexes) + 1);
	        }
	        for (int i = 0; i < Q; i++) {
	            if (lengthSet.contains(queries[i])) {
	                result[i] = "YES";
	            } else {
	                result[i] = "NO";
	            }
	        }
	        return result;
	    
	    }

	    static int pathUtil (int s, int length, int[][] edges, List<Integer> travarsedIndexes) {
	        for (int i = 0; i < edges.length; i++) {
	            if (!travarsedIndexes.contains(i) ) {
	                if (s == edges[i][0]) {
	                    length ++;
	                    s = edges[i][0];
	                    travarsedIndexes.add(i);
	                    pathUtil (s, length, edges, travarsedIndexes);
	                } else if (s == edges[i][1]) {
	                    length ++;
	                    s = edges[i][1];
	                    travarsedIndexes.add(i);
	                    pathUtil (s, length, edges, travarsedIndexes);
	                }
	            }
	        }
	        return length;
	    }

	public static void main(String[] args) {
		int N = 0;
		int[][] edges = {{1,2}, {1,3}}; 
		int Q = 2;
		int[] queries = {1,3};
		System.out.println(dist_queries(N, edges, Q, queries)[0]);

	}

}
