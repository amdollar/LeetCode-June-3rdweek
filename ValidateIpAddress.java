package com.leetcode.week3;

public class ValidateIpAddress {

	public static void main(String[] args) {
		String ip = "192.178.101.23";
		System.out.println(validIPAddress(ip));
	}

	private static boolean isIPv4(String IP) {
		int cnt = 0;
		for (char ch : IP.toCharArray()) {
			if (ch == '.') {
				cnt++;
			}
		}

		if (cnt != 3) {
			return false;
		}

		String[] fields = IP.split("\\.");
		if (fields.length != 4) {
			return false;
		}

		for (String field : fields) {
			if (field.isEmpty() || field.length() > 3) {
				return false;
			}

			int sz = field.length();
			for (int i = 0; i < sz; ++i) {
				if (!Character.isDigit(field.charAt(i))) {
					return false;
				}
			}

			int num = Integer.valueOf(field);
			if (!String.valueOf(num).equals(field) || num < 0 || num > 255) {
				return false;
			}
		}

		return true;
	}

	private static boolean isIPv6(String IP) {
		int cnt = 0;
		for (char ch : IP.toCharArray()) {
			if (ch == ':') {
				cnt++;
			}
		}

		if (cnt != 7) {
			return false;
		}

		String[] fields = IP.split(":");
		if (fields.length != 8) {
			return false;
		}

		for (String field : fields) {
			if (field.isEmpty() || field.length() > 4) {
				return false;
			}

			int sz = field.length();
			for (int i = 0; i < sz; ++i) {
				if (!Character.isDigit(field.charAt(i)) && (field.charAt(i) < 'A' || field.charAt(i) > 'F')) {
					return false;
				}
			}
		}

		return true;
	}

	public static String validIPAddress(String IP) {
		if (isIPv4(IP)) {
			return "IPv4";
		}

		if (isIPv6(IP.toUpperCase())) {
			return "IPv6";
		}

		return "Neither";
	}

}
