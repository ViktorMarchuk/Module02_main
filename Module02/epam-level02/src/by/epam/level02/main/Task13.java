package by.epam.level02.main;

import java.util.Random;
import java.util.Scanner;

/*
 *  3.Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */
public class Task13 {

	public static void main(String[] args) {
		int[][] array = new int[6][8];

		Random rn = new Random();
		int min = 1;
		int max = 9;

		System.out.println("Create the array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rn.nextInt((max - min) + 1) + min;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Output  column ");
		int k = sc.nextInt();
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i][k] + " ");
		}
		System.out.println();
		System.out.println("Output  line ");
		int p = sc.nextInt();

		for (int j = 0; j < array[p].length; j++) {
			System.out.print(array[p][j] + " ");
		}
		System.out.println();
	}
}

/*Create the array
  1 6 9 6 7 6 1 2 
  2 2 4 9 7 5 5 3 
  5 3 4 6 1 5 4 9 
  8 9 7 7 3 4 8 5 
  2 1 7 7 7 7 2 4 
  6 8 3 8 8 4 8 8 
  Output  column 
  4
  7 7 1 3 7 8 
  Output  line 
  3
  8 9 7 7 3 4 8 5

*/