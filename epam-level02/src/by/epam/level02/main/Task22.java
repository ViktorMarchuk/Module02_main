package by.epam.level02.main;

import java.util.Random;

/*
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

public class Task22 {

	public static void main(String[] args) {

		System.out.println("Create the matrix");
		int[][] array = new int[6][6];
		Random rn = new Random();

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rn.nextInt(9);
				System.out.print(array[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("Create the matrix with increasing line ");
		arrayIncreasing(array);

		System.out.println();
		System.out.println("Create the matrix with decreasing line ");
		arrayDecreasing(array);
	}

	public static void arrayIncreasing(int[][] array) {

		for (int x = 0; x < array.length; x++) {
			System.out.println();
			for (int y = 0; y < array[x].length; y++) {
				int minValue = y;
				for (int k = minValue; k < array[x].length; k++) {
					if (array[x][minValue] > array[x][k]) {
						minValue = k;
					}
				}
				int temp = array[x][y];
				array[x][y] = array[x][minValue];
				array[x][minValue] = temp;

				System.out.print(array[x][y] + " ");
			}
		}
	}

	public static void arrayDecreasing(int[][] array) {

		for (int x = 0; x < array.length; x++) {
			System.out.println();
			for (int y = 0; y < array[x].length; y++) {
				int maxValue = y;
				for (int k = y; k < array.length; k++) {
					if (array[x][maxValue] < array[x][k]) {
						maxValue = k;
					}
				}
				int temp = array[x][y];
				array[x][y] = array[x][maxValue];
				array[x][maxValue] = temp;

				System.out.print(array[x][y] + " ");
			}
		}
	}
}
/*
Create the matrix

1 6 2 7 3 2 
5 7 6 0 1 0 
4 2 1 4 3 6 
1 0 7 3 5 1 
5 5 2 5 1 2 
1 1 6 4 1 3 
Create the matrix with increasing line 

1 2 2 3 6 7 
0 0 1 5 6 7 
1 2 3 4 4 6 
0 1 1 3 5 7 
1 2 2 5 5 5 
1 1 1 3 4 6 
Create the matrix with decreasing line 

7 6 3 2 2 1 
7 6 5 1 0 0 
6 4 4 3 2 1 
7 5 3 1 1 0 
5 5 5 2 2 1 
6 4 3 1 1 1 
*/