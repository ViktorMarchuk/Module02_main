package by.epam.level02.main;

import java.util.Arrays;

/*
 *  Одномерные массивы. Сортировки
 * 1.Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в 
   один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя 
   дополнительный массив
 */
public class Task27 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 8 };
		int[] b = { 4, 16, 1, 2, 3, 22 };
		int k = 3;
		int[] c = insertArray(a, b, k);
		System.out.println("Result \n" + Arrays.toString(c));

	}

	public static int[] insertArray(int[] arr1, int[] arr2, int k) {
		int count = 0;

		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr3.length; i++) {
			if (i >= k && count < arr2.length) {
				arr3[i] = arr2[i - k];
				count++;

			} else {
				arr3[i] = arr1[i - count];

			}
		}
		return arr3;
	}
}
// Result
// [1, 2, 3, 4, 16, 1, 2, 3, 22, 4, 8]
