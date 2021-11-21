package com.bridgelabz;

public class Maximim_Number {
	static Integer[] array = { 9, 2, 4 };

	public static void main(String[] args) {
		int max;

		max = Maximim_Number(array[0], array[1], array[2]);
		display();

		System.out.println("Maximum number : " + max);

	}

	private static void display() {
		for (int a : array) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}

	private static int Maximim_Number(Integer a, Integer b, Integer c) {
		int max;
		if (a.compareTo(b) > 0 || a.compareTo(c) > 0) {
			max = a;
		} else if (b.compareTo(c) > 0) {
			max = b;
		} else
			max = c;
		return max;
	}

}
