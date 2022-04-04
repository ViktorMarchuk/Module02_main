package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади 
   треугольника.
 */
public class Task37 {

	public static void main(String[] args) {
		double a = 10;
		System.out.println("The area of the hexagon is " + findArea(a));
	}

	public static double findArea(double a) {
		double s = (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
		return s;
	}
}

// The area of the hexagon is 259.8076211353316