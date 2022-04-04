package by.epam.level02.main;

import java.util.Arrays;

/*
 *  Одномерные массивы. Сортировки
   6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
   Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, 
   то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются 
   на один элемент назад. Составить алгоритм этой сортировки.
 */
public class Task32 {

	public static void main(String[] args) {
		int[] arr = { 2, 9, 5, 3, 7, 45, 23, 1 };
		int d = arr.length / 2;
		while (d > 0) {
			for (int i = 0; i < arr.length - d; i++) {
				int j = i;
				while (j >= 0 && arr[j] > arr[j + d]) {
					int temp = arr[j];
					arr[j] = arr[j + d];
					arr[j + d] = temp;
					j--;
				}
			}
			d = d / 2;
		}
		System.out.println("Result - " + Arrays.toString(arr));
	}
}
// Result - [1, 2, 3, 5, 7, 9, 23, 45]