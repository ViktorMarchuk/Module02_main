package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
   Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов 
   массива с номерами от k до m.
 */
public class Task42 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		int k = 0;
		int m = k + 3;
		sum1 = calculateSum(arr, k, m);
		System.out.println("The first amount - " + sum1);

		k = 2;
		m = k + 3;
		sum2 = calculateSum(arr, k, m);
		System.out.println("The second amount -  " + sum2);

		k = 3;
		m = k + 3;
		sum3 = calculateSum(arr, k, m);
		System.out.println("The third amount - " + sum3);
	}

	public static int calculateSum(int[] a, int k, int m) {
		int sum = 0;
		for (int i = k; i < m; i++) {
			sum += a[i];
		}
		return sum;
	}

}

// The first amount - 6
// The second amount -  12
// The third amount - 15
