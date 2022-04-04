package by.epam.level02.main;

import java.util.Arrays;

/*
 * 2. Одномерные массивы. Сортировки
 *  Даны две последовательности  a1 <= a2 <= an и b1 <= b2 <= bm . Образовать из них новую последовательность 
    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
 */
public class Task28 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] arr1 = { 2, 4, 5, 7, 9 };
		int[] arr3 = new int[arr.length + arr1.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
			count++;
		}
		for (int i = 0; i < arr1.length; i++) {
			arr3[count++] = arr1[i];
		}
		for (int i = 0; i < arr3.length; i++) {
		}
		System.out.println("Unsorted array \n" + Arrays.toString(arr3));

		System.out.println("Sorted array");
		sortArray(arr3);
		System.out.println(Arrays.toString(arr3));
	}

	public static void sortArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int current = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > current) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = current;
		}
	}
}
// Unsorted array 
// [1, 2, 3, 4, 5, 6, 2, 4, 5, 7, 9]
// Sorted array
// [1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 9]