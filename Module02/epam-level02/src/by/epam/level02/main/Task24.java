package by.epam.level02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число 
       единиц равно номеру столбца.

 */
public class Task24 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Create the matrix");

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(buffer.readLine()); // колличество строк
		int n = Integer.parseInt(buffer.readLine()); // колличество столбцов

		int[][] array = new int[m][n];
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				if (i <= j) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}
				System.out.print(array[i][j] + " ");
			}
		}
	}
}

/*  Output 
    1 1 1 1 1 1 
    0 1 1 1 1 1 
    0 0 1 1 1 1 
    0 0 0 1 1 1 
    0 0 0 0 1 1 
    0 0 0 0 0 1
   
 */