package by.epam.level02.main;

import java.util.Arrays;

/*
 * Декомпозиция с использованием методов (подпрограммы)
   15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую 
   последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию
 */
public class Task49 {

	public static void main(String[] args) {
		int[] arr = { 123, 453, 476, 567, 768, 989, 457, 456, 789, 785 };
		System.out.println("Result");
		getNumbers(arr);
	}

	public static void getNumbers(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			int x = arr[j] % 10;
			int x1 = arr[j] / 10;
			int y = x1 % 10;
			int z = arr[j] / 100;
			if (z < y && z < x && y < x) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}
// Result
// 123 567 457 456 789