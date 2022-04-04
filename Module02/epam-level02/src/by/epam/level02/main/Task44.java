package by.epam.level02.main;

 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/*
 *Декомпозиция с использованием методов (подпрограммы)
 *10.Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого 
  являются цифры числа N.
 */
public class Task44 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n = reader.readLine();
		System.out.println("Array\n" + Arrays.toString(fillArray(n)));
	}

	public static char[] fillArray(String n) {

		char[] a = n.toCharArray();
		for (int i : a) {
		}

		return a;
	}
}
// Enter the number n
// 9837465
// Array
// [9, 8, 3, 7, 4, 6, 5]
