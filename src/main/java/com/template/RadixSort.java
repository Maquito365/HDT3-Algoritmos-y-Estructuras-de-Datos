package com.template;

public class RadixSort {

	public static void sort(int[] array) {
		if (array == null || array.length < 2) {
			return;
		}

		// Separate negatives and non-negatives
		int negCount = 0;
		for (int v : array) if (v < 0) negCount++;

		int[] neg = new int[negCount];
		int[] pos = new int[array.length - negCount];
		int ni = 0, pi = 0;
		for (int v : array) {
			if (v < 0) neg[ni++] = -v; // store absolute for sorting
			else pos[pi++] = v;
		}

		if (neg.length > 1) radixSortNonNegative(neg);
		if (pos.length > 1) radixSortNonNegative(pos);

		// Reassemble: negatives in reverse order (and negated), then positives
		int idx = 0;
		for (int i = neg.length - 1; i >= 0; i--) {
			array[idx++] = -neg[i];
		}
		for (int v : pos) {
			array[idx++] = v;
		}
	}

	// LSD radix sort for non-negative integers
	private static void radixSortNonNegative(int[] a) {
		int max = 0;
		for (int v : a) if (v > max) max = v;
		if (max == 0) return;

		int[] output = new int[a.length];
		int exp = 1;
		while (max / exp > 0) {
			int[] count = new int[10];
			for (int v : a) {
				int digit = (v / exp) % 10;
				count[digit]++;
			}

			for (int i = 1; i < 10; i++) count[i] += count[i - 1];

			for (int i = a.length - 1; i >= 0; i--) {
				int digit = (a[i] / exp) % 10;
				output[--count[digit]] = a[i];
			}

			System.arraycopy(output, 0, a, 0, a.length);
			exp *= 10;
		}
	}

}
