package by.epam.level02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 7. Сформировать квадратную матрицу порядка N по правилу: 
 *    A[I,J]=sin(I^2 - J^2/N)
 *    и подсчитать количество положительных элементов в ней.
 */
public class Task17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Input number N ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		int sum = 0;
		double[][] array = new double[n][n];
		System.out.println("Create the matrix");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.sin(i * i + j * j);
				System.out.print(array[i][j] + " ");

				if (array[i][j] > 0) {
					sum++;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The count of positive numbers is " + sum);
	}
}
/* Input number N 
   5
   Create the matrix
   0.0 0.8414709848078965 -0.7568024953079282 0.4121184852417566 -0.2879033166650653 
   0.8414709848078965 0.9092974268256817 -0.9589242746631385 -0.5440211108893698 -0.9613974918795568 
   -0.7568024953079282 -0.9589242746631385 0.9893582466233818 0.4201670368266409 0.9129452507276277 
   0.4121184852417566 -0.5440211108893698 0.4201670368266409 -0.750987246771676 -0.13235175009777303 
   -0.2879033166650653 -0.9613974918795568 0.9129452507276277 -0.13235175009777303 0.5514266812416906 

   The count of positive numbers is 11
 */



