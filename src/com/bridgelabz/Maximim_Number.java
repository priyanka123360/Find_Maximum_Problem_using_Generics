package com.bridgelabz;

public class Maximim_Number {
	static String[] array = {  "Apple","Banana", "Peach" };

	public static void main(String[] args) {
		String max;

		max = Maximim_Number(array[0], array[1], array[2]);
		display();

		System.out.println("Maximum : " + max);

	}

	private static void display() {
		for (String a : array) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}

	private static String Maximim_Number(String a, String b, String c) {
		String max;
		if (a.compareTo(b) > 0 || a.compareTo(c) > 0) {
			max = a;
		} else if (b.compareTo(c) > 0) {
			max = b;
		} else
			max = c;
		return max;
	}
}
