package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task41 {

	public static void main(String[] args) {
		System.out.println("Sum of factorials of odd numbers is " + calculateSum());

	}

	public static int calculateFactorial(int a) {
		int res = 1;
		for (int j = 1; j <= a; j++) {
			res = res * j;
		}
		return res;
	}

	public static int calculateSum() {
		int sum = 0;
		for (int i = 1; i <= 9; i += 2) {
			sum += calculateFactorial(i);
		}
		return sum;
	}
}
// Sum of factorials of odd numbers is 368047