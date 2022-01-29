package by.epam.level02.main;

import java.util.Arrays;
import java.util.Random;

/*
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в 
 *     которых число 5 встречается три и более раз
 */
public class Task21 {

	public static void main(String[] args) {
		System.out.println("Create the matrix");
		int[][] array = new int[10][20];

		creatMatrix(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("The line(s) is ");
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.print(i + " ");
			}
		}
	}

	public static void creatMatrix(int[][] array) {
		Random rn = new Random();
		int minValueArr = 0;
		int maxValueArr = 15;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rn.nextInt((maxValueArr - minValueArr) + 1) + minValueArr;

			}
		}
	}
}