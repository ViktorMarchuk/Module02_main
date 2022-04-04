package by.epam.level02.main;

import java.util.Arrays;

/*
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых 
являются простыми числами.
 */
public class Task06 {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 2, 4, 6, 3, 5, 7, 89, 23, 54, 22 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1 && arr[i] % 3 != 0 || arr[i] == 2 || arr[i] == 3) {
				System.out.println("Ordinar numbers that are simple numbers " + i + " ");
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("The sum of number is " + sum);
	}
}
// Ordinar numbers that are simple numbers 7 

// The sum of number is 129