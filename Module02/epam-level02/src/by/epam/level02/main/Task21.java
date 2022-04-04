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
		int[][] array = new int[10][10];

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
		int minValueArr = 1;
		int maxValueArr = 9;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rn.nextInt((maxValueArr - minValueArr) + 1) + minValueArr;

			}
		}
	}
}
/*
Create the matrix

9 7 5 6 1 1 1 7 2 9 
6 6 3 6 2 7 6 4 1 7 
3 4 1 3 3 9 4 5 2 5 
9 9 2 4 3 7 6 5 2 3 
3 1 9 3 8 4 2 6 9 2 
5 9 2 1 9 4 6 4 5 5 
7 7 9 8 8 3 5 7 2 1 
3 9 4 6 2 1 3 8 2 6 
8 8 5 2 5 8 9 3 4 4 
2 4 2 3 8 2 9 7 1 3 
The line(s) is 
5 
*/