package com.bridgelabz;

public class Maximim_Number {
	static Float[] array = { 1.9f, 1.2f, 1.4f };

	public static void main(String[] args) {
		Float max;

		max = Maximim_Number(array[0], array[1], array[2]);
		display();

		System.out.println("Maximum number : " + max);

	}

	private static void display() {
		for (Float a : array) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}

	private static float Maximim_Number(Float a, Float b, Float c) {
		Float max;
		if (a.compareTo(b) > 0 || a.compareTo(c) > 0) {
			max = a;
		} else if (b.compareTo(c) > 0) {
			max = b;
		} else
			max = c;
		return max;
	}
}
