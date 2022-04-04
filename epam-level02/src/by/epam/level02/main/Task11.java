package by.epam.level02.main;

import java.util.Random;

/*
 *    Задачи. Массивы массивов
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task11 {

	public static void main(String[] args) {
		int[][] array = new int[6][10];
		int min = 1;
		int max = 9;
		System.out.println("The original array after creation with helping method Random :");
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rn.nextInt((max - min) + 1) + min;

				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Result :");
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j = j + 2) {
				if (array[0][j] > array[array.length - 1][j]) {

					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}

// The original array after creation with helping method Random :
// 2 9 4 8 4 3 5 2 9 7 
// 6 3 3 4 5 2 6 6 3 7 
// 1 3 7 7 2 1 2 7 7 8 
// 7 4 3 6 9 4 2 3 8 1 
// 7 2 5 2 9 5 9 5 1 4 
// 1 5 1 9 3 6 6 4 5 5 
 
// Result :
// 9 7 
// 3 7 
// 3 8 
// 4 1 
// 2 4 
// 5 5 

