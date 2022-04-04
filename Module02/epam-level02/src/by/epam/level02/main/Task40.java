package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task40 {

	public static void main(String[] args) {
		int a = 8;
		int b = 6;
		int c = 4;
		System.out.println("Three numbers are given  " + a + ", " + b + ", " + c);
		if (search_NOD(a, b, c) == 1) {
			System.out.print("These numbers are mutually prime");
		} else {
			System.out.print("These numbers are not mutually prime");
		}
	}

	public static int search_NOD(int a, int b, int c) {
		int result = 0;
		for (int i = 1; i < a && i < b && i < c; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				result = i;
			}
		}
		return result;
	}
}

// Three numbers are given  8, 6, 4
// These numbers are not mutually prime