package by.epam.level02.main;

import java.util.Arrays;

/*
 * 3. Сортировка выбором. Дана последовательность чисел a1<a2...<an
   Требуется переставить элементы так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший 
   элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура 
   повторяется. Написать алгоритм сортировки выбором
 */
public class Task29 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] < max) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = max;
		}
		System.out.println("Result \n" + Arrays.toString(arr));
	}
}
// Result 
// [7, 6, 5, 4, 3, 2, 1]