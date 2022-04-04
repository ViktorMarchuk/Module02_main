package by.epam.level02.main;

import java.util.Arrays;

/*
 * Одномерные массивы. Сортировки
   8. Даны дроби p1/q1, p2/q2, ..., pn/qn, (pi, qi натуральные). Составить программу, которая 
   приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */ 
public class Task34 {

	public static void main(String[] args) {
		int[] p = { 1, 2, 2, 1 };  // числитель
		int[] q = { 6, 3, 5, 2 }; // знаменатель
		int[] k = new int[p.length];
		int c = findNOK(q, 0); // общий делитель
		for (int i = 0; i < q.length; i++) {
			k[i] = findNOK(q, i) / q[i];
		}
		int[] num = new int[p.length];
		for (int i = 0; i < p.length; i++) {
			num[i] = k[i] * p[i];
		}
		int i = 0;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (i = 0; i < num.length - 1; i++) {
				if (num[i] > num[i + 1]) {

					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
					sorted = false;
				}
			}
		}
		System.out.println("Result ");
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j] + "/" + c + "  ");
		}
	}

	public static int nod(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int nok(int a, int b) {
		return a * (b / nod(a, b));
	}

	public static int findNOK(int[] a, int result) {
		result = a[0];
		for (int i = 0; i < a.length; i++) {
			result = nok(result, a[i]);
		}
		return result;
	}

	public static void findDivider(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			k = findNOK(a, i) / a[i];
		}
		System.out.println(k + " ");

	}

	public static int[] findNum(int[] a, int[] k, int i) {
		int[] num = new int[a.length];
		for (i = 0; i < a.length; i++) {
			num[i] = k[i] * a[i];
		}
		return num;
	}
}
// Result 
// 5/30  12/30  15/30  20/30