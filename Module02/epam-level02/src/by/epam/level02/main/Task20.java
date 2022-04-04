package by.epam.level02.main;

import java.util.Random;

/*
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task20 {

	public static void main(String[] args) {
		System.out.println("Create the matrix");
		int[][] array = new int[6][6];
		
		Random rn = new Random();
		int minValueArr = -3;
		int maxValueArr = 8;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rn.nextInt((maxValueArr - minValueArr) + 1) + minValueArr;
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The positive elements of matrix is");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					if (array[i][j] >= 0) {
						System.out.print(array[i][j] + " ");
					}
				}
			}
		}
	}
}

/*
 Create the matrix
 7  1  6  8  7  7  
 1  8  -2  7  7  5  
 3  5  -1  3  7  4  
 7  2  2  7  -1  6  
 2  5  1  -2  8  1  
 6  5  4  3  1  -3  

 The positive elements of matrix is
 7 8 7 8
*/