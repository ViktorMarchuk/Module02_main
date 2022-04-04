package by.epam.level02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
   также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 * 
 */
public class Task50 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		String n = reader.readLine();

		System.out.println("Sum of odd numbers " + getSumOddNumbers(parseNumber(n)));
		System.out.println("Count of even digits is " + countEvenDigits(parseNumber(n)));

	}

	public static int[] parseNumber(String n) {
		char[] ch = n.toCharArray();
		int[] arr = new int[ch.length];
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(String.valueOf(n.charAt(i)).toString());
		}
		return arr;
	}

	public static int getSumOddNumbers(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				sum += a[i];
			}
		}
		return sum;
	}

	public static int countEvenDigits(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}

// Enter the number
// 8746254
// Sum of odd numbers 12
// Count of even digits is 5
