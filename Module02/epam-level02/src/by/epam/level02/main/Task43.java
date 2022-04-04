package by.epam.level02.main;

/*
 * Декомпозиция с использованием методов (подпрограммы)
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
   если угол между сторонами длиной X и Y— прямой
 */
public class Task43 {

	public static void main(String[] args) {
		double x = 5;
		double y = 7;
		double z = 6;
		double t = 8;
		System.out.println("The area of the quadrilateral = " + calculateArea(x, y, z, t));

	}

	public static double calculateArea(double a, double b, double c, double d) {
		double sTriangle_abc = 0.5 * (a * b);
		double s = (a + b + c) / 2; // полупериод треугольника
		double sTriangle_acd = Math.sqrt(s * (s - a) * (s - d) * (s - c));
		double sAllFigure = sTriangle_abc + sTriangle_acd;

		return sAllFigure;
	}
}
// The area of the quadrilateral = 27.892304845413264