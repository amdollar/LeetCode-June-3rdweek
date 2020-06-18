package com.leetcode.week3;

public class HIndexII {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 3, 5, 6 };
		System.out.println(hIndex(arr));

	}

	public static int hIndex(int[] citations) {
		int idx = 0, n = citations.length;
		for (int c : citations) {
			if (c >= n - idx)
				return n - idx;
			else
				idx++;
		}
		return 0;
	}
}
