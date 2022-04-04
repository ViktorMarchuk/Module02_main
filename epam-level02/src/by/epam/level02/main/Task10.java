package by.epam.level02.main;

/*
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй 
       элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать
 */
public class Task10 {

	public static void main(String[] args) {
		int[] array = { 4, 3, 6, 3, 2, 9, 7, 8, 1, 3, 3 };
		int i = 0;
		System.out.println("Result");
		for (i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				array[i] = 0;
			}
			System.out.print(array[i] + " ");
		}
	}
}
// Result
// 4 0 6 0 2 0 7 0 1 0 3 