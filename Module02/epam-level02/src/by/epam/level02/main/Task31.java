package by.epam.level02.main;

import java.util.Arrays;

/*
 *  Одномерные массивы. Сортировки
5.  Сортировка вставками. Дана последовательность чисел a1 ,a2 , ...,an. Требуется переставить 
    числа в порядке возрастания. Делается это следующим образом. Пусть a1 ,a2 ,... ,ai - 
    упорядоченная последовательность, т. е. a1 <= a2 <=... an. Берется следующее число ai+1 и 
    вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. 
    Процесс производится до тех пор, пока все элементы от i +1 до n
    не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть 
    производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task31 {
	public static void main(String[] args) {
		int a[] = { 6, 4, 2, 78, 56, 90, 23, 12 };
		int n = a.length;
		int loc, j, k, selected;

		for (int i = 1; i < n; ++i) {
			j = i - 1;
			selected = a[i];

			loc = binarySearch(a, selected, 0, j);

			while (j >= loc) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = selected;
		}
		System.out.println("Sorted array:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static int binarySearch(int a[], int item, int low, int high) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (item == a[mid])
				return mid + 1;
			else if (item > a[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return low;
	}
}

// Sorted array:
// 2 4 6 12 23 56 78 90