package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими 
   из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Task38 {

	public static void main(String[] args) {
		double[] a = { 2, 12 };
		double[] b = { 1, 4 };
		double[] c = { 2, -3 };
		double distanceAB = 0;
		double distanceBC = 0;
		double dictanceAC = 0;
		distanceAB = findDistance(a, b);
		distanceBC = findDistance(b, c);
		dictanceAC = findDistance(a, c);
		System.out.println("Distance between points A and B : " + distanceAB);
		System.out.println("Distance between points B and C : " + distanceBC);
		System.out.println("Distance between points A and C : " + dictanceAC);

		if (distanceAB > dictanceAC && distanceAB > distanceBC) {
			System.out.println("Max distence between poitns A and B ");
		}
		if (distanceBC > dictanceAC && distanceBC > distanceAB) {
			System.out.println("Max distence between poitns B and C ");
		}
		if (dictanceAC > distanceAB && dictanceAC > distanceBC) {
			System.out.println("Max distence between poitns A and C ");
		}
	}

	public static double findDistance(double[] a, double[] b) {
		double x1 = a[0];
		double x2 = a[1];
		double y1 = b[0];
		double y2 = b[1];
		double distance = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			}
		}
		return distance;
	}
}

// Distance between points A and B : 10.44030650891055
// Distance between points B and C : 5.830951894845301
// Distance between points A and C : 11.180339887498949
// Max distence beetween poitns A and C 