package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
   которое меньше максимального элемента массива, но больше всех других элементов).
 * 
 */
public class Task39 {

	public static void main(String[] args) {
		int[] arr = { 32, 2, 5, 4, 7, 5, 1 }; // исходный массив

		int i = 0;
		int secondMaxElement = 0;
		System.out.println("Sorted array");
		sortArr(arr, i);
		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			secondMaxElement = arr[6 - 1];
		}
		System.out.print("The second max element is " + secondMaxElement);
	}

	public static void sortArr(int[] a, int i) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					isSorted = false;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}
}

// Sorted array
// 1 2 4 5 5 7 32 
// The second max element is 7