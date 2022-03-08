package com.algo;
import java.util.HashMap;
import java.util.Map;

public class BestSkill {
	
	int findBestSkill(int[] arr) {
		Map<Integer, Integer> apperanceCount = new HashMap<>();
		for (int i : arr) {
			Integer count = apperanceCount.get(i);
			if (count == null) {
				count = 0;
			}
			String s = "avinaba";
			s.
			apperanceCount.put(i, ++count);
		}
		return validateMap(apperanceCount);
	}
	
	int validateMap(Map<Integer, Integer> apperanceCount) {
		int skillNumber = -1;
		for (int key : apperanceCount.keySet()) {
			if (key == apperanceCount.get(key)) {
				if (key > skillNumber) {
					skillNumber = key;
				}
			}
		}
		return skillNumber;
	}

	public static void main(String[] args) {
		BestSkill bestSkill = new BestSkill();
		int[] arr = new int[]{ 5 };
		System.out.println(bestSkill.findBestSkill(arr));

	}

}
