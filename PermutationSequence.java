package com.leetcode.week3;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

	public static void main(String[] args) {

		int range = 3;
		int k = 3;
		System.out.println(getPermutation(range, k));

	}

	public static String getPermutation(int n, int k) {
		k--;
		int mod = 1;
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; ++i) {
			list.add(i);
			mod *= i;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; ++i) {
			mod /= (n - i + 1);
			int idx = k / mod;
			sb.append(list.remove(idx));
			k = k % mod;
		}
		return sb.toString();
	}
}
