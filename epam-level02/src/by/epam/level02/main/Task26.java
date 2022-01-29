package by.epam.level02.main;

/*
 * 16. Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел 1, 2, 3 ...n^2
       так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между 
       собой. Построить такой квадрат. Пример магического квадрата порядка 3:

       6 1 8
       7 5 3
       2 9 4
 */
public class Task26 {

	public static void main(String[] args) {

		int[][] matrix = new int[3][3];;
		
		int x = 0; 
		int y = 0; 
		
		if (3 % 2 != 0) {
        
			for (int k = 0; k < Math.pow(3, 2); k++) {
				if (k == 0) {
					y = (matrix[0].length - 1) / 2;
					matrix[x][y] = k + 1;	
				} else if (k > 0) {
					if ((x - 1) < 0 && y < matrix[0].length - 1 ) { 
						x = matrix.length - 1;
						y++;
						matrix[x][y] = k + 1;	 
					} else if (x == 0 && y == matrix[0].length - 1 ) {
						x++;
						matrix[x][y] = k + 1;		
					} else if ((x - 1) >= 0 && (y + 1) > matrix[0].length - 1) {
						x--;
						y = 0;
						matrix[x][y] = k + 1;															
					} else if ((x - 1) >= 0 && (y + 1) <= matrix[0].length - 1  && (matrix[x - 1][y + 1] != 0 ) ) {
						x++;
						matrix[x][y] = k + 1;	
					} else if ((x - 1) >= 0 && (y + 1) <= matrix[0].length - 1  && (matrix[x - 1][y + 1] == 0 )) {
						x--;
						y++;
						matrix[x][y] = k + 1;	
						}												
					}				
				}				       					
			} 
		
		System.out.println();
        System.out.print("result is:     ");  		
		for (int i = 0; i < matrix.length; i++){ 
		    System.out.println();
			for (int j = 0; j < matrix[0].length; j++) {
			    System.out.print( matrix[i][j] + "    ");	
			}
		}													
	}

}
