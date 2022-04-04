package by.epam.level02.main;
/*
 * Декомпозиция с использованием методов (подпрограммы)

 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
   Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для 
   решения задачи использовать декомпозицию

 */

public class Task47 {

	public static void main(String[] args) {
		System.out.println("Prime numbers");
		getPrimeNumbers(100);
	}

	public static void getPrimeNumbers(int n) {
		int i = 0;
		for (i = 3; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
	}
}
