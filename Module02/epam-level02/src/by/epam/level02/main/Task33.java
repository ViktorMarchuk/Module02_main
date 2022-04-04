package by.epam.level02.main;

/*
 * Одномерные массивы. Сортировки
   7. Пусть даны две неубывающие последовательности действительных чисел
   a1 <= a2 <= an и b1 <= b2 <= bm.
   Требуется указать те места, на которые нужно вставлять элементы последовательности m
   b1 <= b2 <= bm 
   в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task33 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 6, 7, 10 };
		int[] arr2 = { 2, 4, 8 };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				while (j >= 0) {
					if (arr2[i] >= arr1[j] && arr2[i] < arr1[j + 1]) {
						System.out.println("Element " + arr2[i] + " arr2 insert after index " + j + " in arr1");
					}
					break;
				}
			}
		}
	}
}
// Element 2 arr2 insert after index 0 in arr1
// Element 4 arr2 insert after index 1 in arr1
// Element 8 arr2 insert after index 4 in arr1