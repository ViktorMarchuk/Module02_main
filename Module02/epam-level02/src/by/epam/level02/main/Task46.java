package by.epam.level02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого 
   являются числа, сумма цифр которых равна К и которые не большее N
 */
public class Task46 {

	public static void main(String[] args) throws IOException {
		int k = 39;
		int n = 42;
		int[] arr = new int[10];

		System.out.println("Created array of random numbers " + Arrays.toString(getRandom(arr)));
		System.out.println("Amount " + getSum(arr));

		if (getSum(arr) == k && getSum(arr) < n) {
			System.out.println("The array found");
		} else {
			System.out.println("The specified array has not been found yet");
		}
	}

	public static int[] getRandom(int[] a) {
		if (a == null) {
			return a;
		}
		Random rn = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rn.nextInt(10);
		}
		return a;
	}

	public static int getSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
// Created array of random numbers [3, 9, 3, 0, 0, 0, 4, 6, 7, 7]
// Amount 39
// The array found 
