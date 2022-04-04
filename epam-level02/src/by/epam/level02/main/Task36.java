package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

 */
public class Task36 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 16;
		int d = 26;
		System.out.println("The largest common divisor is " + nod(a, b, c, d));
	}

	public static int nod(int a, int b, int c, int d) {
		int nod = 1;
		for (int i = 1; i <= a && i <= b && i <= c && i <= d; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
				nod = i;
			}
		}
		return nod;
	}
}
// The largest common divisor is 2
