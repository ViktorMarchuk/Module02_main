package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух 
   натуральных чисел:
 * 
 */
public class Task35 {

	public static void main(String[] args) {
		int a = 12;
		int b = 20;
		System.out.println("The largest common divisor is " + nod(a, b));
		System.out.println("The smallest common multiple is " + nok(a, b));
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
}
// The largest common divisor is 4
// The smallest common multiple is 60