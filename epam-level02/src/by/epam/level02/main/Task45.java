package by.epam.level02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task45 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		String n = reader.readLine();
		System.out.println("Enter second number");
		String m = reader.readLine();
		
		char[] x = createArray(n);
		char[] y = createArray(m);
		
		if (x.length > y.length) {
			System.out.println("In number " + n + " more digitals then " + m);
		} else {
			System.out.println("In number " + m + " more digitals then " + n);
		}
	}

	public static char[] createArray(String n) {
		char[] a = n.toCharArray();
		for (int i : a) {

		}
		return a;
	}
}
// Enter first number
// 1245
// Enter second number
// 298476
// In number 298476 more digitals then 1245
