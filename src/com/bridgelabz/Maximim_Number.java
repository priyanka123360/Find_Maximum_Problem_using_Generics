package com.bridgelabz;

public class Maximim_Number {
	private static <T extends Comparable> void getMaximum(T x, T y, T z) {

		T max = x;
		if (y.compareTo(x) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		System.out.println("Maximum ::" + max);
	}

	public static void main(String[] args) {
		System.out.println("The Maximum Number Using Generic Logic.");
		Integer x = 9, y = 2, z = 4;
		Float d = 1.9f, e = 1.2f, f = 1.4f;
		String s1 = "Peach", s2 = "Apple", s3 = "Banana";

		Maximim_Number max = new Maximim_Number();
		max.getMaximum(x, y, z);
		max.getMaximum(d, e, f);
		max.getMaximum(s1, s2, s3);
	}
}