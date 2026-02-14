package com.template;

public class GnomeSort {

	public static void sort(int[] array) {
		if (array == null || array.length < 2) {
			return;
		}

		int index = 1;
		while (index < array.length) {
			if (array[index] >= array[index - 1]) {
				index++;
			} else {
				swap(array, index, index - 1);
				if (index > 1) {
					index--;
				} else {
					index++;
				}
			}
		}
	}

	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
