package by.epam.level02.main;

import java.util.Arrays;

/*
 * Одномерные массивы. Сортировки
 * 4. Сортировка обменами. Дана последовательность чисел 
   a1<=a2....<=an.Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа 
   ai и аi+1. Если ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. 
   Составить алгоритм сортировки, подсчитывая при этом количества перестановок
 */
public class Task30 {

	public static void main(String[] args) {
		int[] arr = { 4, 56, 2, 3, 6, 54, 1, 5 };
		boolean isSorted = false;
		int count = 0;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSorted = false;
					count++;
				}
			}
		}
		System.out.println("Sorted array\n" + Arrays.toString(arr));
		System.out.println("Number of permutations " + count);
	}
}
// Sorted array
// [1, 2, 3, 4, 5, 6, 54, 56]
// Number of permutations 15