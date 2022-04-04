package by.epam.level02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Декомпозиция с использованием методов (подпрограммы)
  17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких 
  действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
 */
public class Task51 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a three-digit number");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		System.out.println("Number of operations " + getQuantity(n));
	}

	public static int getSumNumber(int n) { // парсим 3-х значное число и находим сумму цифр,входящих в число.
		int x = n % 10;
		int x1 = n / 10;
		int y = x1 % 10;
		int z = n / 100;
		int sum = x + y + z;
		return sum;
	}

	public static int getQuantity(int n) {
		int sum = getSumNumber(n);
		int count = 0;
		while (n > 0) {
			n = n - sum;
			count++;
		}
		return count;
	}
}

// Enter a three-digit number
// 345
// Number of operations 29
