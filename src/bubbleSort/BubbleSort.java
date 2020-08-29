package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 3, 5, 2, 9, 8, 4, 6, 1, 10, 7};
		for (int num : a) {
			System.out.print(num + ",");

		}

		int count;
		do {
			count = 0;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					count++;
				}
			}
		}

		while (count > 0);
		    System.out.println();

		for (int num : a) {
			System.out.print(num + ",");

		}

	}

}
