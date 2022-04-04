package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 4. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 
   возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи 
   использовать декомпозицию.
 */
public class Task48 {

	public static void main(String[] args) {
		System.out.println("Armstrong numbers from 1 to 1000");
		for (int i = 1; i <= 999; i++) {
			if (i == getNumArm(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static int getNumArm(int n) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		if (n > 0 && n < 10) {
			sum1 = (int) Math.pow(n, 1);
			return sum1;
		}
		if (n >= 10 && n < 100) {
			int x = n / 10;
			int y = n % 10;
			int s1 = (int) Math.pow(x, 2);
			int s2 = (int) Math.pow(y, 2);
			sum2 = s1 + s2;
			return sum2;
		}
		if (n >= 100 && n < 999) {
			int a = n % 10;
			int b = n / 10;
			int c = b % 10;
			int d = n / 100;
			int sumArm1 = (int) Math.pow((a), 3);
			int sumArm2 = (int) Math.pow((c), 3);
			int sumArm3 = (int) Math.pow((d), 3);
			sum3 = sumArm1 + sumArm2 + sumArm3;
			return sum3;
		}
		return sum1;
	}
}
 // Armstrong numbers from 1 to 1000
//  1 2 3 4 5 6 7 8 9 153 370 371 407 