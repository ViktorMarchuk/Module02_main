package by.epam.level02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */
public class Task25 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Create the matrix");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of lines");
		int n = Integer.parseInt(bf.readLine());
		System.out.println("Enter the number of columns");
		int m = Integer.parseInt(bf.readLine());

		Random rm = new Random();
		int maxValue;
		int[][] array = new int[n][m];
		maxValue = array[0][0];

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rm.nextInt(9);
				System.out.print(array[i][j] + " ");
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (maxValue < array[i][j]) {
					maxValue = array[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Create new matrix");
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 != 0) {
					array[i][j] = maxValue;
				}
				System.out.print(array[i][j] + " ");
			}
		}
	}
}
/*Create the matrix
  Enter the number of lines
  5
  Enter the number of columns
  7

  6 8 5 2 4 4 6 
  3 6 5 0 7 0 1 
  8 5 5 3 6 4 0 
  5 0 3 0 7 8 6 
  4 0 5 0 6 7 3 
  Create new matrix

  6 8 8 2 4 4 6 
  8 6 8 0 8 0 8 
  8 8 8 8 6 4 0 
  8 0 8 0 8 8 6 
  4 0 8 0 6 8 8 
 *
 */
