package by.epam.level02.main;

import java.util.Random;

/*
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Task23 {

	public static void main(String[] args) {
		System.out.println("Create the matrix");
		int[][] array = new int[7][7];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(9);

				System.out.print(array[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("Create the matrix with increasing columns");
		increasArrayColumn(array);

		System.out.println();
		System.out.println("Create the matrix with decreasing columns");
		decreasArrayColumn(array);
	}

	public static void increasArrayColumn(int[][] array) {
		for (int x = 0; x < array.length; x++) {
			System.out.println();
			for (int y = 0; y < array[x].length; y++) {
				int minValue = x;
				for (int k = minValue; k < array[x].length; k++) {
					if (array[minValue][y] > array[k][y]) {
						minValue = k;
					}
				}
				int temp = array[x][y];
				array[x][y] = array[minValue][y];
				array[minValue][y] = temp;
				System.out.print(array[x][y] + " ");
			}
		}
	}

	public static void decreasArrayColumn(int[][] array) {
		for (int x = 0; x < array.length; x++) {
			System.out.println();
			for (int y = 0; y < array[x].length; y++) {
				int maxValue = x;
				for (int k = maxValue; k < array[x].length; k++) {
					if (array[maxValue][y] < array[k][y]) {
						maxValue = k;
					}
				}
				int temp = array[x][y];
				array[x][y] = array[maxValue][y];
				array[maxValue][y] = temp;
				System.out.print(array[x][y] + " ");
			}
		}
	}
}

/*  Create the matrix

2 2 7 8 6 5 2 
8 5 6 6 1 3 0 
2 0 2 5 7 4 6 
2 6 5 1 3 0 0 
8 1 2 0 2 5 4 
7 8 4 6 4 1 5 
5 0 4 6 4 5 1 
Create the matrix with increasing columns

2 0 2 0 1 0 0 
2 0 2 1 2 1 0 
2 1 4 5 3 3 1 
5 2 4 6 4 4 2 
7 5 5 6 4 5 4 
8 6 6 6 6 5 5 
8 8 7 8 7 5 6 
Create the matrix with decreasing columns

8 8 7 8 7 5 6 
8 6 6 6 6 5 5 
7 5 5 6 4 5 4 
5 2 4 6 4 4 2 
2 1 4 5 3 3 1 
2 0 2 1 2 1 0 
2 0 2 0 1 0 0 
 
 */

